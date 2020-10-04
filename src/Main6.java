import java.util.ArrayList;
import java.util.Collections;


public class Main6 {

    static int max = 0;

    public static void main(String[] args) {

        int[] tab = {1,2,2,1,3,2};

        countOccurrences(tab);

    }

    static int[][] countOccurrences(int[] tab) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int num = tab[0];
        int count = 0;

        for (int i = 0; i < tab.length; i++) {
            if (!list.contains(tab[i])) {
                list.add(tab[i]);
            }
        }

        Collections.sort(list);

        int[][] occur = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < tab.length; j++) {
                if (list.get(i) == tab[j]) {
                    count++;
                }
            }
            occur[i][0] = list.get(i);
            occur[i][1] = count;
            count = 0;
        }

        System.out.println("[");
        for (int i = 0; i < occur.length; i++) {
            for (int j = 0; j < occur[i].length; j++) {
                if (j > 0) {
                    if (i > occur.length - 2) {
                        System.out.print(" " + occur[i][j] + "]");
                    } else {
                        System.out.print(" " + occur[i][j] + "],");
                    }
                } else {
                    System.out.print("[" + occur[i][j] + ",");
                }
            }
            System.out.println();
        }
        System.out.println("]");

        return occur;

    }

}
