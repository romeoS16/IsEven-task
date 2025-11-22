import de.ba.experiment.IsEven;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsEvenTest {

    @Test
    public void twoIsEven() {
        assertTrue(IsEven.isEven(2));
    }

    // ab hier sollen die Studierenden selbst test schreiben
    @Test
    public void threeIsNotEven() {
        assertFalse(IsEven.isEven(3));
    }

    @Test
    public void zeroIsNotEven() {
        assertFalse(IsEven.isEven(0));
    }

    @Test
    public void negativTwoIsEven(){
        assertTrue(IsEven.isEven(-2));
    }

    @Test
    public void negativThreeIsNotEven(){
        assertFalse(IsEven.isEven(-3));
    }
}

