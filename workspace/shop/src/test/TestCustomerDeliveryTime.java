package test;

import common.Fraction;
import model.*;
import org.junit.*;
import org.junit.rules.ExpectedException;
import persistence.*;

import java.util.Iterator;

import static test.TestPreparations.createCustomerDeliveryTime;

/**
 * Created by nutzer on 12/10/16.
 */
public class TestCustomerDeliveryTime {

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
     * Testfall zum Anlegen einer gültigen Kundenlieferzeit.
     * @throws Exception
     */
    @Test
    public void CreateCustomerDeliveryTimeTest() throws Exception {
        CustomerDeliveryTime4Public cdt = TestPreparations.createCustomerDeliveryTime();
        Iterator<CustomerDeliveryTime4Public> itr = TestPreparations.getCustomerDeliveryTimes().iterator();
        while (itr.hasNext()) {
            if(Long.compare(cdt.getId(), itr.next().getId()) == 0)
                return;
        }
        assert false;
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eine Kundenlieferzeit mit leerem Namen anzulegen.
     * @throws Exception
     */
    @Test
    public void CreateCustomerDeliveryTimeEmptyNameTest() throws Exception {
        exception.expect(InvalidInputException.class);
        TestPreparations.createCustomerDeliveryTime("", new Fraction(1), 1);
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eine Kundenlieferzeit mit negativem Preis anzulegen.
     * @throws Exception
     */
    @Test
    public void CreateCustomerDeliveryTimeInvalidPriceTest() throws Exception {
        exception.expect(InvalidInputException.class);
        TestPreparations.createCustomerDeliveryTime("Hi", new Fraction(-1), 1);
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eine Kundenlieferzeit mit ungültiger Zeit anzulegen.
     * @throws Exception
     */
    @Test
    public void CreateCustomerDeliveryTimeInvalidTimeTest() throws Exception {
        exception.expect(InvalidInputException.class);
        TestPreparations.createCustomerDeliveryTime("Hi", new Fraction(1), -1);
    }

    /**
     * Die Kundenlieferzeit darf keinen Preis bekommen, der ungültig ist.
     * @throws Exception
     */
    @Test
    public void ChangeCustomerDeliveryTimeInvalidPriceTest() throws Exception {
        exception.expect(InvalidInputException.class);
        TestPreparations.createCustomerDeliveryTime("Hi", new Fraction(1), 1);
        TestPreparations.getCustomerDeliveryTimes().applyToAllException(c -> {
            Shop.getTheShop().changeCustomerDeliveryTimePrice(c, new Fraction(-1));
        });
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch die Lieferzeit einer Kundenlieferzeit ungültig zu verändern.
     * @throws Exception
     */
    @Test
    public void ChangeCustomerDeliveryTimeInvalidTimeTest() throws Exception {
        exception.expect(InvalidInputException.class);
        TestPreparations.createCustomerDeliveryTime("Hi", new Fraction(1), 1);
        TestPreparations.getCustomerDeliveryTimes().applyToAllException(c ->
        {
            Shop.getTheShop().changeCustomerDeliveryTimeTime(c, -1);
        });
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eine Kundenlieferzeit anzulegen, die es mit dem gleichen Namen schon gibt.
     * @throws Exception
     */
    @Test
    public void CreateCustomerDeliveryTimeSameNameTest() throws Exception {
        exception.expect(DoubleDefinitionException.class);
        TestPreparations.createCustomerDeliveryTime("Hi", new Fraction(1), 1);
        TestPreparations.createCustomerDeliveryTime("Hi", new Fraction(2), 2);
    }


    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch die Lieferzeit einer Kundenlieferzeit auf einen Wert zu setzen, den es in einem anderen Kundenlieferzeit Objekt schon gibt.
     * @throws Exception
     */
    @Test
    public void ChangeCustomerDeliveryTimeExistTimeTest() throws Exception {
        exception.expect(InvalidInputException.class);
        TestPreparations.createCustomerDeliveryTime("Hallo", new Fraction(1), 4);
        TestPreparations.createCustomerDeliveryTime("Hullo", new Fraction(3), 1);

        TestPreparations.getCustomerDeliveryTimes().applyToAllException(c -> {
            if(c.getName().equals("Hallo"))
                Shop.getTheShop().changeCustomerDeliveryTimeTime(c, 1);
        });
    }

}
