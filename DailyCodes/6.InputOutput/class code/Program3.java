import java.io.*;
class Program3 {
	public static void main (String []args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Batsman name");
		int bat=br.read();

		
		System.out.println("Enter Bowl name");
		String bowl=br.readLine();

		System.out.println("Batsman Name  = "+bat);

		System.out.println("Bowl Name  = "+bowl);

		

	}
	
}