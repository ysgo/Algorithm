package day13;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest4 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.google.com/");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
		String line = null;
		
		while(true){
			line = br.readLine();
			if(line == null)
				break;
			System.out.println(line);
		}
	}

}
