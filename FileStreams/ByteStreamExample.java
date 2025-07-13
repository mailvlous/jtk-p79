import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        String fileName = "binary.dat";
        byte[] data = {65, 66, 67}; // ASCII A B C

        // Menulis byte
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Membaca byte
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
