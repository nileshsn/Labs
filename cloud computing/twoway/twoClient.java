// import java.io.*;
// import java.net.*;

// class twoClient {
//     public static void main(String args[]) {
//         try {
//             Socket s = new Socket("localhost", 3333);
//             DataInputStream in = new DataInputStream(s.getInputStream());
//             DataOutputStream out = new DataOutputStream(s.getOutputStream());
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//             String str = "", str2 = "";
//             while (!str.equals("stop")) {
//                 System.out.print("Enter message: ");
//                 str = br.readLine();
//                 out.writeUTF(str);
//                 out.flush();

//                 str2 = in.readUTF();
//                 System.out.println("Server says: " + str2);
//             }

//             out.close();
//             in.close();
//             s.close();
//         } catch (IOException i) {
//             System.out.println(i);
//         }
//     }
// }


import java.io.*;
import java.net.*;

public class twoClient {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 3333);
             DataInputStream in = new DataInputStream(s.getInputStream());
             DataOutputStream out = new DataOutputStream(s.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
             
            String message = "", response = "";
            while (!message.equals("Over")) {
                System.out.print("Enter message: ");
                message = br.readLine();
                out.writeUTF(message);
                
                response = in.readUTF();
                System.out.println("Server says: " + response);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

