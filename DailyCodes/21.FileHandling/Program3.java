

import java.io.*;
class FileDemo{

	public static void main(String[] args)throws Exception {
		
		File obj = new File("ashu.txt");

		
		obj.createNewFile();
		
		File obj1 = new File(obj,"Code1.txt");

		obj1.mkdir();
		
	}
}