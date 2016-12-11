package test;

import common.Fraction;
import model.*;
import persistence.*;

import java.util.Iterator;
import java.util.Objects;

/**
 * Created by nutzer on 12/9/16.
 */
public class TestPreparations {
    /**
     * Erzeugt einen gültigen Testartikel mit einem Preis von 5€, einem Lagerbestand von mindestens 10 und maximal 100 und dem Testhersteller.
     * @return
     * @throws Exception
     */
    public static ArticleWrapper4Public createTestArticle() throws Exception {
        return createTestArticle("TestArt", new Fraction(5),10, 100, 4, createTestProducer());
    }

    /**
     * Erzeugt einen Testartikel mit angegebenen Parametern.
     * @return
     * @throws Exception
     */
    public static ArticleWrapper4Public createTestArticle(String name, Fraction price, int minStock, int maxStock, int producerDeliveryTime, Producer4Public producer) throws Exception {
        return ComponentManager.getTheComponentManager().newArticle(name, price,minStock, maxStock, producerDeliveryTime, producer);
    }

    /**
     * Erzeugt eine gültige Produktgruppe.
     * @return
     * @throws Exception
     */
    public static ProductGroup4Public createProductGroup() throws Exception {
        return createProductGroup("TestGroup");
    }

    /**
     * Erzeugt eine gültige Produktgruppe mit spezifiziertem Namen.
     * @param name Produktgruppenname.
     * @return
     * @throws Exception
     */
    public static ProductGroup4Public createProductGroup(String name) throws Exception {
        return ComponentManager.getTheComponentManager().newProductGroup(name);
    }

    /**
     * Eruegt einen Testhersteller.
     * @return
     * @throws Exception
     */
    public static Producer4Public createTestProducer() throws Exception {
        return Shop.getTheShop().createProducer("Bauer Balder");
    }

    /**
     * Erzeugt ein gültiges Kundenlieferzeit Testobjekt.
     * @return
     * @throws Exception
     */
    public static CustomerDeliveryTime4Public createCustomerDeliveryTime() throws Exception {
        return createCustomerDeliveryTime("TestCustomerDeliveryTime", new Fraction(3), 3);
    }

    /**
     * Erzeugt ein Kundenlieferzeit Testobjekt mit den mitgegeben Parametern.
     * @return
     * @throws Exception
     */
    public static CustomerDeliveryTime4Public createCustomerDeliveryTime(String name, Fraction price, int time) throws Exception {
        return CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager().createCustomerDeliveryTime(name, price, time);
    }

    /**
     * Liefert ein gültiges Kundenkonto zurück.
     * @return
     * @throws Exception
     */
    public static CustomerAccount4Public createCustomerAccount() throws Exception {
        return createCustomerAccount("TestUser", new Fraction(100), new Fraction(10));
    }

    /**
     * creates a new shopping cart.
     * @return
     * @throws Exception
     */
    public static ShoppingCart4Public createShoppingCart() throws Exception {
        return ShoppingCart.createShoppingCart();
    }

    /**
     * Erzeugt einen Warenkorbeintrag anhand der Parameter.
     * @param quantity
     * @param article
     * @return
     * @throws Exception
     */
    public static ShoppingCartQuantifiedArticle4Public createShoppingCartEntry(int quantity, ArticleWrapper4Public article) throws Exception {
        return ShoppingCartQuantifiedArticle.createShoppingCartQuantifiedArticle(quantity, article);
    }

    /**
     * Gibt einen Artikel für den Verkauf frei.
     * @param article
     * @throws Exception
     */
    public static void StartShopSelling(ArticleWrapper4Public article) throws Exception {
        Shop.getTheShop().startSelling(article);
    }

    /**
     * Erstellt einen Testbenutzer anhand des Namens, des Kundenkontostands und des Limits.
     * @param name
     * @param balance
     * @param limit
     * @return
     * @throws Exception
     */
    public static CustomerAccount4Public createCustomerAccount(String name, Fraction balance, Fraction limit) throws Exception {
        return CustomerAccount.createCustomerAccount(name, balance, limit);
    }

    /**
     * Liefert die Liste aller aktuellen Komponenten zurück.
     * @return
     * @throws Exception
     */
    public static ComponentContainerImplementation_ComponentsProxi getComponentList() throws Exception {
        return ((PersistentComponentManager)ComponentManager.getTheComponentManager()).getContainer().getComponents();
    }

    /**
     * Liefert die Liste aller Komponenten, die innerhalb der mitgegeben Gruppe sind, zurück.
     * @param group
     * @return
     * @throws Exception
     */
    public static ComponentContainerImplementation_ComponentsProxi getComponentList(ProductGroup4Public group) throws Exception {
        return ((PersistentProductGroup)group).getContainer().getComponents();
    }

    /**
     * Liefert die Liste aller aktuellen Kundenlieferzeit-Objekte.
     * @return
     * @throws Exception
     */
    public static CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi getCustomerDeliveryTimes() throws Exception {
        return CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager().getCustomerDeliveryTimes();
    }

    /**
     * Liefert die Liste aller Bestellungen zurück.
     * @param orderManager
     * @return
     * @throws Exception
     */
    public static OrderManager_OrdersProxi getOrders(CustomerOrderManager4Public orderManager) throws Exception {
        return orderManager.getOrders();
    }

}
