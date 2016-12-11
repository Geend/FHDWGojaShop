package test;

import common.Fraction;
import constants.ShopConstants;
import model.*;
import org.junit.*;
import org.junit.rules.ExpectedException;
import persistence.*;

import java.math.BigInteger;

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

    /**
     * In diesem Szenario wird folgendes passieren:
     - Ein Kundenkonto wird angelegt (100€)
     - Ein Produzent wird erzeugt (Bauer Balder)
     - Ein Artikel wird erzeugt (Erdbeere, 0.05€, Produktlieferzeit: 2, Mindestlagerbestand: 100, Maximallagerbestand: 10000, Produzent: Bauer Balder)
     - Der Artikel wird für den Verkauf freigegeben
     - Zwei Tage warten, bis das Lager gefüllt wurde
     - ein Warenkorb wird erzeugt
     - Der Artikel wird in den Wahrenkorb gelegt (Anzahl: 1000)
     - Eine Kundenlieferzeit wird angelegt (Supertransport, Zeit: 3, Preis: 2€)
     - Der Artikel wird bestellt (Supertransport)
     - Der Preis des Artikels wird auf 0,10€ erhöht
     - Der Artikel wird versendet
     - Der Artikel wird vom Kunden angenommen

     Das wird kontrolliert
     - Es wurden vom Kundenkonto exakt 52€ (Preis + Versand) abgezogen

     * @throws Exception
     */
    @Test
    public void priceChangeSzenario() throws Exception {
        CustomerAccount4Public customer = TestPreparations.createCustomerAccount("TestUser", new Fraction(100), new Fraction(0));
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public article = TestPreparations.createTestArticle("Erdbeere", new Fraction(new BigInteger("1"), new BigInteger("20")), 100, 10000, 2, producer);
        TestPreparations.StartShopSelling(article);
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        ShoppingCart4Public sh = TestPreparations.createShoppingCart();
        ShoppingCartQuantifiedArticle4Public shE = TestPreparations.createShoppingCartEntry(1000, article);
        sh.addArticle(shE);
        CustomerDeliveryTime4Public ctd = TestPreparations.createCustomerDeliveryTime("Supertransport", new Fraction(2), 3);
        CustomerOrderManager4Public customerOrderManager = CustomerOrderManager.createCustomerOrderManager(customer);
        Order4Public o = customerOrderManager.newOrder(sh, ctd);
        Shop.getTheShop().changeArticlePrice(article, new Fraction(new BigInteger("1"), new BigInteger("10")));
        GlobalOrderManager.getTheGlobalOrderManager().step();
        GlobalOrderManager.getTheGlobalOrderManager().step();
        GlobalOrderManager.getTheGlobalOrderManager().step();
        Shop.getTheShop().acceptOrder(customerOrderManager, o);
        Assert.assertEquals(new Fraction(48), customer.getBalance());
    }

    /**
     * In diesem Szenario wird folgendes passieren:
     - Ein Kundenkonto wird angelegt (100€)
     - Ein Produzent wird erzeugt (Bauer Balder)
     - Ein Artikel wird erzeugt (Erdbeere, 0.05€, Produktlieferzeit: 2, Mindestlagerbestand: 10, Maximallagerbestand: 100, Produzent: Bauer Balder)
     - Der Artikel wird für den Verkauf freigegeben
     - Zwei Tage warten, bis das Lager gefüllt wurde
     - ein Warenkorb wird erzeugt
     - Der Artikel wird in den Wahrenkorb gelegt (Anzahl: 101)
     - Eine Kundenlieferzeit wird angelegt (Supertransport, Zeit: 3, Preis: 2€)
     - Der Artikel wird bestellt (Supertransport)

     Danach sollte eine Fehlermeldung erscheinen, da diese Aktion nicht erlaubt ist.
     * @throws Exception
     */
    @Test
    public void warehouseSzenario1() throws Exception {
        exception.expect(NotEnoughStockException.class);
        CustomerAccount4Public customer = TestPreparations.createCustomerAccount("TestUser", new Fraction(100), new Fraction(0));
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public article = TestPreparations.createTestArticle("Erdbeere", new Fraction(new BigInteger("1"), new BigInteger("20")), 10, 100, 2, producer);
        TestPreparations.StartShopSelling(article);
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        ShoppingCart4Public sh = TestPreparations.createShoppingCart();
        ShoppingCartQuantifiedArticle4Public shE = TestPreparations.createShoppingCartEntry(101, article);
        sh.addArticle(shE);
        CustomerDeliveryTime4Public ctd = TestPreparations.createCustomerDeliveryTime("Supertransport", new Fraction(2), 3);
        CustomerOrderManager4Public customerOrderManager = CustomerOrderManager.createCustomerOrderManager(customer);
        customerOrderManager.newOrder(sh, ctd);
    }

    /**
     * In diesem Szenario wird folgendes passieren:
     - Ein Kundenkonto wird angelegt (200€)
     - Ein Produzent wird erzeugt (Bauer Balder)
     - Ein Artikel wird erzeugt (Erdbeere, 1€, Produktlieferzeit: 2, Mindestlagerbestand: 10, Maximallagerbestand: 100, Produzent: Bauer Balder)
     - Der Artikel wird für den Verkauf freigegeben
     - Zwei Tage warten, bis das Lager gefüllt wurde
     - ein Warenkorb wird erzeugt
     - Der Artikel wird in den Wahrenkorb gelegt (Anzahl: 101)
     - Eine Kundenlieferzeit wird angelegt (Supertransport, Zeit: 3, Preis: 2€)
     - Der Artikel wird vorbestellt (Supertransport)
     - Zwei Tage warten, bis die Nachbestellung eingetroffen ist
     - Der Artikel wird versendet
     - Drei Tage warten
     - Der Artikel wird angenommen

     Es sind danach genau 100 Artikel im Lager und der Kunde hat nur noch 97€ auf dem Konto.
     * @throws Exception
     */
    @Test
    public void warehouseSzenario2() throws Exception {
        CustomerAccount4Public customer = TestPreparations.createCustomerAccount("TestUser", new Fraction(200), new Fraction(0));
        Producer4Public producer = TestPreparations.createTestProducer();
        ArticleWrapper4Public article = TestPreparations.createTestArticle("Erdbeere", new Fraction(1), 10, 100, 2, producer);
        TestPreparations.StartShopSelling(article);
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        ShoppingCart4Public sh = TestPreparations.createShoppingCart();
        ShoppingCartQuantifiedArticle4Public shE = TestPreparations.createShoppingCartEntry(101, article);
        sh.addArticle(shE);
        CustomerDeliveryTime4Public ctd = TestPreparations.createCustomerDeliveryTime("Supertransport", new Fraction(2), 3);
        CustomerOrderManager4Public customerOrderManager = CustomerOrderManager.createCustomerOrderManager(customer);
        Order4Public c = customerOrderManager.newPreOrder(sh, ctd);
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        Shop.getTheShop().acceptOrder(customerOrderManager, c);
        Assert.assertEquals(100, article.getArticle().getCurrentStock());
        Assert.assertEquals(new Fraction(97), customer.getBalance());
    }

    /**
     * In diesem Szenario wird folgendes passieren:
     - Ein Kundenkonto wird angelegt (200€)
     - Ein Produzent wird erzeugt (Bauer Balder)
     - Der Retourprozentwert wird auf 10% eingestellt (1/10)
     - Ein Artikel wird erzeugt (Erdbeere, 1€, Produktlieferzeit: 2, Mindestlagerbestand: 10, Maximallagerbestand: 100, Produzent: Bauer Balder)
     - Der Artikel wird für den Verkauf freigegeben
     - Zwei Tage warten, bis das Lager gefüllt wurde
     - ein Warenkorb wird erzeugt
     - Der Artikel wird in den Wahrenkorb gelegt (Anzahl: 10)
     - Eine Kundenlieferzeit wird angelegt (Supertransport, Zeit: 3, Preis: 2€)
     - Der Artikel wird bestellt (Supertransport)
     - Der Retourprozentwert wird auf 20% erhöht (1/5)
     - Der Artikel wird versendet
     - Ein Tag warten
     - Den Artikel als Retour markieren
     - Zwei Tage warten
     - Der Artikel wird angenommen (als Retour zurückgeschickt)
     - Fünf Tage warten (je nach dem, was in der ShopConstant eingestellt ist)

     Das Lager ist wieder entsprechend gefüllt (Anzahl: 100), das Kundenkonto hat
     200€ - 10 * 1€ * 0.1 = 199€, da es von dem geänderten Retourprozentwert nicht betroffen ist.
     * @throws Exception
     */
    @Test
    public void retourSzenario1() throws Exception {
        CustomerAccount4Public customer = TestPreparations.createCustomerAccount("TestUser", new Fraction(200), new Fraction(0));
        Producer4Public producer = TestPreparations.createTestProducer();
        Settings.getTheSettings().changeReturnPercentage(new Fraction(new BigInteger("1"), new BigInteger("10")));
        ArticleWrapper4Public article = TestPreparations.createTestArticle("Erdbeere", new Fraction(1), 10, 100, 2, producer);
        TestPreparations.StartShopSelling(article);
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        ShoppingCart4Public sh = TestPreparations.createShoppingCart();
        ShoppingCartQuantifiedArticle4Public shE = TestPreparations.createShoppingCartEntry(10, article);
        sh.addArticle(shE);
        CustomerDeliveryTime4Public ctd = TestPreparations.createCustomerDeliveryTime("Supertransport", new Fraction(2), 3);
        CustomerOrderManager4Public customerOrderManager = CustomerOrderManager.createCustomerOrderManager(customer);
        Order4Public c = customerOrderManager.newOrder(sh, ctd);
        Settings.getTheSettings().changeReturnPercentage(new Fraction(new BigInteger("1"), new BigInteger("5")));
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        c.getArticles().applyToAllException(ar -> {
            ar.markForReturn();
        });
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        Shop.getTheShop().acceptOrder(customerOrderManager, c);
        for (int i = 0; i <= ShopConstants.DEFAULT_RETURN_TIME; i++) {
            BackgroundTaskManager.getTheBackgroundTaskManager().step();
        }
        Assert.assertEquals(100, article.getArticle().getCurrentStock());
        Assert.assertEquals(new Fraction(199), customer.getBalance());
    }

    /**
     * In diesem Szenario wird folgendes passieren:
     - Ein Kundenkonto wird angelegt (200€)
     - Ein Produzent wird erzeugt (Bauer Balder)
     - Der Retourprozentwert wird auf 10% eingestellt (1/10)
     - Ein Artikel wird erzeugt (Erdbeere, 1€, Produktlieferzeit: 2, Mindestlagerbestand: 10, Maximallagerbestand: 100, Produzent: Bauer Balder)
     - Noch ein Artikel wird erzeugt (Banane, 2€, Produktlieferzeit: 2, Mindestlagerbestand: 10, Maximallagerbestand: 100, Produzent: Bauer Balder)
     - Beide Artikel werden für den Verkauf freigegeben
     - Zwei Tage warten, bis das Lager gefüllt wurde
     - ein Warenkorb wird erzeugt
     - Der Artikel "Erdbeere" wird in den Wahrenkorb gelegt (Anzahl: 10)
     - Der Artikel "Banane" wird in den Wahrenkorb gelegt (Anzahl: 10)
     - Eine Kundenlieferzeit wird angelegt (Supertransport, Zeit: 3, Preis: 2€)
     - Der Warenkorb wird bestellt (Supertransport)
     - Beide Artikel werden versendet
     - Ein Tag warten
     - Den Artikel "Banane" als Retour markieren
     - Zwei Tage warten
     - Die Bestellung annehmen (Retour wird zurückgeschickt)
     - Fünf Tage warten (je nach dem, was in der ShopConstant eingestellt ist)

     Auf dem Kundenkonto sind 200€ - 10 * 1€ - 10 * 2€ * 0.1 = 188€
     * @throws Exception
     */
    @Test
    public void retourSzenario2() throws Exception {
        CustomerAccount4Public customer = TestPreparations.createCustomerAccount("TestUser", new Fraction(200), new Fraction(0));
        Producer4Public producer = TestPreparations.createTestProducer();
        Settings.getTheSettings().changeReturnPercentage(new Fraction(new BigInteger("1"), new BigInteger("10")));
        ArticleWrapper4Public erdbeere = TestPreparations.createTestArticle("Erdbeere", new Fraction(1), 10, 100, 2, producer);
        ArticleWrapper4Public banane = TestPreparations.createTestArticle("Banane", new Fraction(2), 10, 100, 2, producer);
        TestPreparations.StartShopSelling(erdbeere);
        TestPreparations.StartShopSelling(banane);
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        ShoppingCart4Public sh = TestPreparations.createShoppingCart();
        ShoppingCartQuantifiedArticle4Public shE = TestPreparations.createShoppingCartEntry(10, erdbeere);
        ShoppingCartQuantifiedArticle4Public shB = TestPreparations.createShoppingCartEntry(10, banane);
        sh.addArticle(shE);
        sh.addArticle(shB);
        CustomerDeliveryTime4Public ctd = TestPreparations.createCustomerDeliveryTime("Supertransport", new Fraction(2), 3);
        CustomerOrderManager4Public customerOrderManager = CustomerOrderManager.createCustomerOrderManager(customer);
        Order4Public c = customerOrderManager.newOrder(sh, ctd);
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        c.getArticles().applyToAllException(ar -> {
            if (Long.compare(ar.getArticle().getId(), banane.getArticle().getId()) == 0)
                ar.markForReturn();
        });
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        BackgroundTaskManager.getTheBackgroundTaskManager().step();
        Shop.getTheShop().acceptOrder(customerOrderManager, c);
        for (int i = 0; i <= ShopConstants.DEFAULT_RETURN_TIME; i++) {
            BackgroundTaskManager.getTheBackgroundTaskManager().step();
        }
        Assert.assertEquals(new Fraction(188), customer.getBalance());
    }
}
