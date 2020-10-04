import java.util.ArrayList;

public class Main7 {

    public static void main(String[] args) {

        System.out.println(repeats("Ala ma kota, a kot ma Alę"));

    }

    static boolean repeats(String line) {

        boolean check = false;
        int count = 0;
        ArrayList<String> list = new ArrayList<>();

        String[] parts = line.split(" ");

        for (int i = 0; i < parts.length; i++) {
            list.add(parts[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < parts.length; j++) {
                if (list.get(i).equals(parts[j])) {
                    count++;
                    if (count > list.size()) {
                        check = true;
                    }
                }
            }
        }

        return check;

    }

}
