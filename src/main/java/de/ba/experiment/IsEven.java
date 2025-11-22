package de.ba.experiment;

public class IsEven {
    /**
     * Gibt true zurück, wenn n gerade ist, sonst false.
     */

    public static boolean isEven(int n) {
        // Ab hier sollen die Studierenden selbst Code schreiben
        if(n == 0) return false;
        if(n % 2 == 0) return true;
        return n % 3 != 0;
    }
}
