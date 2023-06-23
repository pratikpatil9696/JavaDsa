
import java.io.*;
class Program2{

	public static void main(String []argd)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	

		String arr[] =new String[5];

	
		for(int i=0;i<5;i++){

		 arr[i]=br.readLine();
		
		 
		}

		 System.out.println("*********************");
	
		for(int i=0;i<5;i++){

			System.out.println(arr[i]);
			
		}
	
	}
}