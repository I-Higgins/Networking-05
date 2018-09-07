
import java.net.*;
import java.io.*;
import java.lang.*;

public class SimpleClient {

    public static void main(String args[]) {

        try {
            //Declare vaiables for arguments passed in
            String name = args[0].toString();

	    //Setup client socket to connect to server
	    byte[] buf = new byte[1472];
	    DatagramPacket clientPacket = new DatagramPacket(buf, 1472);
	    

	    FileOutputStream OutputStream = new FileOutputStream(name);

	    while(true)
		{
		    byte[] buf = new byte[1472];
		    DatagramPacket p = new DatagramPacket(buf, 1472);

		    clientSocket.receive(p);

		    
		    OutputStream.write(byte[] b);`
		}
        }
        catch (Exception e)
        {
            //Print error message
            System.out.print("There was an error: " + e);
        }
    }
}
