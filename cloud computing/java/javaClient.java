// import java.io.*;
// import java.net.*;

// public class javaClient {
//     private Socket socket = null;
//     private DataInputStream in = null;
//     private DataOutputStream out = null;

//     public javaClient(String address, int port) {
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
//         new javaClient("localhost", 5001);
//     }
// }




import java.io.*;
import java.net.*;

public class javaClient {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 5000);
             DataInputStream in = new DataInputStream(System.in);
             DataOutputStream out = new DataOutputStream(s.getOutputStream())) {

            System.out.println("Connected to server.");
            String fileName = "";
            while (!fileName.equals("Over")) {
                System.out.print("Enter Java file name: ");
                fileName = in.readLine(); 
                out.writeUTF(fileName); 
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
