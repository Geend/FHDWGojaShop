package test;

import common.Fraction;
import model.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import persistence.*;

import java.util.Iterator;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by A13531 on 05.12.2016.
 */
public class TestArticle {

    @BeforeClass
    public static void initialiseFramework() {
        try {
            TestSupport.prepareDatabase();
        } catch (PersistenceException e) {
            throw new Error(e);
        }
    }

    @AfterClass
    public static void clearDataBase() {
        try {
            TestSupport.clearDatabase();
        } catch (PersistenceException e) {
            throw new Error(e);
        }
    }

    @Before
    public void initialiseTest() {
        try {
            TestSupport.clearDatabase();
            TestSupport.prepareSingletons();
            Cache.getTheCache().reset$For$Test();

        } catch (PersistenceException e) {
            throw new Error(e);
        }
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    /**
     * Testfall zum Anlegen zweier Artikel mit derselben Bezeichnung unter einem Hersteller.
     * @throws Exception
     */
    @Test
    public void DoubleArticleNameTest() throws Exception {
        exception.expect(DoubleDefinitionException.class);
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public testArt1 = TestPreparations.createTestArticle("TestArt", new Fraction(5),10, 100, 4, producer);
        ArticleWrapper4Public testArt2 = TestPreparations.createTestArticle("TestArt", new Fraction(5),10, 100, 4, producer);
    }

    /**
     * Testfall zum Anlegen eines Artikels mit einer leeren Bezeichnung.
     * @throws Exception
     */
    @Test
    public void EmptyArticleNameTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public testArt1 = TestPreparations.createTestArticle("", new Fraction(5),10, 100, 4, producer);
        ArticleWrapper4Public testArt2 = TestPreparations.createTestArticle(" ", new Fraction(5),10, 100, 4, producer);
    }

    /**
     * Testfall zum Anlegen zweier Produktgruppen mit derselben Bezeichnung unter einem Hersteller.
     * @throws Exception
     */
    @Test
    public void DoubleProductGroupNameTest() throws Exception {
        exception.expect(DoubleDefinitionException.class);
        String groupName = "TestGrp";
        ProductGroup4Public testGr1 = TestPreparations.createProductGroup(groupName);
        ProductGroup4Public testGr2 = TestPreparations.createProductGroup(groupName);
    }

    /**
     * Testfall zum Anlegen einer Produktgruppen mit einer leeren Bezeichnung.
     * @throws Exception
     */
    @Test
    public void EmptyProductGroupNameTest() throws Exception {
        exception.expect(InvalidInputException.class);
        ProductGroup4Public testGr1 = TestPreparations.createProductGroup("");
        ProductGroup4Public testGr2 = TestPreparations.createProductGroup(" ");
    }

