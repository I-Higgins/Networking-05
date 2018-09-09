
import java.net.*;
import java.io.*;
import java.lang.*;

public class TftpClient extends TftpUtility {

    public static void main(String args[]) {
	
	
	DatagramSocket dataSock;
	DatagramPacket dataPack;
	DatagramPacket message;
	
	String filename;
	int portNum = 0;
	InetAddress server;
	int count = 0;
	
	try {
	    dataSock = new DatagramSocket();
	    
	    if (args.length != 3)
		{
		    System.out.println("Please enter a filename, serverIP and port number");
		    return;
		}
	    
	    filename = args[0];
	    server = InetAddress.getByName(args[1]);
	    
	    try{
		portNum = Integer.parseInt(args[2]);
	    }
	    catch(Exception e){
		System.out.println("Please enter valid port number");
	    }
	    
	    //Create byte array to send data
	    byte[] filenameBytes = filename.getBytes();
	    byte[] sending = new byte[filenameBytes.length + 1];
	    filenameBytes[0] = RRQ;
	    //Create packet contents
	    for (int i = 0; i < sending.length - 1; i ++)
		{
		    sending[i + 1] = filenameBytes[i];
		}
	    message = new DatagramPacket(sending, sending.length, server, portNum);
	    
	    
	    
	    //Increment count by 1
	    count ++;
	    try {
		//Send the packet
		dataSock.send(message);
		System.out.println("Packet " + Integer.toString(count) + " was sent");
	    }
	    catch(Exception e)
		{
		    System.out.println("Error sending packet");
		}
	    
	}
	catch(Exception e)
	    {
		//Print error message
		System.out.println("Error connecting to server ->  *" + e + "*");
		return;
	    }
	
	try  {
	    //Create a timeout on the DatagramSocket
	    dataSock.setSoTimeout(70000);
	    //Create a byte array to receive the data into
	    byte[] buf = new byte[1020];
	    //Create a packet to receive the data using the byte array
	    dataPack = new DatagramPacket(buf, 1020);
	    //Wait to receive a packet
	    dataSock.receive(dataPack);
	    //Print success message
	    System.out.println("Received a packet from server");
	    
	}
	catch(SocketTimeoutException e)
	    {
		//Print error message
		System.out.println("The server timed out  ->  " + e);
	    }
	catch(Exception e)
	    {
		//Print error message
		System.out.println("There was an error receiving file");
	    }
	
	    
	    
    }
}
