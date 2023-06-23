
// Print the sum of Array


import java.io.*;

class Program5{

	public static void main(String []args)throws IOException{

		int arr[] = new int[5];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum =0;
		for(int i=0;i<5;i++){

			arr[i]=Integer.parseInt(br.readLine());
			sum=sum+arr[i];
		}

		System.out.println("******************");

		for(int i=0;i<5;i++){

			System.out.println(arr[i]);

			}

			System.out.println("Sum is : "+sum);
	}
}