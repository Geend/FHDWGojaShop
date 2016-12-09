package test;

import common.Fraction;
import model.ComponentContainerImplementation;
import model.ComponentManager;
import model.Shop;
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
        return ComponentManager.getTheComponentManager().newArticle("TestArt", new Fraction(5),10, 100, 4, createTestProducer());
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
     * Liefert einen Iterator auf der Liste aller aktuellen Komponenten zurück.
     * @return
     * @throws Exception
     */
    public static Iterator<Component4Public> getComponentList() throws Exception {
        return ((PersistentComponentManager)ComponentManager.getTheComponentManager()).getContainer().getComponents().iterator();
    }
}
