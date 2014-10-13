package net;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HTTPURL {

	public static void main(String[] args) throws Exception {
		URL hp = new URL("http://pmvf.net");
		HttpURLConnection hpcon=(HttpURLConnection) hp.openConnection();
		System.out.println("method request: "+hpcon.getRequestMethod());
		System.out.println("cod answer: "+hpcon.getResponseCode());
		System.out.println("message of the answer: "+ hpcon.getResponseMessage());
		
		Map<String, List<String>> hdrMap =hpcon.getHeaderFields();
		Set<String>  hdrField = hdrMap.keySet();
		System.out.println("\n Here comes head: ");
		for (String k: hdrField) {
			System.out.println("key: "+ k+ "; value: " + hdrMap.get(k));
			
		}
		System.out.println(hpcon.getAllowUserInteraction());
		System.out.println(hpcon.getDefaultAllowUserInteraction());
		System.out.println(hpcon.getExpiration());
		
	}


}
