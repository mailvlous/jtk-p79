import java.io.*;
import java.net.*;

public class SimpleTCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("Hello Server!");
            String response = in.readLine();
            System.out.println("Server says: " + response);

        } catch (ConnectException e) {
            System.err.println("Unable to connect to server. Is it running?");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
