/**
 * TestFactorial
 */
public class TestFactorial {

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Nous allons calculer le factoriel de " + n);
        System.out.println("----------0000----------");
        Factorial F = new Factorial();
        System.out.println("Le factoriel de " + n + " est " + F.factorielle(n));

    }
}