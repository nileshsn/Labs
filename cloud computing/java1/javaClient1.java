// import java.io.*;
// import java.net.*;

// public class javaClient1 {
//     private Socket socket = null;
//     private BufferedReader userInput = null; // Updated for modern input handling
//     private DataInputStream serverInput = null;
//     private DataOutputStream out = null;

//     public javaClient1(String address, int port) {
//         try {
//             socket = new Socket(address, port);
//             System.out.println("Connected to server.");

//             userInput = new BufferedReader(new InputStreamReader(System.in));
//             serverInput = new DataInputStream(socket.getInputStream());
//             out = new DataOutputStream(socket.getOutputStream());

//             String line = "";
//             while (!line.equals("Over")) {
//                 try {
//                     System.out.print("Enter Java filename (without .java) or 'Over' to quit: ");
//                     line = userInput.readLine();
//                     out.writeUTF(line);  // Send filename to server

//                     if (!line.equals("Over")) {
//                         // Receive program output from server
//                         String response;
//                         while (!(response = serverInput.readUTF()).equals("END")) {
//                             System.out.println(response);
//                         }
//                     }
//                 } catch (IOException i) {
//                     System.out.println("IO Error: " + i);
//                 }
//             }
//         } catch (UnknownHostException u) {
//             System.out.println("Unknown Host: " + u);
//         } catch (IOException i) {
//             System.out.println("IO Error: " + i);
//         } finally {
//             try {
//                 if (userInput != null) userInput.close();
//                 if (serverInput != null) serverInput.close();
//                 if (out != null) out.close();
//                 if (socket != null) socket.close();
//             } catch (IOException i) {
//                 System.out.println("Error closing resources: " + i);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         new javaClient1("localhost", 5005);
//     }
// }


import java.io.*;
import java.net.*;

public class javaClient1 {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 5000);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             DataOutputStream out = new DataOutputStream(s.getOutputStream());
             DataInputStream in = new DataInputStream(s.getInputStream())) {

            System.out.println("Connected to server.");
            String fileName = "";
            while (!fileName.equals("Over")) {
                System.out.print("Enter Java file name: ");
                fileName = br.readLine(); 
                out.writeUTF(fileName); 

                if (!fileName.equals("Over")) {
                    String output = in.readUTF();
                    System.out.println("Output: " + output);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
