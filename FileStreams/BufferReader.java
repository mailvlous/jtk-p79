import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        String fileName = "contoh.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String baris;
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
