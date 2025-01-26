// import java.net.*;
// import java.io.*;

// class cmdClient {
//     public static void main(String args[]) throws Exception {
//         Socket s = new Socket("localhost", 3333);
//         DataInputStream din = new DataInputStream(s.getInputStream());
//         DataOutputStream dout = new DataOutputStream(s.getOutputStream());
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         String str = "", str2 = "";
//         while (!str.equals("stop")) {
//             System.out.print("Enter command to execute on server: ");
//             str = br.readLine();
//             str = str.replace("\\", "/");

//             dout.writeUTF(str);
//             dout.flush();
//             str2 = din.readUTF();
//             System.out.println("Server output: " + str2);
//         }

//         dout.close();
//         s.close();
//     }
// }


import java.io.*;
import java.net.*;

public class cmdClient {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 3333);
             DataInputStream din = new DataInputStream(s.getInputStream());
             DataOutputStream dout = new DataOutputStream(s.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server.");
            String command = "";

            while (!command.equalsIgnoreCase("stop")) {
                System.out.print("Enter command to execute on server: ");
                command = br.readLine();

                dout.writeUTF(command);
                dout.flush();

                String response = din.readUTF();
                System.out.println("Server output:\n" + response);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
