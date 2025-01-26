// import java.io.*;
// import java.net.*;

// public class javaServer2 {
//     private Socket socket = null;
//     private DataInputStream in = null;
//     private DataOutputStream out = null;
//     private ServerSocket server = null;

//     public javaServer2(int port) {
//         try {
//             server = new ServerSocket(port);
//             System.out.println("Server started on port " + port);
//             System.out.println("Waiting for client connection...");

//             socket = server.accept();
//             System.out.println("Client connected.");

//             in = new DataInputStream(socket.getInputStream());
//             out = new DataOutputStream(socket.getOutputStream());

//             String fileName = in.readUTF(); // Read the file name
//             File file = new File(fileName);

//             // Save the received file
//             FileOutputStream fos = new FileOutputStream(file);
//             byte[] buffer = new byte[4096];
//             int bytesRead;
//             while (in.available() > 0 && (bytesRead = in.read(buffer)) > 0) {
//                 fos.write(buffer, 0, bytesRead);
//             }
//             fos.close();
//             System.out.println("File received: " + fileName);

//             // Compile the Java file
//             Process compileProcess = Runtime.getRuntime().exec("javac " + fileName);
//             compileProcess.waitFor();

//             if (compileProcess.exitValue() == 0) {
//                 // Execute the compiled Java program
//                 String className = fileName.substring(0, fileName.lastIndexOf('.'));
//                 Process executeProcess = Runtime.getRuntime().exec("java " + className);
//                 BufferedReader outputReader = new BufferedReader(new InputStreamReader(executeProcess.getInputStream()));
//                 BufferedReader errorReader = new BufferedReader(new InputStreamReader(executeProcess.getErrorStream()));

//                 String line;
//                 while ((line = outputReader.readLine()) != null) {
//                     out.writeUTF(line);
//                 }

//                 while ((line = errorReader.readLine()) != null) {
//                     out.writeUTF("ERROR: " + line);
//                 }
//             } else {
//                 // Compilation error
//                 BufferedReader errorReader = new BufferedReader(new InputStreamReader(compileProcess.getErrorStream()));
//                 String line;
//                 while ((line = errorReader.readLine()) != null) {
//                     out.writeUTF("COMPILATION ERROR: " + line);
//                 }
//             }
//             out.writeUTF("END"); // Indicate end of server response
//             out.flush();

//         } catch (IOException | InterruptedException i) {
//             System.out.println("Server Error: " + i.getMessage());
//         } finally {
//             try {
//                 in.close();
//                 out.close();
//                 socket.close();
//             } catch (IOException i) {
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         new javaServer2(5001);
//     }
// }




import java.io.*;
import java.net.*;

public class javaServer2 {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(5001)) {
            System.out.println("Server started on port 5001.");
            try (Socket s = ss.accept();
                 DataInputStream in = new DataInputStream(s.getInputStream());
                 DataOutputStream out = new DataOutputStream(s.getOutputStream())) {

                System.out.println("Client connected.");
                String fileName = in.readUTF(); 

                File file = new File(fileName);
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while (in.available() > 0 && (bytesRead = in.read(buffer)) > 0) {
                        fos.write(buffer, 0, bytesRead);
                    }
                }
                System.out.println("File received: " + fileName);


                Process compileProcess = Runtime.getRuntime().exec("javac " + fileName);
                compileProcess.waitFor();

                if (compileProcess.exitValue() == 0) {
                    // Execute the compiled Java program
                    String className = fileName.substring(0, fileName.lastIndexOf('.'));
                    Process executeProcess = Runtime.getRuntime().exec("java " + className);
                    BufferedReader outputReader = new BufferedReader(new InputStreamReader(executeProcess.getInputStream()));

                    String line;
                    while ((line = outputReader.readLine()) != null) {
                        out.writeUTF(line);
                    }
                } else {
                    out.writeUTF("COMPILATION ERROR: Compilation failed.");
                }
                out.writeUTF("END"); // Indicate end of output
                out.flush();

            } catch (IOException | InterruptedException e) {
                System.out.println("Server Error: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}
