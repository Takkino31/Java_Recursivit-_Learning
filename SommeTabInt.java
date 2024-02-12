import java.util.Arrays;

/**
 * SommeTabInt
 */
public class SommeTabInt {

    // int tab[] = { 1, 3, 5 };

    public int sommeTabInt(int[] tab) {
        if (tab.length == 0) {
            return 0;
        } else {
            // al.remove(index);
            return tab[tab.length - 1] + sommeTabInt(Arrays.copyOf(tab, tab.length - 1));
        }
    }
}