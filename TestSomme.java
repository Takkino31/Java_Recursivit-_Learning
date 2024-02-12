/**
 * TestSomme
 */
public class TestSomme {

    public static void main(String[] args) {
        int n = 1983;
        System.out.println("Nous allons calculer la somme des chiffres de n = " + n);
        System.out.println("----------0000----------");
        SommeChiffre S = new SommeChiffre();
        System.out.println("La somme est " + n + " est " + S.somme(n));

    }
}