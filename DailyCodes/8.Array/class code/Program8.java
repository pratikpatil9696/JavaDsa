
// Count the even number from array


import java.io.*;

class Program8{

	public static void main(String []args)throws IOException{
			

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Array Size");

			int size =Integer.parseInt(br.readLine());

			int arr[] = new int[size];
			
			System.out.println("******************");
			 int count=0;
	
			for(int i=0;i<arr.length;i++){
				
				arr[i]=Integer.parseInt(br.readLine());

				if(arr[i] % 2 == 0){
				count++;

			}

		    }

		   

			System.out.println("Elements are :- ");

			for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);

			

			}

			System.out.println("Even Count is :"+count);

		
	}
}