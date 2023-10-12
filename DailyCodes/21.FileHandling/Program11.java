

//Serialization

import java.io.*;


class Demo{

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("Data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);


		Player obj1 = (Player)ois.readObject();

		Player obj2	 = (Player)ois.readObject();

		ois.close();
		fis.close();

		System.out.println("jer : "+ obj1.jerNo);

		System.out.println("name : "+ obj1.pName);


		System.out.println("jer : "+ obj2.jerNo);

		System.out.println("name : "+ obj2.pName);

	}
}