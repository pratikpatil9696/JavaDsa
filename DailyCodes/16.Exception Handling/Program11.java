
//NumberFormatException  AND mULTIPLE CATCH


import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		System.out.println(str1);


		int data=0;

		try{
		 data = Integer.parseInt(br.readLine());
		}


		catch(NumberFormatException obj){

			System.out.println("Please Enter Integer Data");

			
		}

		catch(ArithmeticException obj){

			System.out.println("Bhokat jaaa");
		}

		System.out.println(data);
		System.out.println("end");	
	}
}