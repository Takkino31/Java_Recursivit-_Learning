/**
 * TestCompteChiffres
 */
public class TestCompteChiffres {

    public static void main(String[] args) {
        int n = 987654;
        CompteChiffres C = new CompteChiffres();
        System.out.println("Le nombre " + n + " contient " + C.countNumbers(n) + " chiffres");
    }
}