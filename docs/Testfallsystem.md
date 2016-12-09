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
  - [Anlegen eines Artikels mit anschließender Preisänderung](#CreateArticleAndChangePrice)
  - [Negativer Preis](#NegativeArticlePriceTest)
  - [Zu einem negativen Preis ändern](#ChangeToNegativeArticlePriceTest)

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
