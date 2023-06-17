import java.io.*;

class Program1{
	public static void	main(String[]args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);


		System.out.println("Enter Your Name : ");

		int name=isr.read();

		System.out.println("Name is :"+name);
		
		isr.close();

		


		System.out.println("Enter Your age : ");
		
		char age=(char)isr.read();
		System.out.println("Name is :"+age);
		
		

		


		System.out.println("Enter Your Last Name : ");

		int name3=isr.read();

		System.out.println("Name is :"+name3);




 	}
}