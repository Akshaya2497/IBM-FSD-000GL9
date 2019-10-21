package multicastRouting.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastChatServer {
	public static void main(String args[])
		    throws Exception {
		        
		        // Default port number we are going to use
		        int portnumber = 1236;
		        
		        // Create a MulticastSocket
		        MulticastSocket serverMulticastSocket =
		                new MulticastSocket(portnumber);
		        System.out.println("MulticastSocket is created...");
		        
		        // Determine the IP address of a host, given the host name
		        InetAddress group =
		                InetAddress.getByName("chat-server");
		        
		        // getByName- returns IP address of given host
		        serverMulticastSocket.joinGroup(group);
		        System.out.println("joinGroup method is called...");
		        boolean infinite = true;
		        
		        // Continually receives data and prints them 
		        while(infinite) {
		            byte buf[] = new byte[1024];
		            DatagramPacket data =
		                    new DatagramPacket(buf, buf.length);
		            serverMulticastSocket.receive(data);
		            String msg =
		                    new String(data.getData()).trim();
		            System.out.println("Message received from client = " + msg);
		            System.out.println("Message to client");
		            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		            msg = br.readLine();
		            data = new DatagramPacket(msg.getBytes(), 0,
		                    msg.length(), group, portnumber);
		            serverMulticastSocket.send(data);
		        }
		        
		        serverMulticastSocket.close();
		    }
}
