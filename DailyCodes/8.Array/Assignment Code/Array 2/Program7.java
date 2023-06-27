/*

Program 7
WAP to find the common elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Common elements :
1
2 

*/



import java.io.*;
class Program7{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//First Array
		System.out.println("Enter Size of First Array");
		int size1 =Integer.parseInt(br.readLine());
		int arr1[]=new int[size1];


		System.out.println("Enter Elements of First Array");
		for(int i=0;i<arr1.length;i++){
			
			arr1[i]=Integer.parseInt(br.readLine());
		}


		//Second Array
		System.out.println("Enter Size of Second Array");
		int size2 =Integer.parseInt(br.readLine());
		int arr2[]=new int[size2];


		System.out.println("Enter Elements of Array");
		for(int i=0;i<arr2.length;i++){
			
			arr2[i]=Integer.parseInt(br.readLine());
		}




				
		//Matching Two Arrays

		System.out.println("Common Elements are : ");
		for(int i =0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++){

				if(arr1[i]==arr2[j])

				{
					
					System.out.println(arr1[i]);
					break;
				}

			}

				
		}
	}

}