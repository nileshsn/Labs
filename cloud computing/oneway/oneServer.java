// import java.io.*;
// import java.net.*;

// public class oneServer {
//     private Socket socket = null;
//     private DataInputStream in = null;
//     private ServerSocket server = null;

//     public oneServer(int port) {
//         try {
//             server = new ServerSocket(port);
//             System.out.println("Server started on port " + port);
//             System.out.println("Waiting for client connection...");

//             socket = server.accept();
//             System.out.println("Client connected.");

//             in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

//             String line = "";
//             while (!line.equals("Over")) {
//                 try {
//                     line = in.readUTF();
//                     System.out.println("Client: " + line);
//                 } catch (IOException i) {
//                     System.out.println(i);
//                 }
//             }

//             System.out.println("Closing connection...");
//             in.close();
//             socket.close();
//         } catch (IOException i) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String args[]) {
//         new oneServer(5000);
//     }
// }



import java.io.*;
import java.net.*;

public class oneServer {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(5000)) {
            System.out.println("Server is running...");
            try (Socket socket = ss.accept();
                 DataInputStream in = new DataInputStream(socket.getInputStream())) {
                 
                System.out.println("Client connected.");
                String message = "";
                while (!message.equals("Over")) {
                    message = in.readUTF();
                    System.out.println("Client: " + message);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
