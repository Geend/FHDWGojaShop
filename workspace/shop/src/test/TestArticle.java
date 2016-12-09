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
        Producer4Public producer = ProducerLst.getTheProducerLst().createProducer("Test");
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("TestArt", new Fraction(5),10, 100, 4, producer);
        ArticleWrapper4Public testArt2 = ComponentManager.getTheComponentManager().newArticle("TestArt", new Fraction(5),10, 100, 4, producer);
    }

    /**
     * Testfall zum Anlegen eines Artikels mit einer leeren Bezeichnung.
     * @throws Exception
     */
    @Test
    public void EmptyArticleNameTest() throws Exception {
        exception.expect(EmptyDefinitionException.class);
        Producer4Public producer = ProducerLst.getTheProducerLst().createProducer("Test");
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("", new Fraction(5),10, 100, 4, producer);
        ArticleWrapper4Public testArt2 = ComponentManager.getTheComponentManager().newArticle(" ", new Fraction(5),10, 100, 4, producer);
    }

    /**
     * Testfall zum Anlegen zweier Produktgruppen mit derselben Bezeichnung unter einem Hersteller.
     * @throws Exception
     */
    @Test
    public void DoubleProductGroupNameTest() throws Exception {
        exception.expect(DoubleDefinitionException.class);
        Producer4Public producer = ProducerLst.getTheProducerLst().createProducer("Test");
        String groupName = "TestGrp";
        ProductGroup4Public testGr1 = ComponentManager.getTheComponentManager().newProductGroup(groupName);
        ProductGroup4Public testGr2 = ComponentManager.getTheComponentManager().newProductGroup(groupName);
    }

    /**
     * Testfall zum Anlegen einer Produktgruppen mit einer leeren Bezeichnung.
     * @throws Exception
     */
    @Test
    public void EmptyProductGroupNameTest() throws Exception {
        exception.expect(EmptyDefinitionException.class);
        Producer4Public producer = ProducerLst.getTheProducerLst().createProducer("Test");
        ProductGroup4Public testGr1 = ComponentManager.getTheComponentManager().newProductGroup("");
        ProductGroup4Public testGr2 = ComponentManager.getTheComponentManager().newProductGroup(" ");
    }

    /**
     * Testfall zum Ändern einer Artikelbezeichnung.
     * @throws Exception
     */
    @Test
    public void ChangeArticleNameTest() throws Exception {
        String newName = "Brot";
        Producer4Public producer = ProducerLst.getTheProducerLst().createProducer("Test");
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("Toast", new Fraction(5),10, 100, 4, producer);
        Shop.getTheShop().changeArticleName(testArt1, newName);
        Assert.assertEquals(newName, testArt1.getName());
    }

    /**
     * Testfall zum Verschieben eines Artikels von einer Produktgruppe in eine andere.
     * @throws Exception
     */
    @Test
    public void MoveArticelToOtherProductGroupTest() throws Exception {
        Producer4Public producer = ProducerLst.getTheProducerLst().createProducer("Test");
        ArticleWrapper4Public testArt1 = ComponentManager.getTheComponentManager().newArticle("Toast", new Fraction(5),10, 100, 4, producer);
        ProductGroup4Public testProdGruppe1 = ComponentManager.getTheComponentManager().newProductGroup("ProduktgruppeTest");
        testArt1.moveTo(testProdGruppe1);
        assert false;
        //TODO! Test product group has moved Assert.assertEquals(testProdGruppe1.getName(), ComponentManager.getTheComponentManager().);
    }
}
