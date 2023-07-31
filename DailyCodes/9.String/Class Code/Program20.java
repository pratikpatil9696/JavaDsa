//My compareTo method

import java.io.*;

class Program20{


	static void myLength(String str1,String str2){

		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		
		
		//pratil
		//praT

		for(int i=0;i<arr1.length;i++){

			if(arr1[i]==arr2[i]){
				System.out.println("same");
				
			}

			else{
				int x =(int) arr1[i];
				int y =(int) arr2[i];
				int z=x-y;
 				System.out.println(z);
				break;
			}

		}

		//System.out.println("Same"+str4);
		
	}

	public static void main(String[] args)throws IOException {
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter First String");
		String str1=br.readLine();

		System.out.println("Enter Second String");
		String str2=br.readLine();


		myLength(str1,str2);

		System.out.println("****************");
		System.out.println(str1.compareTo(str2));
	}
}