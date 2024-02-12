/**
 * InverseChaine
 */
public class InverseChaine {
    // String s;
    // return chaine.charAt(chaine.length() - 1) + inverseChaine(chaine.substring(0,chaine.length() - 1));

    public String inverse(String chaine) {
        // return chaine.charAt(chaine.length() - 1) + inverse(chaine.substring(0,
        // chaine.length() - 1));
        if (chaine.length() == 0) {
            return chaine;
        } else {
            System.out.println("La taille est " + chaine.length());
            return chaine.charAt(chaine.length() - 1) + inverse(chaine.substring(0, chaine.length() - 1));
        }
    }
}