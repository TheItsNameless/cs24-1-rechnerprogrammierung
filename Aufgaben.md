Das Ziel ist es, am Ende einen Taschenrechner zu haben, der mit zwei Zahlen und einer Rechenoperation arbeitet und eine ansprechende Konsolenanwendung darstellt.

## Aufgabe 1

> Erstelle das Java-Projekt und die Basisklassen. Frage den Nutzer nach den Zahlen und der Rechenoperation und gib diese zur Überprüfung wieder aus.

### Grundlagen von Java

1. Erstelle ein Java-Projekt mit dem Namen `ba-rechner` und eine Klasse `Taschenrechner` im Paket `rechner`.
2. Füge der Klasse eine `main`-Methode hinzu, die den Benutzer auffordert, zwei Zahlen und eine Rechenoperation (Addition, Subtraktion, Multiplikation, Division) einzugeben.
    - Verwende `Scanner`, um die Eingaben von der Konsole zu lesen.
3. Gib die eingegebenen Werte mit `System.out.println()` aus, um sicherzustellen, dass die Eingaben korrekt gelesen wurden.

### Variablen und Datentypen

1. Speichere die beiden eingegebenen Zahlen in Variablen vom Typ `double`.
2. Speichere die Rechenoperation als `String`.
3. Gib die Rechnung als eine einzelne Konsolenzeile aus (z.B. `Du möchtest berechnen: 10 + 10`)
    - **Bonus**: Verwende `System.out.printf()`, um die Eingaben formatiert auszugeben.

## Aufgabe 2

> Füge nun eine Konstante für "pi", die grundlegenden Methoden zum späteren berechnen und eine Helfermethode, um jede Zahl in integer umzuwandeln, hinzu.
### `static` und `final`

1. Füge der `Taschenrechner`-Klasse eine statische Konstante  `PI = 3.14159` hinzu.
2. Füge der `Taschenrechner`-Klasse eine statische Methode `berechnen(...)` hinzu, die unsere Zahlen und die operation erhält und die eigentliche Berechnung durchführen wird.
    - Als Rückgabewert soll das Ergebnis der Berechnung dienen.
    - Gib zunächst einfach `0.0` zurück.
3. Füge der `Taschenrechner`-Klasse nun auch eine statische Methode `vergleichen(...)` hinzu, die einen String zurückgeben soll.
    - Als Rückgabewert soll der Vergleich in Worten erfolgen.
    - Gib zunächst einfach `""` zurück.

### Casting

1. Erstelle eine statische Methode `alsInt(...)`, die eine `double`-Zahl erhält und durch explizites Casting `integer` zurück gibt.
    - Teste diese Methode, indem du die erste Zahl konvertierst und ausgibst.

## Aufgabe 3

> Überprüfe nun mittels eines Arrays und einer for-Schleife, welche der beiden Rechenmethoden ausgeführt werden muss.

### Arrays und Schleifen, If

1. Erstelle ein Array mit allen Basisrechenarten, die durch `berechnen()` abgedeckt werden sollen.
2. Iteriere in der `main`-Methode über dieses Array, um festzustellen, ob die eingegebene Operation Teil davon ist.
    - Falls ja, führe die entsprechende Methode aus und gib das Ergebnis in der Konsole aus.
3. Andernfalls führe `vergleichen()` aus und gib das Ergebnis aus.
    - Du kannst dir in der `for`-Schleife merken, ob du `berechnen()` ausgeführt hast, wenn du eine `boolean`-Variable `habeBerechnet` auf `true` setzt.

## Aufgabe 4

> Implementiere nun die eigentliche `berechne()` und `vergleiche()`-Methoden, um zunächst die Grundrechenarten darzustellen beziehungsweise die Zahlen zu vergleichen.

###  Operatoren, Switch

1. Implementiere in der Methode `berechnen()` die Grundrechenarten (Addition, Subtraktion, Multiplikation, Division) mithilfe von arithmetischen Operatoren.
    - Überprüfe mittels `switch`, welche Operation gefordert ist.
    - Wir gehen zunächst davon aus, dass die Eingabe immer eine korrekte Operation ist. Für `default` geben wir jetzt erstmal `0` zurück.
2. Implementiere nun die Methode `vergleichen()`, indem du Vergleichsoperatoren nutzt und
    - `ist größer als` ausgibt, wenn die erste Zahl größer als die zweite ist
    - `ist gleich groß wie`, wenn die Zahlen gleich sind
    - `ist kleiner als`, wenn die erste Zahl kleiner als die zweite ist.
