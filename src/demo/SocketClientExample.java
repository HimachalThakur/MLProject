package demo;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketClientExample {
	
	
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		
		Socket socket=new Socket("localhost",3334);
		socket.close();
	}

}
