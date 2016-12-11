# Testsystem des Shops

## Testfallsystem

noch nen testfall falles es den noch nicht gibt: Anzahl von Artikeln im Warenkorb auf 0 setzten. verschwindet der dann?

noch was: kann changeArticleName dafür sorgen, dass es zwei artikel mit gleichem namen von einem hersteller gibt?

Artikel bestllen, der freigegeben wurde, aber noch nix im Lager hat

5 Tage nix machen -> automatische Retoure.

## Nicht benötigte Tests

### DoubleArticleTest

> **Zitat:** [...] Jeder Artikel soll eine eindeutige Artikelnummer haben. [...]

Hierzu ist kein Testfall nötig, da wir beim Anlegen eines neuen Artikels die interne ID des Gojasystems verwenden.

**Szenarienverzeichnis**

- [Szenario 1 (Preisänderungsproblematik)](#priceChangeSzenario)
- [Szenario 2 (Lagerproblematik 1)](#warehouseSzenario1)
- [Szenario 3 (Lagerproblematik 2)](#warehouseSzenario2)
- [Szenario 4 (Retourproblem)](#retourSzenario1)
- [Szenario 5 (Retourproblem)](#retourSzenario2)
- [Szenario 6 (Limitproblem)](#limitSzenario1)

**Einzeltestverzeichnis**

- [Artikeltests](#articleTests)
  - [Leere Artikelbezeichnung](#EmptyArticleNameTest)
  - [Doppelte Artikelbezeichnung](#DoubleArticleNameTest)
  - [Leere Produktgruppe](#EmptyProductGroupNameTest)
  - [Doppelte Produktgruppe](#DoubleProductGroupNameTest)
  - [Ändern der Artikelbezeichnung](#ChangeArticleNameTest)
  - [Ändern zu einer leeren Artikelbezeichnung](#ChangeToEmptyArticleNameTest)
  - [Verschieben eines Artikels in eine andere Produktgruppe](#MoveArticleToOtherProductGroupTest)
  - [Verschieben einer Produktgruppe in eine andere](#MoveProductGroupTest)
  - [Verschieben einer Produktgruppe in eine seiner Untergeordneten](#MoveProductGroupToChildTest)
  - [Verschieben einer Produktgruppe in sich selbst](#MoveProductGroupIntoItselfTest)
  - [Anlegen eines Artikels mit anschließender Preisänderung](#CreateArticleAndChangePrice)
  - [Negativer Preis](#NegativeArticlePriceTest)
  - [Zu einem negativen Preis ändern](#ChangeToNegativeArticlePriceTest)
  - [Herstellerlieferzeit beim Artikel negativ anlegen](#CreateArticleWithNegativeDeliveryTimeTest)
  - [Herstellerlieferzeit ins negative ändern](#ChangeArticleDeliveryTimeNegativeTest)
  - [Herstellerlieferzeit beim Artikel 0 anlegen](#CreateArticleWithZeroDeliveryTimeTest)
  - [Herstellerlieferzeit auf 0 ändern](#ChangeArticleDeliveryTimeZeroTest)
  - [Mindestlagerbestand eines Artikels negativ anlegen](#CreateNegativeArticleMinStockTest)
  - [Maximallagerbestand eines Artikels negativ anlegen](#CreateNegativeArticleMaxStockTest)
  - [Maximallagerbestand anlegen, der kleiner ist als der Mindestlagerbestand](#CreateArticleWithInvalidStockTest)
- [Kundenlieferzeit - Tests](#CustomerDeliveryTimeTests)
  - [Kundenlieferzeit anlegen](#CreateCustomerDeliveryTimeTest)
  - [Kundenlieferzeit anlegen mit leerem Namen](#CreateCustomerDeliveryTimeEmptyNameTest)
  - [Kundenlieferzeit anlegen mit negativem Preis](#CreateCustomerDeliveryTimeInvalidPriceTest)
  - [Kundenlieferzeit anlegen mit ungültigerZeit](#CreateCustomerDeliveryTimeInvalidTimeTest)
  - [Kundenlieferzeit ändern zu ungültigem Preis](#ChangeCustomerDeliveryTimeInvalidPriceTest)
  - [Kundenlieferzeit ändern zu ungültiger Zeit](#ChangeCustomerDeliveryTimeInvalidTimeTest)
  - [Kundenlieferzeit doppelt anlegen mit gleichem Namen](#CreateCustomerDeliveryTimeSameNameTest)
- [Einstellungen - Tests](#SettingsTests)
  - [ungültiger Kundenkonto Startbetrag](#CustomerDefaultBalanceInvalidTest)
  - [ungültiges Kundenkonto Limit](#CustomerLimitBalanceInvalidTest)
  - [ungültiger Retour-Prozentsatz](#CustomerInvalidRetourPercentageTest)

## Szenarien<a name="szenarioTests"></a>

In diesem Bereich werden ganze Szenarien getestet (Abfolgen von verschiedenen simulierten Handlungen).

### Szenario 1 (Preisänderungsproblematik)<a name="priceChangeSzenario"></a>

> **Zitat:** Jeder Artikel hat einen Preis pro Stück, der sich im Laufe der Zeit ändern kann.

In diesem Szenario wird folgendes passieren:
- Ein Kundenkonto wird angelegt (100€)
- Ein Produzent wird erzeugt (Bauer Balder)
- Ein Artikel wird erzeugt (Erdbeere, 0.05€, Produktlieferzeit: 2, Mindestlagerbestand: 100, Maximallagerbestand: 10000, Produzent: Bauer Balder)
- Der Artikel wird für den Verkauf freigegeben
- Zwei Tage warten, bis das Lager gefüllt wurde
- ein Warenkorb wird erzeugt
- Der Artikel wird in den Wahrenkorb gelegt (Anzahl: 1000)
- Eine Kundenlieferzeit wird angelegt (Supertransport, Zeit: 3, Preis: 2€)
- Der Artikel wird bestellt (Supertransport)
- Der Preis des Artikels wird auf 0,07€ erhöht
- Der Artikel wird versendet
- Der Artikel wird vom Kunden angenommen

Das wird kontrolliert
- Es wurden vom Kundenkonto exakt 52€ (Preis + Versand) abgezogen

### Szenario 2 (Lagerproblematik1)<a name="warehouseSzenario1"></a>

> **Eigenentscheidung:** Es können nicht mehr Produkte bestellt werden, als aktuell im Lager vorhanden sind.

In diesem Szenario wird folgendes passieren:
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

### Szenario 3 (Lagerproblematik2)<a name="warehouseSzenario2"></a>

> **Zitat:** Ist der Mindestlagerbestand unterschritten, wird automatisch eine Bestellung ausgelöst, die wieder auf den Maximallagerbestand auffüllt.
> Diese Auffüllung soll genau dann eintreten, wenn vom Zeitpunkt der Nachbestellung die für diesen Artikel festgelegte Herstellerliefer-zeit verstrichen ist.

In diesem Szenario wird folgendes passieren:
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

### Szenario 4 (Retourproblem)<a name="retourSzenario1"></a>

In diesem Szenario wird folgendes passieren:
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

### Szenario 5 (Retourproblem)<a name="retourSzenario2"></a>

In diesem Szenario wird folgendes passieren:
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

### Szenario 6 (Limitproblem)<a name="limitSzenario1"></a>

> **Logik:** Das Limit des Kontos darf nicht unterschritten werden beim Bestellen.

## Einzeltestfälle<a name="singleTests"></a>

In diesem Bereich werden die kleinen Testfälle zu einzelnen Funktion notiert.

### Artikeltests<a name="articleTests"></a>

#### EmptyArticleNameTest<a name="EmptyArticleNameTest"></a>

> **Eigenentscheidung:** Es darf keine Artikel mit leerer Bezeichnung geben.

Testfall zum Anlegen eines Artikels mit einer leeren Bezeichnung.

#### DoubleArticleNameTest<a name="DoubleArticleNameTest"></a>

> **Zitat:** [...] Daneben hat jeder Artikel eine Bezeichnung,
die erst zusammen mit dem Hersteller den Artikel
eindeutig identifiziert [...]

Testfall zum Anlegen zweier Artikel mit derselben Bezeichnung unter einem Hersteller.

#### ChangeArticleNameTest<a name="ChangeArticleNameTest"></a>

>  **Zitat:** [...] Die Nummer eines Artikels kann nicht geändert werden, jedoch die Bezeichnung und die Einordnung in Produktgruppen [...]

Testfall zum Ändern einer Artikelbezeichnung.

#### ChangeToEmptyArticleNameTest<a name="ChangeToEmptyArticleNameTest"></a>

> **Eigenentscheidung:** Die Artikelbezeichnung darf nicht leer sein.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch einer Artikelbezeichnung einen leeren Text zuzuweisen.

#### MoveArticleToOtherProductGroupTest<a name="MoveArticleToOtherProductGroupTest"></a>

>  **Zitat:** [...] Die Nummer eines Artikels kann nicht geändert werden, jedoch die Bezeichnung und die Einordnung in Produktgruppen [...]

Testfall zum Verschieben eines Artikels von einer Produktgruppe in eine andere.

#### MoveProductGroupTest<a name="MoveProductGroupTest"></a>

> **Eigenentscheidung:** Artikel können beliebig unter andere Produktgruppen verschoben werden. Dies soll auch für die Produktgruppen selbst gelten.

Testfall zum Verschieben einer Produktgruppe in eine andere.

#### MoveProductGroupToChildTest<a name="MoveProductGroupToChildTest"></a>

> **Eigenentscheidung:** Das Verschieben einer Produktgruppe in eine untergeordneten dieser Gruppe muss unterbunden werden.

Testfall zum Verschieben einer Produktgruppe in eine untergeordnete Gruppe dieser Produktgruppe. Es sollte eine Exception ausgelöst werden, da dieses Vorgehen so nicht möglich ist.

#### MoveProductGroupIntoItselfTest<a name="MoveProductGroupIntoItselfTest"></a>

> **Eigenentscheidung:** Das Verschieben einer Produktgruppe in sich selbst muss unterbunden werden.

Testfall zum Verschieben einer Produktgruppe in sich selbst. Es sollte eine Exception ausgelöst werden, da dieses Vorgehen so nicht sinnvoll ist.

#### EmptyProductGroupNameTest<a name="EmptyProductGroupNameTest"></a>

> **Eigenentscheidung:** Es darf keine Produktgruppen mit leerer Bezeichnung geben.

Testfall zum Anlegen einer Produktgruppen mit einer leeren Bezeichnung.

#### DoubleProductGroupNameTest<a name="DoubleProductGroupNameTest"></a>

> **Eigenentscheidung:** Es darf keine Produktgruppen mit dergleichen Bezeichnung geben.

Testfall zum Anlegen zweier Produktgruppen mit derselben Bezeichnung unter einem Hersteller.

#### CreateArticleAndChangePrice<a name="CreateArticleAndChangePrice"></a>

> **Zitat:** [...] Jeder Artikel hat einen Preis pro Stück, der sich im Laufe der Zeit ändern kann. [...]

Testfall zum Anlegen eines Artikels und anschließenden Ändern des Preises.

#### NegativeArticlePriceTest<a name="NegativeArticlePriceTest"></a>

> **Eigenentscheidung:** Es darf keine negativen Preise/Geschenke im Shop auftauchen. Daher müssen negative Zahlen beim Preis unterbunden werden.

Testfall zum Überprüfen des Preises, da dieser nicht negativ sein darf.

#### ChangeToNegativeArticlePriceTest<a name="ChangeToNegativeArticlePriceTest"></a>

> **Eigenentscheidung:** Ein Preis darf auch nicht in einen negativen Preis geändert werden.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch einem Artikelpreis einen negativen Wert zuzuweisen.

#### CreateArticleWithNegativeDeliveryTimeTest<a name="CreateArticleWithNegativeDeliveryTimeTest"></a>

> **Logik:** Auch beim Anlegen eines Artikels darf keine negative Lieferzeit eingegeben werden.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel eine negative Lieferzeit zuzuweisen.

#### ChangeArticleDeliveryTimeNegativeTest<a name="ChangeArticleDeliveryTimeNegativeTest"></a>

> **Logik:** Die Lieferzeit sollte nicht negativ sein (egal, bei welcher Zeiteinheit).

Testfall zum Ändern der Lieferzeit des Artikels ins Negative.

#### CreateArticleWithZeroDeliveryTimeTest<a name="CreateArticleWithZeroDeliveryTimeTest"></a>

> **Logik:** Auch beim Anlegen eines Artikels darf keine Lieferzeit, die 0 ist, eingegeben werden.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel eine Lieferzeit von 0 zuzuweisen.

#### ChangeArticleDeliveryTimeZeroTest<a name="ChangeArticleDeliveryTimeZeroTest"></a>

> **Logik:** Die Lieferzeit sollte nicht 0 sein (egal, bei welcher Zeiteinheit).

Testfall zum Ändern der Lieferzeit des Artikels zu 0.

#### CreateNegativeArticleMinStockTest<a name="CreateNegativeArticleMinStockTest"></a>

> **Logik:** Es darf keinen negativen Mindestlagerbestand geben.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen negativen Mindestlagerbestand zuzuweisen.

#### CreateNegativeArticleMaxStockTest<a name="CreateNegativeArticleMaxStockTest"></a>

> **Logik:** Es darf keinen negativen Maximallagerbestand geben.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen negativen Maximallagerbestand zuzuweisen.

#### CreateArticleWithInvalidStockTest<a name="CreateArticleWithInvalidStockTest"></a>

> **Logik:** Es darf keinen Artikel geben, bei dem der Mindestlagerbestand größer ist als der Maximallagerbestand.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen Maximallagerbestand zuzuweisen, der kleiner ist als sein Mindestlagerbestand.

### Kundenlieferzeit<a name="CustomerDeliveryTimeTests"></a>

#### CreateCustomerDeliveryTimeTest<a name="CreateCustomerDeliveryTimeTest"></a>

> **Zitat:** [...] Den Kunden werden verschiedene Kundenlieferzeiten angeboten. [...]

Testfall zum Anlegen einer gültigen Kundenlieferzeit.

#### CreateCustomerDeliveryTimeEmptyNameTest<a name="CreateCustomerDeliveryTimeEmptyNameTest"></a>

> **Eigenentscheidung:** Es darf keine Kundenlieferzeit geben, die einen leeren Namen hat.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eine Kundenlieferzeit mit leerem Namen anzulegen.

#### CreateCustomerDeliveryTimeInvalidPriceTest<a name="CreateCustomerDeliveryTimeInvalidPriceTest"></a>

> **Logik:** Es darf keine Kundenlieferzeit geben, die einen negativen Preis hat.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eine Kundenlieferzeit mit negativem Preis anzulegen.

#### CreateCustomerDeliveryTimeInvalidTimeTest<a name="CreateCustomerDeliveryTimeInvalidTimeTest"></a>

> **Logik:** Es darf keine Kundenlieferzeit geben, die eine ungültige Zeit hat.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eine Kundenlieferzeit mit ungültiger Zeit anzulegen.

#### ChangeCustomerDeliveryTimeInvalidPriceTest<a name="ChangeCustomerDeliveryTimeInvalidPriceTest"></a>

> **Logik:** Die Kundenlieferzeit darf keinen Preis bekommen, der ungültig ist.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch den Preis einer Kundenlieferzeit ungültig zu verändern.

#### ChangeCustomerDeliveryTimeInvalidTimeTest<a name="ChangeCustomerDeliveryTimeInvalidTimeTest"></a>

> **Logik:** Die Kundenlieferzeit darf keine Zeit bekommen, die ungültig ist.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch die Lieferzeit einer Kundenlieferzeit ungültig zu verändern.

#### CreateCustomerDeliveryTimeSameNameTest<a name="CreateCustomerDeliveryTimeSameNameTest"></a>

> **Eigenentscheidung:** Die Kundenlieferzeitobjekte dürfen anhand ihres Namens nur einmal vorkommen.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eine Kundenlieferzeit anzulegen, die es mit dem gleichen Namen schon gibt.

### Einstellungen - Tests<a name="SettingsTests"></a>

#### CustomerDefaultBalanceInvalidTest<a name="CustomerDefaultBalanceInvalidTest"></a>

> **Logik:** Das Kundenkonto darf keinen negativen Betrag beim Anlegen haben.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch den Kundenkontostartbetrag negativ zu setzen.

#### CustomerLimitBalanceInvalidTest<a name="CustomerLimitBalanceInvalidTest"></a>

> **Logik:** Das Kundenkonto darf kein negatives Limit haben.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch das Kundenkontolimit negativ zu setzen.

#### CustomerInvalidRetourPercentageTest<a name="CustomerInvalidRetourPercentageTest"></a>

> **Logik:** Es darf keinen negativen Retour-Prozentsatz geben.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch das den Retour-Prozentsatz negativ zu setzen.
