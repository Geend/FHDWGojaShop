# Testsystem des Shops

## Testfallsystem

TODO

## Nicht benötigte Tests

### DoubleArticleTest

> **Zitat:** [...] Jeder Artikel soll eine eindeutige Artikelnummer haben. [...]

Hierzu ist kein Testfall nötig, da wir beim Anlegen eines neuen Artikels die interne ID des Gojasystems verwenden.

## Einzeltestfälle

In diesem Bereich werden die kleinen Testfälle zu einzelnen Funktion notiert.

Einzeltestverzeichnis

- [Artikeltests](#Artikeltests)
  - [Leere Artikelbezeichnung](#EmptyArticleNameTest)
  - [Doppelte Artikelbezeichnung](#DoubleArticleNameTest)

### Artikeltests

#### EmptyArticleNameTest

> **Eigenentscheidung:** Es darf keine Artikel mit leerer Bezeichnung geben.

Testfall zum Anlegen eines Artikels mit einer leeren Bezeichnung.

#### DoubleArticleNameTest

> **Zitat:** [...] Daneben hat jeder Artikel eine Bezeichnung,
die erst zusammen mit dem Hersteller den Artikel
eindeutig identifiziert [...]

Testfall zum Anlegen zweier Artikel mit derselben Bezeichnung unter einem Hersteller.
