import java.io.*;
class Program5 {
	public static void main (String []args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Owner Name");
		String name=br.readLine();

		
		System.out.println("Enter Wing");
		char wing=(char)br.read();
		br.skip(5);

		System.out.println("Enter Flat No");
		int flat=Integer.parseInt(br.readLine());		


		System.out.println("*****************************");
		System.out.println(name);
		System.out.println(wing);
		System.out.println(flat);
	}
	
}