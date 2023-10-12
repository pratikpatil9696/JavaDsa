

import java.io.*;
class FileDemo{

	public static void main(String[] args)throws Exception {
		
		File fobj1 = new File("FileHandling");

		
		fobj1.mkdir();
		
		File fobj2 = new File(fobj1,"Code1.txt");

		fobj2.createNewFile();
		
	}
}