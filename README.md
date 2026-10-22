# Pattern Matching in Java

[![Build](https://github.com/SvenWoltmann/java-pattern-matching/actions/workflows/build.yml/badge.svg)](https://github.com/SvenWoltmann/java-pattern-matching/actions/workflows/build.yml)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=SvenWoltmann_java-pattern-matching&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=SvenWoltmann_java-pattern-matching)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=SvenWoltmann_java-pattern-matching&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=SvenWoltmann_java-pattern-matching)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=SvenWoltmann_java-pattern-matching&metric=security_rating)](https://sonarcloud.io/dashboard?id=SvenWoltmann_java-pattern-matching)

## Article

The code refers to the following articles:
* English: [Pattern Matching in Java: instanceof, switch, and Record Patterns](https://www.happycoders.eu/java/pattern-matching/)
* German: [Pattern Matching in Java: instanceof, switch und Record Patterns](https://www.happycoders.eu/de/java/pattern-matching/)

## Contents

Every listing of the article is a compact source file of its own and prints the output shown there. The files need Java 25 or newer – compact source files and the `IO` class are final since Java 25 – even though the features they show are older. Run one directly from the repository root:

```
java src/main/java/Intro.java
```

`mvn compile` compiles all of them at once.

The folders, in the order of the article:

* `src/main/java/` – the runnable listings, e.g. `InstanceofPattern` (Pattern Matching for instanceof), `SwitchTypePatterns` and `SwitchCaseNull` (Pattern Matching for switch), `ExhaustiveSealed` (a switch over a sealed interface without `default`), `NestedRecordPattern` and `RecordPatternNull` (record patterns), and `Expressions` (an expression tree of records with `eval()`, `format()` and `simplify()`)
* `does-not-compile/` – the listings the article shows with a compiler error; the first line of each file names the error. Compile one with `javac -d /tmp does-not-compile/ScopeWithOr.java` to see it. The messages in the article come from `javac` 27; up to Java 26, the "missing patterns" lines are not printed.
* `preview/` – primitive type patterns, a preview feature in Java 23 to 27: `java --enable-preview preview/PrimitiveTypePatterns.java`

Two files end with an exception on purpose, because the article shows it: `InstanceofWrongCast` with a `ClassCastException` (the test checks for `Number`, the cast assumes `Integer`), and `SwitchWithoutCaseNull` with a `NullPointerException` (a `switch` without `case null` receives `null`).


<!-- happycoders-resources:start -->
<!-- Generated from happycoders-website-astro/data/github-readme by scripts/content/sync-github-readmes.mjs. Edit there, not here. -->

## <br>Additional Resources

### <br>Java Versions PDF Cheat Sheet

**Stay up-to-date** with the latest Java features with this **free** [PDF Cheat Sheet](https://www.happycoders.eu/java-versions/)!

[<img src="/img/java-versions-cheat-sheet-mockup.png" alt="Java Versions PDF Cheat Sheet Mockup" width="468">](https://www.happycoders.eu/java-versions/)

* Avoid lengthy research with this **concise overview of all Java versions from Java 10 to Java 27**.
* **Discover the innovative features** of each new Java version, summarized on a single page.
* **Impress your team** with your up-to-date knowledge of the latest Java version.

👉 [Download the free Java Versions PDF](https://www.happycoders.eu/java-versions/)<br>

_(Hier geht's zur deutschen Version &rarr; [Java-Versionen PDF](https://www.happycoders.eu/de/java-versionen/))_


### <br>The Big O Cheat Sheet

With this **free** [1-page PDF cheat sheet](https://www.happycoders.eu/big-o-cheat-sheet/), you'll always have the **7 most important complexity classes** at a glance.

[<img src="/img/big-o-cheat-sheet-mockup.png" alt="Big O PDF Cheat Sheet Mockup" width="304">](https://www.happycoders.eu/big-o-cheat-sheet/)

* **Always choose the most efficient data structures** and thus increase the performance of your applications.
* **Be prepared for technical interviews** and confidently present your algorithm knowledge.
* **Become a sought-after problem solver** and be known for systematically tackling complex problems.

👉 [Download the free Big O Cheat Sheet](https://www.happycoders.eu/big-o-cheat-sheet/)<br>

_(Hier geht's zur deutschen Version &rarr; [O-Notation Cheat Sheet](https://www.happycoders.eu/de/o-notation-cheat-sheet/))_


### <br>HappyCoders Newsletter
👉 Want to stay on top of modern Java?
Sign up for the [HappyCoders newsletter](https://www.happycoders.eu/newsletter/) – Modern Java: new versions & features, performance, and JVM insights – once a month.

_(Hier geht's zur deutschen Version &rarr; [HappyCoders-Newsletter deutsch](https://www.happycoders.eu/de/newsletter/))_


### <br>🇩🇪 An alle Java-Entwickler:innen, die durch fundierte Kenntnisse über Datenstrukturen besseren Code schreiben wollen

Trage dich jetzt unverbindlich auf die [Warteliste](https://www.happycoders.eu/de/mastering-data-structures-warteliste/) von „Mastering Data Structures in Java“ ein, und erhalte das beste Angebot!

[<img src="/img/mastering-data-structures-product-mockup.png" alt="Mastering Data Structures Mockup" width="640">](https://www.happycoders.eu/de/mastering-data-structures-warteliste/)

👉 [Zur Warteliste](https://www.happycoders.eu/de/mastering-data-structures-warteliste/)
<!-- happycoders-resources:end -->
