
//IOException

import java.io.*;

class Demo{


	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str ="as";
		System.out.println(str);

		try{

			str=br.readLine();
		}

		catch(IOException e){


		}

		System.out.println(str);
	}
	
}