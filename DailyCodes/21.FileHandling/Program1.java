

import java.io.*;
class FileDemo{

	public static void main(String[] args)throws IOException {
		
		File fobj = new File("Incubator");

		System.out.println(fobj.exists());
		
		fobj.createNewFile();
	}
}