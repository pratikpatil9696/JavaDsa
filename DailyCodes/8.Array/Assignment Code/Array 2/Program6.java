/*

Program 6
WAP to take size of array from user and also take integer elements from user
find the maximum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: max element = 5

*/



import java.io.*;
class Program6{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array");
		int size =Integer.parseInt(br.readLine());
		int arr[]=new int[size];


			System.out.println("Enter Elements of Array");
			for(int i=0;i<arr.length;i++){

				 arr[i]=Integer.parseInt(br.readLine());
			}




				
			//max no
			
			int max=arr[0];
			for(int i=0;i<arr.length;i++){

				if(arr[i]>max){

					 max =arr[i];
				}

			}

			System.out.println("max no is :"+max);
	}

}