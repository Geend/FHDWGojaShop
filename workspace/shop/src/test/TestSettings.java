package test;

import common.Fraction;
import model.InvalidInputException;
import model.Settings;
import model.Shop;
import org.junit.*;
import org.junit.rules.ExpectedException;
import persistence.Cache;
import persistence.PersistenceException;

/**
 * Created by nutzer on 12/10/16.
 */
public class TestSettings {
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
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch das Kundenkontolimit negativ zu setzen.
     * @throws Exception
     */
    @Test
    public void CustomerLimitBalanceInvalidTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Settings.getTheSettings().setNewCustomerDefaultBalance(new Fraction(-1));
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch den Kundenkontostartbetrag negativ zu setzen.
     * @throws Exception
     */
    @Test
    public void CustomerDefaultBalanceInvalidTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Settings.getTheSettings().setNewCustomerDefaultLimit(new Fraction(-1));
    }

    /**
     * Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch das den Retour-Prozentsatz negativ zu setzen.
     * @throws Exception
     */
    @Test
    public void CustomerInvalidRetourPercentageTest() throws Exception {
        exception.expect(InvalidInputException.class);
        Settings.getTheSettings().setReturnPercentage(new Fraction(-1));
    }

}
