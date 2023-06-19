import java.io.*;

class Program4{
	public static void	main(String[]args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		System.out.println("Enter Your Name : ");

		//int name=Integer.parseInt(br.readLine());
		int name=br.readLine();


		System.out.println("Name is :"+name);
		
		



 	}
}