package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import persistence.Cache;
import persistence.PersistenceException;

/**
 * Created by nutzer on 12/9/16.
 */
public class TestSzenario {
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
}
