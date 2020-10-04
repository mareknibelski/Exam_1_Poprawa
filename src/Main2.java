
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getStartWith("jak nauczyć się programować w javie", 'j')));

    }

    static String[] getStartWith(String str, char c) {

        int cout = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                cout++;
            }
        }

        String[] tab = new String[cout];
        String[] parts = str.split(" ");

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < parts.length; j++) {
                if (parts[j].startsWith(String.valueOf(c))) {
                    tab[i] = parts[j];
                    i++;
                }
            }
        }
        return tab;
    }

}
