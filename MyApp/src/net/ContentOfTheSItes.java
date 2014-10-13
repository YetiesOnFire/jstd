package net;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class ContentOfTheSItes {

	public static void main(String[] args) throws Exception {
		int c;
		URL hp =new URL("http://ua.pmvf.net");
		URLConnection hpcon = hp.openConnection();
		
		
		long d = hpcon.getDate();
		if(d==0) {
			System.out.println("got no Date info");
		}else {
			System.out.println("date: "+new Date(d));
		}
		System.out.println("Content Type: "+hpcon.getContentType());
		
		
		d = hpcon.getExpiration();
		if (d==0) {
			System.out.println("no info about expiration date");
		}else {
			System.out.println("Expir: "+ new Date(d));
		}
		
		
		d= hpcon.getLastModified();
		if (d==0) {
			System.out.println("No info");
		}else {
			System.out.println("LastModDate: "+new Date(d));
		}
		long len =  hpcon.getContentLengthLong();
		if(len == -1) {
			System.out.println("no content lenght");
		}else {
			System.out.println("cont length: " + len);
		}
		if (len!=0) {
			System.out.println("===CONTENT===");
			InputStream input=hpcon.getInputStream();
			while(((c=input.read())!= -1)){
				System.out.print((char)c);
			}
			input.close();
		}else {
			System.out.println("No access to content");
		}
		
		

	}

}
