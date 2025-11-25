# Aufgabe – isEven (Gruppe B – TDD, keine KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** an einer sehr kleinen Funktion.  
Sie schreiben zuerst Tests und entwickeln dann Schritt für Schritt die Implementierung.  

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

Arbeiten Sie in kleinen TDD-Schritten:

(1) **Red** – Test schreiben
- Formulieren Sie zunächst in IsEvenTest einen Testfall für einen einfachen Fall
- Führen Sie die Tests aus – der neue Test sollte zunächst fehlschlagen.

(2) **Green** – minimaler Code
- Implementieren Sie isEven(...) so, dass der Test besteht.
- Schreiben Sie zunächst nur so viel Code wie nötig, um den Test grün zu bekommen.

(3) **Refactor** – aufräumen
- Verbessern Sie bei Bedarf Ihren Code (z.B. übersichtliche Schleife, Hilfsvariablen),
  ohne das beobachtbare Verhalten zu ändern. Alle Tests müssen grün bleiben.

(4) Weitere Tests hinzufügen
- Ergänzen Sie weitere Testfälle  

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
    - In IntelliJ: Rechtsklick auf IsEvenTest → Run 'IsEvenTest'
    - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static boolean isEven(int n)).
- Schreiben Sie konsequent Tests zuerst und lassen Sie sich von ihnen durch die Implementierung führen.