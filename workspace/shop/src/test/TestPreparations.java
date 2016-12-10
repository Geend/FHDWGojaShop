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
     * Liefert einen Iterator auf der Liste aller aktuellen Komponenten zurück.
     * @return
     * @throws Exception
     */
    public static Iterator<Component4Public> getComponentList() throws Exception {
        return ((PersistentComponentManager)ComponentManager.getTheComponentManager()).getContainer().getComponents().iterator();
    }

    /**
     * Liefert einen Iterator auf der Liste aller Komponenten, die innerhalb der mitgegeben Gruppe sind, zurück.
     * @param group
     * @return
     * @throws Exception
     */
    public static Iterator<Component4Public> getComponentList(ProductGroup4Public group) throws Exception {
        return ((PersistentProductGroup)group).getContainer().getComponents().iterator();
    }

    /**
     * Liefert einen Iterator auf der Liste aller aktuellen Kundenlieferzeit-Objekte.
     * @return
     * @throws Exception
     */
    public static Iterator<CustomerDeliveryTime4Public> getCustomerDeliveryTimes() throws Exception {
        return CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager().getCustomerDeliveryTimes().iterator();
    }
}
