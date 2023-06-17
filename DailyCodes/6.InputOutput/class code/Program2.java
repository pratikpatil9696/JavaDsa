import java.io.*;

class Program2{
	public static void	main(String[]args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Your Name : ");

		String name=br.readLine();

		System.out.println("Name is :"+name);
		
		
		System.out.println("Enter Your age : ");

		int age=Integer.parseInt(br.readLine());

		System.out.println("age is :"+age);
		



		



 	}
}