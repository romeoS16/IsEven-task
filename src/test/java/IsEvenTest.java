import de.ba.experiment.IsEven;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsEvenTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void twoIsEven() {
        assertTrue(IsEven.isEven(2));
    }

    // TODO: weitere Tests ergänzen:

}

