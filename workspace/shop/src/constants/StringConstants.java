package constants;

/**
 * Created by A13531 on 08.12.2016.
 */
public class StringConstants {


    public static final String ARTICLE_NOT_IN_SALE_EXCEPTION_MESSAGE = "Der Artikel befindet sich nicht im Verkauf!";
    public static final String NOT_ENOUGH_STOCK_EXCEPTION_MESSAGE = "Nur {0} der benötigten {1} Artikel vorhanden!";
    public static final String ARTICLE_DOUBLE_DEFINITION_EXCEPTION_MESSAGE = "Artikel mit dem selben Namen und Hersteller existiert bereits!";
    public static final String ARTICLE_NAME_EMPTY_DEFINTION_EXCEPTION_TEXT = "Artikel Name darf nicht leer sein!";
    public static final String PRODUCT_GROUP_NAME_EMPTY_DEFINTION_EXCEPTION_TEXT = "Produktgruppen Name darf nicht leer sein!";
    public static final String PRODUCT_GROUP_DOUBLE_DEFINITION_EXCEPTION_MESSAGE = "Produktgruppe in dieser Produktgruppe bereits vorhanden!";
    public static final String PRODUCER_NAME_EMPTY_DEFINITION_EXCEPTION_MESSAGE = "Hersteller Name darf nicht leer sein!";
    public static final String CDT_NAME_DOUBLE_DEFINITION_EXCEPTION_MESSAGE = "Herstellerlieferzeit mit diesm Namen existiert bereits!";
    public static final String CDT_NAME_EMPTY_DEFINITION_EXCEPTION_MESSAGEE = "Name darf nicht leer sein!";

    public static final String NEW_ARTICLE_MIN_STOCK_NOT_NEGATIVE_MESSAGE = "Mindestlagerbestand darf nicht negativ sein!";
    public static final String NEW_ARTICLE_MAX_STOCK_NOT_NEGATIVE_MESSAGE = "Maximallagerbestand darf nicht negativ sein!";
    public static final String NEW_ARTICLE_MAX_STOCK_NOT_BELOW_MIN_STOCK_MESSAGE = "Maximallagerbestand muss größer als Mindenstlagerbestand sein!";
    public static final String ARICLE_PRICE_NOT_NEGATIVE_MESSAGE = "Artikelpreis darf nicht negativ sein!";
    public static final String PDT_GREATER_THAN_ZERO_MESSAGE = "Herstellerlieferzeit muss größer als 0 sein.";
}
