import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {

        int[][] tab = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.toString(rowSum(tab)));

    }

    static int[] rowSum(int[][] tab) {

        int[] sum = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                sum[i] += tab[i][j];
            }
        }
        return sum;
    }
}
