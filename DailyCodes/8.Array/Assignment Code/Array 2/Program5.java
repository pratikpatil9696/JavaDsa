/*

Program 5
WAP to take size of array from user and also take integer elements from user
find the minimum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: min element = 0

*/



import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array");
		int size =Integer.parseInt(br.readLine());
		int arr[]=new int[size];


			System.out.println("Enter Elements of Array");
			for(int i=0;i<arr.length;i++){

				 arr[i]=Integer.parseInt(br.readLine());
			}




				
			//min no
			
			int min=arr[0];
			for(int i=0;i<arr.length;i++){

				if(arr[i]<min){

					 min =arr[i];
				}

			}

			System.out.println("min no is :"+min);
	}

}