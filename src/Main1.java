import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getDecreasingTab(8)));

    }

    static int[] getDecreasingTab(int size) {

        int[] tab = new int[size];
        int a = size * 2;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = a;
            a -= 2;
        }
        return tab;
    }
}
