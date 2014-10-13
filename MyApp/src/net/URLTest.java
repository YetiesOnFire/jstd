package net;

import java.net.*;
public class URLTest {

	public static void main(String[] args) {
		try {
			URL hp= new URL("http://www.HerbSchildt.com/Articles");
			System.out.println("protocol "+hp.getProtocol());
			System.out.println("port "+hp.getPort());
			System.out.println("host "+hp.getHost());
			System.out.println("file "+hp.getFile());
			System.out.println("extform "+hp.toExternalForm());
			System.out.println("authority "+hp.getAuthority());
			
			System.out.println(hp.toURI());
			
			
			
		} catch (MalformedURLException e) {
			System.out.println(e);
		}
		catch(Exception hz){
			System.out.println(hz);
			
		}

	}

}
