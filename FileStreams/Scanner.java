import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        String fileName = "contoh.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String baris = scanner.nextLine();
                System.out.println(baris);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
