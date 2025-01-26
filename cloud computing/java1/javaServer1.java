// import java.io.*;
// import java.net.*;

// public class javaServer1 {
//     private Socket socket = null;
//     private DataInputStream in = null;
//     private DataOutputStream out = null;
//     private ServerSocket server = null;

//     public javaServer1(int port) {
//         try {
//             server = new ServerSocket(port);
//             System.out.println("Server started on port " + port);
//             System.out.println("Waiting for client connection...");

//             socket = server.accept();
//             System.out.println("Client connected.");

//             in = new DataInputStream(socket.getInputStream());
//             out = new DataOutputStream(socket.getOutputStream());

//             String filename = "";
//             while (!(filename = in.readUTF()).equals("Over")) {
//                 try {
//                     // Compile the Java file
//                     Process compileProcess = Runtime.getRuntime().exec("javac " + filename + ".java");
//                     compileProcess.waitFor();

//                     if (compileProcess.exitValue() == 0) {
//                         // Execute the compiled Java program
//                         Process executeProcess = Runtime.getRuntime().exec("java " + filename);
//                         BufferedReader outputReader = new BufferedReader(new InputStreamReader(executeProcess.getInputStream()));
//                         BufferedReader errorReader = new BufferedReader(new InputStreamReader(executeProcess.getErrorStream()));

//                         String line;
//                         while ((line = outputReader.readLine()) != null) {
//                             out.writeUTF(line);
//                         }

//                         while ((line = errorReader.readLine()) != null) {
//                             out.writeUTF("ERROR: " + line);
//                         }

//                         out.writeUTF("END"); // Indicate end of program output
//                     } else {
//                         // Compilation error
//                         BufferedReader errorReader = new BufferedReader(new InputStreamReader(compileProcess.getErrorStream()));
//                         String line;
//                         while ((line = errorReader.readLine()) != null) {
//                             out.writeUTF("COMPILATION ERROR: " + line);
//                         }
//                         out.writeUTF("END"); // Indicate end of error messages
//                     }
//                 } catch (IOException | InterruptedException e) {
//                     out.writeUTF("Server Error: " + e.getMessage());
//                     out.writeUTF("END");
//                 }
//             }

//             System.out.println("Closing connection...");
//             in.close();
//             out.close();
//             socket.close();
//         } catch (IOException i) {
//             System.out.println("IO Error: " + i);
//         }
//     }

//     public static void main(String args[]) {
//         new javaServer1(5005);
//     }
// }





import java.io.*;
import java.net.*;

public class javaServer1 {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(5000)) {
            System.out.println("Server is running...");
            try (Socket s = ss.accept();
                 DataInputStream in = new DataInputStream(s.getInputStream());
                 DataOutputStream out = new DataOutputStream(s.getOutputStream())) {

                System.out.println("Client connected.");
                String line = "";
                while (!line.equals("Over")) {
                    line = in.readUTF();  
                    if (!line.equals("Over")) {
                        Runtime rt = Runtime.getRuntime();
                        Process p = rt.exec("javac " + line + ".java");
                        Process p2 = rt.exec("java " + line);  
                        BufferedReader br = new BufferedReader(new InputStreamReader(p2.getInputStream()));
                        String output = br.readLine(); 
                        out.writeUTF(output); 
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
