import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(host, port)) {
            System.out.println("Connected to server at " + host + ":" + port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String messageToSend = "Hello Server, this is the Client!";
            out.println(messageToSend);
            System.out.println("Sent to server: " + messageToSend);

                       String serverResponse = in.readLine();
            System.out.println("Received from server: " + serverResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}