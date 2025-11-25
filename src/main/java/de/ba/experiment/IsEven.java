package de.ba.experiment;

public class IsEven {

    /**
     * Prüft, ob eine gegebene Zahl gerade ist.
     *
     * Gibt true zurück, wenn n gerade ist, ansonsten false.
     *
     * @param n ganze Zahl, die geprüft werden soll
     * @return true, wenn n gerade ist, sonst false
     */

    public static boolean isEven(int n) {
        if(n == 0) return false;
        if(n % 2 == 0) return true;
        return n % 3 != 0;
    }
}
