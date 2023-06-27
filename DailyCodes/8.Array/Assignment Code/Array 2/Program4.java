/*

WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2

*/



import java.io.*;
class Program4{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array");
		int size =Integer.parseInt(br.readLine());
		int arr[]=new int[size];


			System.out.println("Enter Elements of Array");
			for(int i=0;i<arr.length;i++){

				 arr[i]=Integer.parseInt(br.readLine());
			}



			//Enter Search Element
			System.out.println("Enter element to search : ");
			int element =Integer.parseInt(br.readLine());


				
			//Match with Index

			for(int i=0;i<arr.length;i++){
			
				if(element==arr[i])

				System.out.println("element found at index :"+i);

			}
	}

}