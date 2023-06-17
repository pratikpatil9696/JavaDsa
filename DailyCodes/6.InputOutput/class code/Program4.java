import java.io.*;
class Program4 {
	public static void main (String []args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Player name");
		String name=br.readLine();

		
		System.out.println("Enter Jercy No");
		int jer=Integer.parseInt(br.readLine());

		System.out.println("Enter Average");
		float avg=Float.parseFloat(br.readLine());


		System.out.println("*****************************");
		System.out.println(name);
		System.out.println(jer);
		System.out.println(avg);

	}
	
}