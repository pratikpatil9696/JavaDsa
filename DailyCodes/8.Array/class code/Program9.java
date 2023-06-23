
// Count the even and oddd number from array


import java.io.*;

class Program9{

	public static void main(String []args)throws IOException{
			

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Array Size");

			int size =Integer.parseInt(br.readLine());

			int arr[] = new int[size];
			
			System.out.println("******************");
			 int count=0;
			 int count2=0;
	
			for(int i=0;i<arr.length;i++){
				
				arr[i]=Integer.parseInt(br.readLine());

				if(arr[i] % 2 == 0){
				count++;
				}

				else{
					count2++;
				}

		    }

		   

			System.out.println("Elements are :- ");

			for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);

			

			}

			System.out.println("Even Count is :"+count);
			System.out.println("Odd Count is :"+count2);


			int arr2[] = new int[5];
			float arr3[] = new float[5];
			System.out.println(arr);
			System.out.println(arr2);
			System.out.println(arr3);

		
	}
}