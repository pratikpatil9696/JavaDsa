/*

Program 3
Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26

*/



import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array");
		int size =Integer.parseInt(br.readLine());
		int arr[]=new int[size];


			System.out.println("Enter Elements of Array");
			for(int i=0;i<arr.length;i++){

				 arr[i]=Integer.parseInt(br.readLine());
			}




				//Sum of odd and even numbers


				int sumOdd=0;
				int sumEven=0;
				for(int i=0;i<arr.length;i++){

				  	if(arr[i] % 2 ==0){
				  		sumEven=sumEven+arr[i];
				  	}

				  	else{
				  		sumOdd=sumOdd+arr[i];
				  	}
				 
			}


			System.out.println("Sum of Even element : "+sumEven+"\n Sum of Odd Element : "+sumOdd);

			
	}

}