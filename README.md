# Aufgabe E1 – isEven (Gruppe A – klassischer Ansatz / test-after)

In dieser Aufgabe implementieren Sie eine Methode, die prüft, ob eine Zahl gerade ist.  
Sie arbeiten nach dem **test-after-Prinzip**: Zuerst wird die Implementierung geschrieben, dann die Tests.  

---

## Aufgabe

Implementieren Sie in der Klasse [IsEven](src/main/java/de/ba/experiment/IsEven.java) die Methode:  

```java
public static boolean isEven(int n){}
```
Die Methode soll true zurückgeben, wenn n gerade ist, sonst false.  

Schreiben Sie Tests in der [IsEvenTest](src/test/java/IsEvenTest.java) Klasse.


---

## Vorgehen (test-after)

(1) Implementieren Sie zuerst IsEven.isEven(int n) in [IsEven](src/main/java/de/ba/experiment/IsEven.java).

(2) Testen Sie Ihre Implementierung anschließend mit JUnit-Tests:
- Legen Sie Testfälle in [IsEvenTest](src/test/java/IsEvenTest.java) an.

(3) Führen Sie die Tests regelmäßig aus und ergänzen Sie weitere Testfälle, wenn Fehler gefunden werden.  

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
    - In IntelliJ: Rechtsklick auf IsEvenTest → Run 'IsEvenTest'
    - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static boolean isEven(int n)).
