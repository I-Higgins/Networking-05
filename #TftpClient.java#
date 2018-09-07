
import java.net.*;
import java.io.*;
import java.lang.*;

public class SimpleClient extends TftpUtility {

    public static void main(String args[]) {


	DatagramSocket dataSock;
	DatagramPacket dataPack;
	DatagramPacket message;
	
	String filename;
	int portNum;
	InetAddress server;
	
	    try {
		dataSock = new DatagramSocket();
		
		if (args.Length != 3)
		    {
			System.out.println("Please enter a filename, serverIP and port number");
			return;
		    }
		
			filename = args[0]
			    server = getInetAddress(args[1]);
			try
				portNum = Integer.parseInt(args[2]);
			catch(Exception e)
			    System.out.println("Please enter valid port number");

			byte[] sending = filename.getBytes();
			message = packRRQDatagramPacket(sending);

	    }
	    catch(Excepiton e)
		{
		    System.out.println("Error connecting to server ->  *" + e);
		}
	    
    }
}
