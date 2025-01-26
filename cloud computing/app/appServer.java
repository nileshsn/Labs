import java.io.*;
import java.net.*;

public class appServer {
    private Socket socket = null;
    private DataInputStream in = null;
    private ServerSocket server = null;

    public appServer(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started on port " + port);
            System.out.println("Waiting for client connection...");

            socket = server.accept();
            System.out.println("Client connected.");

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = "";
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    Runtime.getRuntime().exec(line);
                } catch (IOException i) {
                    System.out.println(i);
                }
            }

            System.out.println("Closing connection...");
            in.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        new appServer(5000);
    }
}



