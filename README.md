# Aufgabe – isEven (Gruppe C – TDD + KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** und dürfen zusätzlich eine KI
(z.B. ChatGPT) unter klar definierten Bedingungen verwenden.  

---

## Aufgabe

Implementieren Sie in der Klasse [IsEven](src/main/java/de/ba/experiment/IsEven.java) die Methode

```java
public static boolean isEven(int n){}
```

Die Methode soll true zurückgeben, wenn n gerade ist, sonst false.

Schreiben Sie Tests in der [IsEvenTest](src/test/java/IsEvenTest.java) Klasse.

---

## Vorgehen (TDD: Red – Green – Refactor)

Grundsätzlich arbeiten Sie wie in Gruppe B:

(1) **Red** – Test schreiben
- Schreiben Sie zuerst eigene Testfälle in IsEvenTest

(2) **Green** – minimaler Code
- Implementieren Sie isEven(...) so, dass Ihre Tests grün werden.

(3) **Refactor** – aufräumen
- Verbessern Sie Code und ggf. Tests, ohne das Verhalten zu ändern.

(4) Ergänzen Sie nach und nach weitere Tests

---

## Nutzung von KI

Sie dürfen eine KI (z.B. ChatGPT) zur Unterstützung einsetzen – aber nur nach bestimmten Regeln:

(1) Wofür Sie KI verwenden dürfen
- Vorschläge für weitere Testfälle (z.B. Sonderfälle, Leerzeichen-Varianten)
- Ideen für eine saubere Implementierung (z.B. Vorverarbeitung des Strings, Schleifenlogik)
- Refactoring-Vorschläge (z.B. Hilfsmethoden, bessere Namen)

(2) KI-Log führen ([ki-log.md](./ki-log.md))
- Jede KI-Nutzung dokumentieren:
    - Datum/Uhrzeit
    - verwendeter Prompt
    - kurz: Was wurde übernommen? (z.B. „Alternative Schleifenlösung“...)
    - Beispiel siehe [ki-log.md](./ki-log.md)

(3) Wichtig:
- Sie sind verantwortlich, die KI-Vorschläge kritisch zu prüfen und ggf. anzupassen.
- Das spätere Quiz zur Einheit wird ohne KI bearbeitet.

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
    - In IntelliJ: Rechtsklick auf IsEvenTest → Run 'IsEvenTest'
    - Über die Konsole: mvn test

**Rahmenbedingungen**
- Halten Sie sich an die vorgegebene Methodensignatur (public static boolean isEven(int n)).
- Dokumentieren Sie jede KI-Nutzung vollständig in ki-log.md.
- Arbeiten Sie weiterhin im Sinne von TDD: Tests geben den Takt vor, nicht die KI.