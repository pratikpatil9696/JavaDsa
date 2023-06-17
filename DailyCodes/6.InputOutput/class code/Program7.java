import java.io.*;
class Program7 {
	public static void main (String []args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("First Name ");
		String name=br.readLine();
			br.close();
		
		System.out.println("Last Name");
		String name2=br2.readLine();
		

		System.out.println("*****************************");
		System.out.println(name);
		System.out.println(name2);
		
	}
	
}