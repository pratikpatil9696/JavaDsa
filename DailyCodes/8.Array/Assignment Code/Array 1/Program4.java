/*

Program 4
Write a program, take 7 characters as an input , Print only vowels from the array
Input: a b c o d p e
Output : a o e

*/



import java.io.*;
class Program4{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array");
		int size =Integer.parseInt(br.readLine());
		char arr[]=new char[size];


			System.out.println("Enter Elements of Array");
			for(int i=0;i<arr.length;i++){

				 arr[i]=(char)br.read();
				 br.skip(2);
			}

			

				//Checking Vowels
				System.out.println("Vowels are : ");
				for(int i=0;i<arr.length;i++){

					if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||
					   arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')

						{
							System.out.println(arr[i]);
						}
				}

			
	}

}