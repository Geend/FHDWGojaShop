package test;

import common.Fraction;
import model.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import persistence.Article4Public;
import persistence.Cache;
import persistence.CustomerAccount4Public;
import persistence.CustomerOrderManager4Public;
import persistence.CustomerOrderManagerListEntryProxi;
import persistence.PersistenceException;
import persistence.Producer4Public;
import persistence.ShoppingCart4Public;

/**
 * Created by A13531 on 05.12.2016.
 */
public class TestOrdering {

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


            customerAccount = CustomerAccount.createCustomerAccount("TestCustomer", new Fraction(1000), new Fraction(0));
            orderManager = CustomerOrderManager.createCustomerOrderManager(customerAccount);


            testProducer = ProducerLst.getTheProducerLst().createProducer("Test");
            testArt = Article.createArticle("TestArt", new Fraction(5),10, 100, 4, testProducer);

        } catch (PersistenceException e) {
            throw new Error(e);
        } catch (DoubleDefinitionException e) {
            e.printStackTrace();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    private CustomerAccount4Public customerAccount;
    private CustomerOrderManager4Public orderManager;

    private Producer4Public testProducer;
    private Article4Public testArt;

}
