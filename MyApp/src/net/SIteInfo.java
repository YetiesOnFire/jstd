package net;
import java.net.*;

import java.io.*;


public class SIteInfo {

	public static void main(String[] args) throws Exception {
				
		int c;
		try(Socket sock= new Socket("whois.internic.net", 43)){
		InputStream in = sock.getInputStream();
		OutputStream out= sock.getOutputStream();
		
		
		
		//������� �������� � ������ ��� ��� �������� ������ � � ��� � ��������.
//		String str= (args.length == 0 ? "pmvf.net":args[0])+"\n";   //��� ���� ������� 
		
		
		String str= "pmvf.net" +"\n";
		byte buf[]=str.getBytes();
		out.write(buf);
		
		
		
		while((c= in.read())!=-1) {
			System.out.print((char)c);
			}
		}	catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
