package demo;

import java.io.IOException;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketServerExample {
   
	private static ServerSocket server;
	
	public static void main(String args[]) throws IOException
	{
		server=new ServerSocket(3334);
		
		while(true)
		{
			
			System.out.println("waiting for client request");
			
			Socket socket=server.accept();
			
			System.out.println("Request receved :"+socket);
			
			socket.close();
			
			System.out.println("socket closed");
			
		}
	}
	
}