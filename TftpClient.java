
import java.net.*;
import java.io.*;
import java.lang.*;

public class SimpleClient {

    public static void main(String args[]) {


	DatagramSocket dataSock;
	
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

			
	
	    }
	    catch(Exception e)
		{
		    System.err.println("An exception occurred -> " + e);
		}
	






	
    }
}