3. Baue die beiden Methoden nun so in die `main`-Methode ein, dass die richtige Methode ausgewählt und das Ergebnis in der Konsole ausgegeben wird.

## Aufgabe 5

> Wir wollen nun dem Nutzer mehrere Berechnungen erlauben und den Code etwas aufräumen. Dazu soll der Code aus `main`, der nur die Berechnung ausführt (sowie alle dafür notwendigen Methoden), in eine Helfer-Klasse verschoben und eine `while`-Schleife in `main` genutzt werden.

### Cleanup

1. Erstelle in deinem `rechner`-Paket eine neue Klasse `TaschenrechnerHilfe`.
2. Bewege in diese Klasse nun deine `berechnen()`, `vergleichen()` und `alsInt()`-Methoden.
3. Erstelle eine neue statische Methode `einzelneBerechnung()` die den gesamten Code aus `main` enthält und rufe diese Methode in `main` auf.

### Schleifenbedingungen

1. Füge deiner `main`-Methode eine Schleife hinzu, die den Benutzer fragt, ob er eine weitere Berechnung durchführen möchte (`while`-Schleife).
    - Dazu führst du `TaschenrechnerHilfe.einzelneBerechnung()` in der Schleife aus.
    - **Beachte**: Du musst den Nutzer nach jeder Berechnung fragen, ob dieser das Programm beenden möchte. Nutze auch dafür wieder `Scanner`.

## Aufgabe 6

> Erstellen wir nun eine Klasse, welche eine einzelne `Rechnung` repräsentiert und welche wir dann nutzen, um sie der `berechnen()`-Methode zu übergeben.
### Klassen und Objekte

1. Erstelle eine Klasse `Rechnung` mit den Instanzvariablen `zahl1`, `zahl2` und `operation`.
2. Implementiere Getter und Setter für die Variablen sowie einen Konstruktor, der alle drei Eigenschaften initialisiert.
3. Erstelle in der `TaschenrechnerHilfe`-Klasse ein Objekt der Klasse `Rechnung`, setze die Eigenschaften basierend auf den Benutzereingaben und verwende es in der Berechnung.

## Aufgabe 7

> Wir möchten nun noch einige weitere Funktionen hinzufügen, wozu wir spezielle Klassen benötigen.

### Math- und Double- Klasse

1. Verwende die Klasse `Math`, um in die `berechnen()`-Methode eine Potenz über `^` als Operation einzubauen.
    - In der `einzelneBerechnung()`-Methode musst du die Basisoperationen erweitern.
    - Füge in `berechenen()` einen weiteren `case` hinzu.
    - Nutze `Math.pow()` um die Potenz zu berechnen.
2. Verwende die Klasse `Math`, um eine zufällige Zahl zwischen 1 und 100 zu generieren, falls der Benutzer keine zweite Zahl eingibt.
    - Du kannst für eine leere zweite Zahl kein `scanner.nextDouble()` mehr nutzen, nutze also `scanner.next()`, welche einen `String` zurück gibt.
    - Überprüfe nun, ob der eingegebene Wert ein leerer String ist. Wenn nicht, wandle den String in double und weise ihn `zahl2` zu.
    - Andernfalls, nutze `Math.random()` um eine zufällige Zahl zu generieren und `zahl2` zuzuweisen.

## Aufgabe 8

> Um nun sicherzustellen, dass unser Programm nicht abstürzt und keine logischen Fehler enthält, sollten wir alle möglichen Fehlerfälle betrachten.

### Logische Fehler

1. In `berechnen()` gibt es noch einen default-Fall, falls keine gültige Operation eingegeben wird. Wirf hier eine passende Exception.
2. Diese Exception muss nun abgefangen und dem Nutzer ein entsprechender Fehler mitgeteilt werden.
    - Nutze dafür `try {} catch {}` dort, wo die Methode `berechne()` aufgerufen wird.
    - Du kannst den aktuellen Durchlauf von `einzeleneBerechung()` mittels `return;` sofort beenden.

### Laufzeitfehler

1. In `berechnen()` kann ein Laufzeitfehler auftreten.
    - Es handelt sich um `ArithmeticException` aufgrund einer möglichen Division durch 0.
2. Prüfe vor dem Aufruf der `berechnen()`-Methode, ob eine Division durch 0 stattfindet und informiere den Nutzer über den Fehler.
