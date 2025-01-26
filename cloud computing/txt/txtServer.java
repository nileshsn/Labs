// import java.net.*;
// import java.io.*;

// public class txtServer {
//     private Socket socket = null;
//     private ServerSocket server = null;
//     private DataInputStream in = null;
//     private FileOutputStream fileOut = null;

//     public txtServer(int port) {
//         try {
//             server = new ServerSocket(port);
//             System.out.println("Server started and waiting for a client...");

//             socket = server.accept();
//             System.out.println("Client connected");

//             in = new DataInputStream(socket.getInputStream());

//             while (true) {
//                 String filename = in.readUTF();
//                 if (filename.equalsIgnoreCase("exit")) {
//                     System.out.println("Client has terminated the connection.");
//                     break;
//                 }

//                 System.out.println("Receiving file: " + filename);

//                 String adjustedFilename = "received_" + filename.replace("\\", "/");
//                 fileOut = new FileOutputStream(adjustedFilename);
//                 int bytesRead;
//                 byte[] buffer = new byte[4096];

//                 while ((bytesRead = in.read(buffer)) != -1) {
//                     fileOut.write(buffer, 0, bytesRead);

//                     if (in.available() == 0) break;
//                 }

//                 System.out.println("File " + filename + " received successfully.");

//                 fileOut.close();
//             }

//             in.close();
//             socket.close();
//             server.close();
//         } catch (IOException i) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String args[]) {
//         txtServer server = new txtServer(5004);
//     }
// }


import java.io.*;
import java.net.*;

public class txtServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5004)) {
            System.out.println("Server started. Waiting for client...");
            try (Socket socket = server.accept();
                 DataInputStream in = new DataInputStream(socket.getInputStream())) {

                System.out.println("Client connected.");
                String filename = in.readUTF();
                while (!filename.equals("Over")) {

                    System.out.println("Receiving file: " + filename);
                    try (FileOutputStream fileOut = new FileOutputStream("received_" + filename)) {
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = in.read(buffer)) != -1) {
                            fileOut.write(buffer, 0, bytesRead);
                        }
                    }
                    System.out.println("File received: " + filename);
                }
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
