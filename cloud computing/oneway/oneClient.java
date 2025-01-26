// import java.io.*;
// import java.net.*;

// public class oneClient {
//     private Socket socket = null;
//     private DataInputStream in = null;
//     private DataOutputStream out = null;

//     public oneClient(String address, int port) {
//         try {
//             socket = new Socket(address, port);
//             System.out.println("Connected to server.");

//             in = new DataInputStream(System.in);
//             out = new DataOutputStream(socket.getOutputStream());

//             String line = "";
//             while (!line.equals("Over")) {
//                 try {
//                     System.out.print("Enter message: ");
//                     line = in.readLine(); // Read input from user
//                     out.writeUTF(line);  // Send message to server
//                 } catch (IOException i) {
//                     System.out.println(i);
//                 }
//             }
//         } catch (UnknownHostException u) {
//             System.out.println(u);
//         } catch (IOException i) {
//             System.out.println(i);
//         } 
//         try {
//             in.close();
//             out.close();
//             socket.close();
//         } catch (IOException i) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String args[]) {
//         new oneClient("localhost", 5000);
//     }
// }


import java.io.*;
import java.net.*;

public class oneClient {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 5000);
             DataInputStream in = new DataInputStream(System.in);
             DataOutputStream out = new DataOutputStream(s.getOutputStream())) {
             
            System.out.println("Connected to server.");
            String message = "";
            while (!message.equals("Over")) {
                System.out.print("Enter message: ");
                message = in.readLine();
                out.writeUTF(message);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
