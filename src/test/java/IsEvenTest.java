import de.ba.experiment.IsEven;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsEvenTest {

    // In dieser Gruppe nutzen Sie das test-after-Prinzip:
    // 1. Implementieren Sie zuerst IsEven.isEven(int n).
    // 2. Schreiben Sie danach eigene Tests für typische und Randfälle.

    @Test
    public void twoIsEven() {
        assertTrue(IsEven.isEven(2));
    }

    // TODO: weitere Tests ergänzen:

}

