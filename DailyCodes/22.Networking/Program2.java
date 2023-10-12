
import java.io.*;
import java.net.*;

class Demo{

	public static void main(String[] args) throws IOException{
		
		URL obj =new URL("https://www.core2web.in");

		System.out.println(obj.getProtocol());
		System.out.println(obj.getPort());
		System.out.println(obj.getFile());
	}
}