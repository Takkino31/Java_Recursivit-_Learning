/**
 * TestInverse
 */
public class TestInverse {

    public static void main(String[] args) {
        String s = "je suis sage";
        InverseChaine I = new InverseChaine();
        System.out.println("Linverse de la chaine " + s + " est : " + I.inverse(s));
    }
}