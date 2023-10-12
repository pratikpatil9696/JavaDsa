

import java.io.*;

class Demo{


	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int str =0;
		System.out.println(str);

		//str=Integer.parseInt(br.readLine());




		try{

			str=Integer.parseInt(br.readLine());
		}

		catch(NumberFormatException e){

			System.out.println("exception ghavle");
		}



		System.out.println(str);
		System.out.println("asaasddddddddddd");
	}
	
}