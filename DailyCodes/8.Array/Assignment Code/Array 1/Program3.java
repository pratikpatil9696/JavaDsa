/*

Program 3
WAP to take size of array from user and also take integer elements from user Print
product of odd index only
input : Enter size : 6
Enter array elements : 1 2 3 4 5 6
output : 48
//2 * 4 * 6

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



				//product of odd index only


				int mul =1;
				for(int i=0;i<arr.length;i++){

				 if(i % 2 != 0){

				 	mul=mul*arr[i];
				 }
			}


			System.out.println("Multiplication of Odd Index Elements is : "+mul);

			
	}

}