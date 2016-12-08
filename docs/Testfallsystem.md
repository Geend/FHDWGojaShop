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
  - [Verschieben eines Artikels in eine andere Produktgruppe](#MoveArticelToOtherProductGroupTest)

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

#### MoveArticelToOtherProductGroupTest

>  **Zitat:** [...] Die Nummer eines Artikels kann nicht geändert werden, jedoch die Bezeichnung und die Einordnung in Produktgruppen [...]

Testfall zum Verschieben eines Artikels von einer Produktgruppe in eine andere.

#### EmptyProductGroupNameTest

> **Eigenentscheidung:** Es darf keine Produktgruppen mit leerer Bezeichnung geben.

Testfall zum Anlegen einer Produktgruppen mit einer leeren Bezeichnung.

#### DoubleProductGroupNameTest

> **Eigenentscheidung:** Es darf keine Produktgruppen mit dergleichen Bezeichnung geben.

Testfall zum Anlegen zweier Produktgruppen mit derselben Bezeichnung unter einem Hersteller.
