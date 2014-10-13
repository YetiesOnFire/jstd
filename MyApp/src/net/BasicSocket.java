package net;
import java.io.IOException;
import java.net.*;
public class BasicSocket {

	public static void main(String[] args) throws UnknownHostException, IOException{
		
		
		
		
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		
		Address = InetAddress.getByName("ua.pmvf.net");
		System.out.println(Address);
		try(Socket s= new Socket("localhost", 3306)){
	
		System.out.println("connection:"+s.isConnected()+"; port:" + s.getPort() +"; local port:"+ s.getLocalPort()); 
		System.out.println("local address: "+s.getLocalAddress()); 
		System.out.println("getInetAddress:" +s.getInetAddress()+"; Streams: "+s.getInputStream());
		System.out.println(s.isClosed());
		}catch(Exception e) {
			System.out.println(e);
		}
	
		
				
			
			
	}

}
