

import java.util.*;
import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException {
		

		Properties obj = new Properties();

		FileInputStream fis = new FileInputStream("Friends.properties");

		obj.load(fis);

		String name = obj.getProperty("Ashish");
		System.out.println(name);

		obj.setProperty("Shashi","Biencaps");

		FileOutputStream fos = new FileOutputStream("Friends.properties");
		obj.store(fos,"Updated By Shashi");

 	}
}