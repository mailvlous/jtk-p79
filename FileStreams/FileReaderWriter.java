import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) {
        String fileName = "contoh.txt";
        String data = "Ini adalah contoh FileReader dan FileWriter di Java.";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("File berhasil ditulis.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(fileName)) {
            int karakter;
            while ((karakter = reader.read()) != -1) {
                System.out.print((char) karakter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
