// import java.io.*;
// import java.net.*;

// public class javaClient2 {
//     private Socket socket = null;
//     private BufferedReader userInput = null;
//     private DataOutputStream out = null;
//     private BufferedReader serverResponse = null;

//     public javaClient2(String address, int port) {
//         try {
//             socket = new Socket(address, port);
//             System.out.println("Connected to server.");

//             userInput = new BufferedReader(new InputStreamReader(System.in));
//             out = new DataOutputStream(socket.getOutputStream());
//             serverResponse = new BufferedReader(new InputStreamReader(socket.getInputStream()));

//             System.out.print("Enter the name of the Java file to send (without path, or 'Over' to quit): ");
//             String fileName = userInput.readLine(); // Updated to use BufferedReader

//             if (!fileName.equals("Over")) {
//                 File file = new File(fileName); // Create file object with relative path
//                 if (file.exists() && file.isFile()) {
//                     out.writeUTF(file.getName()); // Send file name to the server
//                     FileInputStream fis = new FileInputStream(file);
//                     byte[] buffer = new byte[4096];
//                     int bytesRead;
//                     while ((bytesRead = fis.read(buffer)) > 0) {
//                         out.write(buffer, 0, bytesRead);
//                     }
//                     fis.close();
//                     out.flush();
//                     System.out.println("File sent successfully.");

//                     // Receive program output from the server
//                     String response;
//                     System.out.println("Server output:");
//                     while (!(response = serverResponse.readLine()).equals("END")) {
//                         System.out.println(response);
//                     }
//                 } else {
//                     System.out.println("File not found in the current directory. Please check the name and try again.");
//                 }
//             }
//         } catch (IOException i) {
//             System.out.println("Error: " + i.getMessage());
//         } finally {
//             try {
//                 userInput.close();
//                 out.close();
//                 socket.close();
//             } catch (IOException i) {
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         new javaClient2("localhost", 5001);
//     }
// }


import java.io.*;
import java.net.*;

public class javaClient2 {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 5001);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             DataOutputStream out = new DataOutputStream(s.getOutputStream());
             DataInputStream in = new DataInputStream(s.getInputStream())) {

            System.out.println("Connected to server.");
            String fileName = "";
            while (!fileName.equals("Over")) {
                System.out.print("Enter Java file name: ");
                fileName = br.readLine(); 

                if (!fileName.equals("Over")) {
                    out.writeUTF(fileName); // Send file name to server

                    File file = new File(fileName);
                    if (file.exists() && file.isFile()) {
                        try (FileInputStream fis = new FileInputStream(file)) {
                            byte[] buffer = new byte[4096];
                            int bytesRead;
                            while ((bytesRead = fis.read(buffer)) > 0) {
                                out.write(buffer, 0, bytesRead);
                            }
                        }
                        out.flush();
                        System.out.println("File sent successfully.");

                        // Receive program output from server
                        String response;
                        System.out.println("Server output:");
                        while (!(response = in.readUTF()).equals("END")) {
                            System.out.println(response);
                        }
                    } else {
                        System.out.println("File not found.");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
