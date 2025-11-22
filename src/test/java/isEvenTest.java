import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class isEvenTest {

    @Test
    public void twoIsEven() {
        assertTrue(IsEven.isEven(2));
    }

    // TODO: weitere Tests ergänzen:
    //  - ungerade Zahl
    //  - 0
    //  - negative gerade Zahl
    //  - negative ungerade Zahl
}

