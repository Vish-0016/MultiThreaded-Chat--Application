import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 5678;

        try {
            Socket socket = new Socket(hostname, port);
            System.out.println("Connected to chat server");

            Thread reader = new Thread(new ReadHandler(socket));
            reader.start();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            String message;
            while ((message = in.readLine()) != null) {
                out.println(message);

            }

        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }

    static class ReadHandler implements Runnable {
        private Socket socket;

        public ReadHandler(Socket socket) {
            if (socket == null) {
                throw new IllegalArgumentException("Socket cannot be null");
            }
            this.socket = socket;        }

        

        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg;
                while ((msg = reader.readLine()) != null) {
                    System.out.println(" " + msg);
                }
            } catch (IOException e) {
                System.out.println("Server disconnected. ");
            }
        }
    }
}
