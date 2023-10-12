import java.util.*;
import java.net.*;
import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException {
		

		ServerSocket ss = new ServerSocket(1200); //First request Server Send //port create zala 

		Socket s = ss.accept();  //Socket mhnje client side Client ne request accept keli

		System.out.println("Connection Established");
		
		OutputStream os =s.getOutputStream(); //Server and client madhe Stream Created 

		PrintStream ps = new PrintStream(os);

		ps.println("Hello Client");
		ps.println("Go to hell");

		ps.close();
		s.close();
		ss.close();

	}
}