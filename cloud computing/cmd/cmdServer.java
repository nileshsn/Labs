// import java.net.*;
// import java.io.*;

// class cmdServer {
//     public static void main(String args[]) {
//         ServerSocket ss = null;
//         Socket s = null;
//         DataInputStream in = null;
//         DataOutputStream out = null;

//         try {
//             ss = new ServerSocket(3333);
//             System.out.println("Server waiting for client connection...");
//             s = ss.accept();
//             System.out.println("Client connected!");

//             in = new DataInputStream(s.getInputStream());
//             out = new DataOutputStream(s.getOutputStream());

//             String command = "";
//             while (!command.equals("stop")) {
//                 command = in.readUTF();
//                 System.out.println("Client wants to execute: " + command);

//                 command = command.replace("/", "\\");

//                 String result = executeCommand(command);

//                 out.writeUTF(result);
//                 out.flush();
//             }
//         } catch (IOException i) {
//             System.out.println(i);
//         }
//     }

//     private static String executeCommand(String command) {
//         StringBuilder output = new StringBuilder();
//         try {
//             Process p = Runtime.getRuntime().exec("cmd /c " + command);
//             BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
//             String line;

//             while ((line = reader.readLine()) != null) {
//                 output.append(line).append("\n");
//             }

//             try {
//                 int exitCode = p.waitFor();
//                 if (exitCode != 0) {
//                     output.append("Error: Command execution failed with exit code ").append(exitCode);
//                 }
//             } catch (InterruptedException e) {
//                 output.append("Process was interrupted: ").append(e.getMessage());
//             }
//         } catch (IOException i) {
//             output.append(i);
//         }
//         return output.toString();
//     }
// }



import java.io.*;
import java.net.*;

public class cmdServer {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(3333)) {
            System.out.println("Server is running...");
            try (Socket s = ss.accept();
                 DataInputStream in = new DataInputStream(s.getInputStream());
                 DataOutputStream out = new DataOutputStream(s.getOutputStream())) {

                System.out.println("Client connected.");
                String command = "";

                while (!command.equalsIgnoreCase("stop")) {
                    command = in.readUTF();
                    System.out.println("Received command: " + command);

                    String result = executeCommand(command);
                    out.writeUTF(result);
                    out.flush();
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String executeCommand(String command) {
        StringBuilder output = new StringBuilder();
        try {
            Process p = Runtime.getRuntime().exec("cmd /c " + command);
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    output.append(line).append("\n");
                }
            }

            int exitCode = p.waitFor();
            if (exitCode != 0) {
                output.append("Command failed with exit code ").append(exitCode);
            }
        } catch (IOException | InterruptedException e) {
            output.append("Error: ").append(e.getMessage());
        }
        return output.toString().trim();
    }
}
