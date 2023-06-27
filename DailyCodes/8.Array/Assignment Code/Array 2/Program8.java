/*

Program 8
WAP to find the uncommon elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Uncommon elements :
3
5
9
8

//This code not check Elements 
Enter first array :1 2 3 5
Enter Second array: 8 9 1 2

its check by index

*/



import java.io.*;
class Program8{

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




				
		//Compare array

		System.out.println("Uncommon Elements are : ");
		int flag=0;

		for(int i =0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++) {
												//Enter first array : 1 2 3 5
				if(arr1[i]==arr2[j]){			//Enter Second array: 2 1 9 8
					flag=1;
					break;
				}
					
			}//end of j loop
		
				if(flag==0){
					System.out.println(arr1[i]);
				}
			
			flag=0;

		}//end of i loop



		for(int i =0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++) {

				if(arr2[i]==arr1[j]){
					flag=1;
					break;
				}
					
			}//end j

				if(flag==0){
					System.out.println(arr2[i]);
				}

			flag=0;

		}//end i
			

	
	}

}