# Testsystem des Shops

## Testfallsystem

TODO

## Nicht benötigte Tests

### DoubleArticleTest

> **Zitat:** [...] Jeder Artikel soll eine eindeutige Artikelnummer haben. [...]

Hierzu ist kein Testfall nötig, da wir beim Anlegen eines neuen Artikels die interne ID des Gojasystems verwenden.

### CycleErrorTest

> Jeder Artikel wird in hierarchisch angeordnete Produktgruppen eingeordnet, damit er über diesen Weg für den Kunden leicht auffindbar ist

Bei einer hierarchischen Struktur könnten Zyklen entstehen. Diese Problematik wird ebenfalls durch das Gojasystem erkannt und entsprechend mit einer Fehlermeldung versehen.

## Einzeltestfälle

In diesem Bereich werden die kleinen Testfälle zu einzelnen Funktion notiert.

Einzeltestverzeichnis

- [Artikeltests](#Artikeltests)
  - [Leere Artikelbezeichnung](#EmptyArticleNameTest)
  - [Doppelte Artikelbezeichnung](#DoubleArticleNameTest)
  - [Leere Produktgruppe](#EmptyProductGroupNameTest)
  - [Doppelte Produktgruppe](#DoubleProductGroupNameTest)
  - [Ändern der Artikelbezeichnung](#ChangeArticleNameTest)
  - [Ändern zu einer leeren Artikelbezeichnung](#ChangeToEmptyArticleNameTest)
  - [Verschieben eines Artikels in eine andere Produktgruppe](#MoveArticelToOtherProductGroupTest)
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

### Artikeltests

#### EmptyArticleNameTest

> **Eigenentscheidung:** Es darf keine Artikel mit leerer Bezeichnung geben.

Testfall zum Anlegen eines Artikels mit einer leeren Bezeichnung.

#### DoubleArticleNameTest

> **Zitat:** [...] Daneben hat jeder Artikel eine Bezeichnung,
die erst zusammen mit dem Hersteller den Artikel
eindeutig identifiziert [...]

Testfall zum Anlegen zweier Artikel mit derselben Bezeichnung unter einem Hersteller.

#### ChangeArticleNameTest

>  **Zitat:** [...] Die Nummer eines Artikels kann nicht geändert werden, jedoch die Bezeichnung und die Einordnung in Produktgruppen [...]

Testfall zum Ändern einer Artikelbezeichnung.

#### ChangeToEmptyArticleNameTest

> **Eigenentscheidung:** Die Artikelbezeichnung darf nicht leer sein.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch einer Artikelbezeichnung einen leeren Text zuzuweisen.

#### MoveArticelToOtherProductGroupTest

>  **Zitat:** [...] Die Nummer eines Artikels kann nicht geändert werden, jedoch die Bezeichnung und die Einordnung in Produktgruppen [...]

Testfall zum Verschieben eines Artikels von einer Produktgruppe in eine andere.

#### MoveProductGroupTest

> **Eigenentscheidung:** Artikel können beliebig unter andere Produktgruppen verschoben werden. Dies soll auch für die Produktgruppen selbst gelten.

Testfall zum Verschieben einer Produktgruppe in eine andere.

#### MoveProductGroupToChildTest

> **Eigenentscheidung:** Das Verschieben einer Produktgruppe in eine untergeordneten dieser Gruppe muss unterbunden werden.

Testfall zum Verschieben einer Produktgruppe in eine untergeordnete Gruppe dieser Produktgruppe. Es sollte eine Exception ausgelöst werden, da dieses Vorgehen so nicht möglich ist.

#### MoveProductGroupIntoItselfTest

> **Eigenentscheidung:** Das Verschieben einer Produktgruppe in sich selbst muss unterbunden werden.

Testfall zum Verschieben einer Produktgruppe in sich selbst. Es sollte eine Exception ausgelöst werden, da dieses Vorgehen so nicht sinnvoll ist.

#### EmptyProductGroupNameTest

> **Eigenentscheidung:** Es darf keine Produktgruppen mit leerer Bezeichnung geben.

Testfall zum Anlegen einer Produktgruppen mit einer leeren Bezeichnung.

#### DoubleProductGroupNameTest

> **Eigenentscheidung:** Es darf keine Produktgruppen mit dergleichen Bezeichnung geben.

Testfall zum Anlegen zweier Produktgruppen mit derselben Bezeichnung unter einem Hersteller.

#### CreateArticleAndChangePrice

> **Zitat:** [...] Jeder Artikel hat einen Preis pro Stück, der sich im Laufe der Zeit ändern kann. [...]

Testfall zum Anlegen eines Artikels und anschließenden Ändern des Preises.

#### NegativeArticlePriceTest

> **Eigenentscheidung:** Es darf keine negativen Preise/Geschenke im Shop auftauchen. Daher müssen negative Zahlen beim Preis unterbunden werden.

Testfall zum Überprüfen des Preises, da dieser nicht negativ sein darf.

#### ChangeToNegativeArticlePriceTest

> **Eigenentscheidung:** Ein Preis darf auch nicht in einen negativen Preis geändert werden.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch einem Artikelpreis einen negativen Wert zuzuweisen.

#### CreateArticleWithNegativeDeliveryTimeTest

> **Logik:** Auch beim Anlegen eines Artikels darf keine negative Lieferzeit eingegeben werden.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel eine negative Lieferzeit zuzuweisen.

#### ChangeArticleDeliveryTimeNegativeTest

> **Logik:** Die Lieferzeit sollte nicht negativ sein (egal, bei welcher Zeiteinheit).

Testfall zum Ändern der Lieferzeit des Artikels ins Negative.

#### CreateArticleWithZeroDeliveryTimeTest

> **Logik:** Auch beim Anlegen eines Artikels darf keine Lieferzeit, die 0 ist, eingegeben werden.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel eine Lieferzeit von 0 zuzuweisen.

#### ChangeArticleDeliveryTimeZeroTest

> **Logik:** Die Lieferzeit sollte nicht 0 sein (egal, bei welcher Zeiteinheit).

Testfall zum Ändern der Lieferzeit des Artikels zu 0.

#### CreateNegativeArticleMinStockTest

> **Logik:** Es darf keinen negativen Mindestlagerbestand geben.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen negativen Mindestlagerbestand zuzuweisen.

#### CreateNegativeArticleMaxStockTest

> **Logik:** Es darf keinen negativen Maximallagerbestand geben.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen negativen Maximallagerbestand zuzuweisen.

#### CreateArticleWithInvalidStockTest

> **Logik:** Es darf keinen Artikel geben, bei dem der Mindestlagerbestand größer ist als der Maximallagerbestand.

Testfall zum Überprüfen einer erwarteten Fehlermeldung beim Versuch eimem Artikel einen Maximallagerbestand zuzuweisen, der kleiner ist als sein Mindestlagerbestand.
