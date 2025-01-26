import java.io.*;
import java.net.*;

public class appClient {
    private Socket socket = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public appClient(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected to server.");

            in = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());

            String line = "";
            while (!line.equals("Over")) {
                try {
                    System.out.print("Enter message: ");
                    line = in.readLine(); // Read input from user
                    out.writeUTF(line);  // Send message to server
                } catch (IOException i) {
                    System.out.println(i);
                }
            }
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        } 
        try {
            in.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        new appClient("localhost", 5000);
    }
}







