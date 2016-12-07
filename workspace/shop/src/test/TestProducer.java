package test;

import model.DoubleDefinitionException;
import model.OwnerService;
import model.ProducerLst;
import model.Server;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import persistence.Cache;
import persistence.OwnerService4Public;
import persistence.PersistenceException;
import persistence.PersistentServer;
import persistence.Producer4Public;
import persistence.Server4Public;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.fail;

/**
 * Created by A13531 on 05.12.2016.
 */
public class TestProducer {

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


    @Test
    public void testCreateProducer() throws Exception {
        Producer4Public producer4Public = ProducerLst.getTheProducerLst().createProducer("Test");
        Assert.assertEquals(producer4Public,  ProducerLst.getTheProducerLst().getCurrentProducer().getList().iterator().next());
    }

    @Test
    public void testCreateProducerWithSameName() throws Exception {
        exception.expect(DoubleDefinitionException.class);
        ProducerLst.getTheProducerLst().createProducer("Test");
        ProducerLst.getTheProducerLst().createProducer("Test");
    }
}
