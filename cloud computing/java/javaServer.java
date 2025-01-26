// import java.io.*;
// import java.net.*;

// public class javaServer {
//     private Socket socket = null;
//     private DataInputStream in = null;
//     private ServerSocket server = null;

//     public javaServer(int port) {
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
//                     Runtime rt = Runtime.getRuntime();
//                     if (!line.equals("Over")) {
//                         Process p = rt.exec("javac " + line + ".java");
//                         Process p2 = rt.exec("java " + line);
//                         BufferedReader in = new BufferedReader(new InputStreamReader(p2.getInputStream()));
//                         OutputStream out = p2.getOutputStream();
//                         String input = "";
//                         System.out.println("Dear client, your java program output is as follows:");
//                         line = in.readLine();
//                         System.out.println(line);
//                         input = input + "\n";
//                         out.write(input.getBytes());
//                         out.flush();
//                     }
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
//         new javaServer(5001);
//     }
// }





import java.io.*;
import java.net.*;

public class javaServer {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(5000)) {
            System.out.println("Server is running...");
            try (Socket s = ss.accept();
                 DataInputStream in = new DataInputStream(s.getInputStream())) {

                System.out.println("Client connected.");
                String line = "";
                while (!line.equals("Over")) {
                    line = in.readUTF();  
                    if (!line.equals("Over")) {
                        Runtime rt = Runtime.getRuntime();
                        Process p = rt.exec("javac " + line + ".java");  
                        Process p2 = rt.exec("java " + line);  
                        BufferedReader reader = new BufferedReader(new InputStreamReader(p2.getInputStream()));
                        String output = reader.readLine();
                        System.out.println("Output: " + output);  
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
