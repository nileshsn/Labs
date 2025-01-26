// import java.net.*;
// import java.io.*;
// import java.util.Scanner;

// public class txtClient {
//     private Socket socket = null;
//     private FileInputStream fin = null;
//     private DataOutputStream out = null;

//     public txtClient(String address, int port) {
//         try {
//             socket = new Socket(address, port);
//             System.out.println("Connected to the server");

//             out = new DataOutputStream(socket.getOutputStream());
//             Scanner sc = new Scanner(System.in);

//             while (true) {
//                 System.out.print("Enter the filename to send (or 'exit' to quit): ");
//                 String filename = sc.nextLine();

//                 if (filename.equalsIgnoreCase("exit")) {
//                     out.writeUTF("exit");
//                     break;
//                 }

//                 out.writeUTF(filename);

//                 try {
//                     String adjustedFilename = filename.replace("\\", "/");
//                     fin = new FileInputStream(adjustedFilename);
//                     int bytesRead;
//                     byte[] buffer = new byte[4096];

//                     while ((bytesRead = fin.read(buffer)) != -1) {
//                         out.write(buffer, 0, bytesRead);
//                     }

//                     System.out.println("File " + filename + " sent successfully.");

//                     fin.close();
//                 } catch (FileNotFoundException e) {
//                     System.out.println(e);
//                 }
//             }

//             sc.close();
//             out.close();
//             socket.close();
//         } catch (IOException i) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String args[]) {
//         txtClient client = new txtClient("localhost", 5004);
//     }
// }



import java.io.*;
import java.net.*;
import java.util.Scanner;

public class txtClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5004);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             Scanner sc = new Scanner(System.in)) {

            System.out.println("Connected to the server.");

            String filename = sc.nextLine();
            while (!filename.equals("Over")) {
                System.out.print("Enter filename: ");

                out.writeUTF(filename);
                try (FileInputStream fin = new FileInputStream(filename)) {
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = fin.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found: " + filename);
                }
                System.out.println("File sent.");
            }
        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
