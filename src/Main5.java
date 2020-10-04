import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        findInFile("file", "Javy");

    }

    static void findInFile(String fileName, String search) {

        Path path = Paths.get("src/" + fileName);
        int count = 1;

        try {
            Scanner scann = new Scanner(path);

            while (scann.hasNextLine()) {
                String text = scann.nextLine();
                if (text.contains(search)) {
                    System.out.println(count);
                }
                count++;
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu");
        }
    }
}
