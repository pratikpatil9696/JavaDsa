// My Length Method


import java.io.*;

class Program19{


	static int myLength(String str1){

		char arr[]=str1.toCharArray();

		int count=0;

		for(int i=0;i<arr.length;i++){
			count++;
		}

		return count;
	}

	public static void main(String[] args)throws IOException {
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter First String");
		String str1=br.readLine();

		System.out.println("Enter Second String");
		String str2=br.readLine();


		int x=myLength(str1);
		System.out.println(x);

		if(myLength(str1)==myLength(str2))
			System.out.println("MyEqual");

		else
			System.out.println("Mynotequal");
	}
}