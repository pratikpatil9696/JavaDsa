
import java.io.*;

class FileDemo{

	public static void main(String[] args)throws IOException {
		
		FileReader fr = new FileReader("Incubator.txt");
		
		int data = fr.read();

		while(data != 5){

			System.out.print((char)data);
			data=fr.read();
		}

		fr.close();




	}
}