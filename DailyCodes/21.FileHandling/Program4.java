


//Methods

import java.io.*;
class FileDemo{

	public static void main(String[] args)throws Exception {
		
		
		File fobj1 = new File("Incubator.txt");

		fobj1.createNewFile();

		System.out.println(fobj1.getName());
		System.out.println(fobj1.getParent());
		System.out.println(fobj1.getPath());
		System.out.println(fobj1.getAbsolutePath());

		System.out.println(fobj1.canRead());
		System.out.println(fobj1.canWrite());
		System.out.println(fobj1.isDirectory());
		System.out.println(fobj1.isFile());
	}
}