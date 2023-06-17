import java.io.*;
import java.util.*;
class Program11 {
	public static void main (String []args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter  ");
		String name=br.readLine();

		StringTokenizer obj=new StringTokenizer(name," ");

		String token1=obj.nextToken();
		char token2=obj.nextToken();
		String token3=obj.nextToken();
		 
		String str =token1;
		int abc =Integer.parseInt(token3);
		Char ch =token2.charAt(0);
		System.out.println("*****************************");
		
		System.out.println("sdas"+str);
		System.out.println("Wing : "+token2);
		System.out.println("ijj"+abc);
		
				

		
		
		
	}
	
}