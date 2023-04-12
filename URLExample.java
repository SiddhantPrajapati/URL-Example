import java.util.*;
import java.io.*;
import java.net.*;

public class URLExample {
	public static void main(String[] args) throws Exception {

		URL url = new URL("https://www.google.com");
		
		URLConnection uc = url.openConnection();
		
		InputStream in = uc.getInputStream();
		
		int i;
		
		while((i= in.read()) != -1){
			System.out.println((char)i);
		}
	}
}
		
		