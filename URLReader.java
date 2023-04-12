import java.net.*;
import java.io.*;
public class URLReader {
	public static void main(String[] args) throws Exception {
		URL oracle = new URL("file:///D:/ITNU/SEM_4/COURSES/2CS405_WT/LAB/1/practical1a.html");
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
			in.close();
	}
}
