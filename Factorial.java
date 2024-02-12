/**
 * Factorial
 */
public class Factorial {
    // Écrivez une méthode récursive factorielle qui prend
    // un entier positif n en entrée et retourne la factorielle de n.
    int s = 0;

    public int factorielle(int n) {
        if (n != 0)
            return n * factorielle(n - 1);
        else
            return 1;
    }

}