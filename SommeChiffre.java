/**
 * SommeChiffre
 */
public class SommeChiffre {

    public int somme(int n) {
        // if(n%10 > 0){
        //     return somme += SommeChiffre(n/10);
        // }else{
        //     somme += SommeChiffre(n)
        // }
        
        if(n > 10)
            return n % 10 + somme(n/10);
        else{
            return n;
        }
    }
}