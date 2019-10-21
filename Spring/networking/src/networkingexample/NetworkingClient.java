package networkingexample;

import java.io.*;
import java.net.*;

public class NetworkingClient {
    
    public static String main(String args) {
    	String ans="";
    	//int i=args[0];
        Socket client = null;
        
        // Default port number we are going to use
        int portnumber = 1234;
        
        
        
            try {
                String msg = "";
                
                // Create a client socket
                
                client = new Socket(InetAddress.getLocalHost(), portnumber);
                System.out.println("Client socket is created " + client);
                
                // Create an output stream of the client socket
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);
                
                // Create an input stream of the client socket
               // InputStream clientIn = client.getInputStream();
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(clientIn));
                
                // Create BufferedReader for a standard input
                InputStream in = new ByteArrayInputStream( args.getBytes());
                BufferedReader stdIn = new BufferedReader(new
                        InputStreamReader(in));
                
                System.out.println("Enter the number to find factorial. Type Bye to exit. ");
                
                // Read data from standard input device and write it
                // to the output stream of the client socket.
                System.out.println(msg = stdIn.readLine().trim());
                pw.println(msg);
                ans=br.readLine();
                // Read data from the input stream of the client socket.
                System.out.println("Message returned from the server = " +ans);
               
                
                pw.close();
                br.close();
                client.close();
                
                // Stop the operation
//                if (msg.equalsIgnoreCase("Bye")) {
//                    break;
//                }
                
                
            } catch (IOException ie) {
                System.out.println("I/O error - Start server and turn off Firewall" + ie);
            }
       
            return ans;
    }
}
