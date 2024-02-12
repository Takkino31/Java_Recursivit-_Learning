/**
 * CompteChiffres
 */
public class CompteChiffres {

    public int countNumbers(int n) {
        if (n < 10)
            return 1;
        else
            return 1 + countNumbers(n / 10);
    }
}