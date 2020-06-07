package multicastRouting.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastChatClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Default port number we are going to use
        int portnumber = 1234;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }
        
        // Create a MulticastSocket
        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
        
        // Determine the IP address of a host, given the host name
        InetAddress group =
                InetAddress.getByName("224.0.0.1");
        
        // Joins a multicast group
        chatMulticastSocket.joinGroup(group);
        
        // Prompt a user to enter a message
        String msg = "";
        System.out.println("Enter exit to quit! Type a message for the server:");
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        msg = br.readLine();
        
        
        while(!msg.equalsIgnoreCase("exit")) {
        // Send the message to Multicast address
        DatagramPacket data = new
                DatagramPacket(msg.getBytes(), 0,
                msg.length(), group, portnumber);
        chatMulticastSocket.send(data);
        boolean res = true;
        //msg from server
        
        byte buff[] = new byte[1024];
		DatagramPacket response = new DatagramPacket(buff,buff.length);
		chatMulticastSocket.receive(response);
		String reply =
                new String(response.getData()).trim();
        System.out.println("Message received from server = " + reply);
        System.out.println("Enter exit to quit! Type a message for the server:");
        br =new BufferedReader(new InputStreamReader(System.in));
        msg = br.readLine();
        
        // Close the socket
        chatMulticastSocket.close();
        }
}
}

