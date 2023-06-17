import java.io.*;
class Program8{
	public static void main (String []args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("First Name ");
		int name=isr.readLine();
			//br.close();

		System.out.println("First Name ");
		int name2=isr.read();

		System.out.println("First Name ");
		int name3=isr.read();
		
		System.out.println("Last Name");
		//String name2=br2.readLine();
		

		System.out.println("*****************************");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
		
	}
	
}