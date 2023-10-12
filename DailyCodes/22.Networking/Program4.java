import java.util.*;
import java.net.*;
import java.io.*;

class Demo{

	public static void main(String[] args)throws URISyntaxException,IOException {
		

		URL obj2 = new URL("https://www.core2Web.in");

		URL obj1 = new URL("https://www.youtube.com");

		URLConnection conn = obj1.openConnection();

		System.out.println(new Date(conn.getLastModified()));
	
		URLConnection conn2 = obj2.openConnection();

		System.out.println(new Date(conn2.getLastModified()));
	
	}
}