    /**
     * Testfall zum Ändern einer Artikelbezeichnung.
     * @throws Exception
     */
    @Test
    public void ChangeArticleNameTest() throws Exception {
        String newName = "Brot";
        ArticleWrapper4Public testArt1 = TestPreparations.createTestArticle();
        Shop.getTheShop().changeArticleName(testArt1, newName);
        Assert.assertEquals(newName, testArt1.getName());
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch einer Artikelbezeichnung einen leeren Text zuzuweisen.
     * @throws Exception
     */
    @Test
    public void ChangeToEmptyArticleNameTest() throws Exception {
        exception.expect(InvalidInputException.class);
        String newName = "";
        ArticleWrapper4Public article = TestPreparations.createTestArticle();
        Shop.getTheShop().changeArticleName(article, newName);
    }

    /**
     * Testfall zum Verschieben eines Artikels von einer Produktgruppe in eine andere.
     * @throws Exception
     */
    @Test
    public void MoveArticleToOtherProductGroupTest() throws Exception {
        ArticleWrapper4Public testArt1 = TestPreparations.createTestArticle();
        ProductGroup4Public testProdGruppe1 = TestPreparations.createProductGroup("ProduktgruppeTest");
        testArt1.moveTo(testProdGruppe1);
        Iterator<Component4Public> itr = TestPreparations.getComponentList(testProdGruppe1);
        while (itr.hasNext()) {
            Component4Public comp = itr.next();
            if (comp instanceof ArticleWrapperListEntryProxi) {
                PersistentArticleWrapper art = (PersistentArticleWrapper)comp;
                if(Long.compare(art.getId(), testArt1.getId()) == 0)
                    return;
            }
        }
        assert false;
    }

    /**
     * Testfall zum Verschieben einer Produktgruppe in eine andere.
     * @throws Exception
     */
    @Test
    public void MoveProductGroupTest() throws Exception {
        ProductGroup4Public testProdGruppe1 = TestPreparations.createProductGroup();
        ProductGroup4Public testRootGroup = TestPreparations.createProductGroup("rootGroup");
        testProdGruppe1.moveTo(testRootGroup);
        Iterator<Component4Public> itr = TestPreparations.getComponentList(testRootGroup);
        while (itr.hasNext()) {
            Component4Public comp = itr.next();
            if (comp instanceof ProductGroupListEntryProxi) {
                PersistentProductGroup group = (PersistentProductGroup)comp;
                if(Long.compare(group.getId(), testProdGruppe1.getId()) == 0)
                    return;
            }
        }
        assert false;
    }

    /**
     * Testfall zum Verschieben einer Produktgruppe in eine untergeordnete Gruppe dieser Produktgruppe. Es sollte eine Exception ausgelöst werden, da dieses Vorgehen so nicht möglich ist.
     * @throws Exception
     */
    @Test
    public void MoveProductGroupToChildTest() throws Exception {
        exception.expect(InvalidMoveException.class);
        ProductGroup4Public rootGroup = TestPreparations.createProductGroup("rootGroup");
        ProductGroup4Public childGroup = TestPreparations.createProductGroup("childGroup");
        rootGroup.addComponent(childGroup);
        rootGroup.moveTo(childGroup);
    }

    /**
     * Testfall zum Anlegen eines Artikels und anschließenden Ändern des Preises.
     * @throws Exception
     */
    @Test
    public void CreateArticleAndChangePrice() throws Exception {
        Fraction preis = new Fraction(5);
        Fraction neuPreis = new Fraction(11);
        ArticleWrapper4Public testArt1 = TestPreparations.createTestArticle("Toast", preis,10, 100, 4, TestPreparations.createTestProducer());
        Shop.getTheShop().changeArticlePrice(testArt1, neuPreis);
        Assert.assertEquals(neuPreis, testArt1.getPrice());
    }

    /**
     * Testfall zum Überprüfen des Preises, da dieser nicht negativ sein darf.
     * @throws Exception
     */
    @Test
    public void NegativeArticlePriceTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Fraction preis = new Fraction(-5);
        ArticleWrapper4Public testArt1 = TestPreparations.createTestArticle("Toast", preis,10, 100, 4, TestPreparations.createTestProducer());
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch einem Artikelpreis einen negativen Wert zuzuweisen.
     * @throws Exception
     */
    @Test
    public void ChangeToNegativeArticlePriceTest() throws Exception {
        exception.expect(InvalidInputException.class);
        ArticleWrapper4Public article = TestPreparations.createTestArticle();
        Shop.getTheShop().changeArticlePrice(article, new Fraction(-10));
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel eine negative Lieferzeit zuzuweisen.
     * @throws Exception
     */
    @Test
    public void CreateArticleWithNegativeDeliveryTimeTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("Toast", new Fraction(3),10, 100, -3, producer);
    }

    /**
     * Testfall zum Ändern der Lieferzeit des Artikels ins Negative.
     * @throws Exception
     */
    @Test
    public void ChangeArticleDeliveryTimeNegativeTest() throws Exception {
        exception.expect(InvalidInputException.class);
        ArticleWrapper4Public article = TestPreparations.createTestArticle();
        article.getArticle().setProducerDeliveryTime(-3);
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel eine Lieferzeit von 0 zuzuweisen.
     * @throws Exception
     */
    @Test
    public void CreateArticleWithZeroDeliveryTimeTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("Toast", new Fraction(3),10, 100, 0, producer);
    }

    /**
     * Testfall zum Ändern der Lieferzeit des Artikels zu 0.
     * @throws Exception
     */
    @Test
    public void ChangeArticleDeliveryTimeZeroTest() throws Exception {
        exception.expect(InvalidInputException.class);
        ArticleWrapper4Public article = TestPreparations.createTestArticle();
        article.getArticle().setProducerDeliveryTime(0);
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen negativen Mindestlagerbestand zuzuweisen.
     * @throws Exception
     */
    @Test
    public void CreateNegativeArticleMinStockTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("Toast", new Fraction(3),-5, 100, 0, producer);
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen negativen Maximallagerbestand zuzuweisen.
     * @throws Exception
     */
    @Test
    public void CreateNegativeArticleMaxStockTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("Toast", new Fraction(3),3, -3, 0, producer);
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen Maximallagerbestand zuzuweisen, der kleiner ist als sein Mindestlagerbestand.
     * @throws Exception
     */
    @Test
    public void CreateArticleWithInvalidStockTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("Toast", new Fraction(3),4, 3, 0, producer);
    }

    /**
     * Testfall zum Verschieben einer Produktgruppe in sich selbst. Es sollte eine Exception ausgelöst werden, da dieses Vorgehen so nicht sinnvoll ist.
     * @throws Exception
     */
    @Test
    public void MoveProductGroupIntoItselfTest() throws Exception {
        exception.expect(InvalidMoveException.class);
        ProductGroup4Public rootGroup = TestPreparations.createProductGroup("root");
        rootGroup.moveTo(rootGroup);
    }

}
