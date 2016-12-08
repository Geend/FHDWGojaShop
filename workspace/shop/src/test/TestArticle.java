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

import persistence.Article4Public;
import persistence.ArticleWrapper4Public;
import persistence.Cache;
import persistence.PersistenceException;
import persistence.Producer4Public;

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
    }
}
