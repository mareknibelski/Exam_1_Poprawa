import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        System.out.println(getLongestWord());

    }

    static String getLongestWord() {

        Scanner scann = new Scanner(System.in);
        System.out.println("Wprowadż tekst");
        String text = scann.nextLine();
        String max = "";

        while (!text.equals("quit")) {
            if (text.length() > max.length()) {
                max = text;
            }
            text = scann.nextLine();
        }
        return max;
    }
}
