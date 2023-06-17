import java.io.*;
class Program9 {
	public static void main (String []args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(isr2);
		

		System.out.println("First Name ");
		String name=br.readLine();
			

			 


		System.out.println("Last Name");
		String name2=br2.readLine();

		 br.close();


		System.out.println("Last Name");
		String name3=br2.readLine();
		

		System.out.println("*****************************");
		System.out.println(name);
		System.out.println(name2);
		
	}
	
}