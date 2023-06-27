/*
Program 9
Write a Java program to merge two given arrays.
Array1 = [10, 20, 30, 40, 50]
Array2 = [9, 18, 27, 36, 45]
Output :
Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
Hint: you can take 3rd array

*/


import java.util.*;	
class Program9{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		//First Array
		System.out.println("Enter Size of First Array");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter Elements Of First array ");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}



		//Second Array
		System.out.println("Enter Size of Second Array");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enter Elements Of Second array ");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}




		//Merged Third Array


		System.out.println("*******");
		int arr3[]=new int [size1+size2];
		
		
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}

		
		for(int i=0;i<arr2.length;i++){
			arr3[size1+i]=arr2[i];
			
		}

		//Print Merged Array
		System.out.println("****");

		for(int i=0;i<arr3.length;i++)
		System.out.println(arr3[i]);


	}

}