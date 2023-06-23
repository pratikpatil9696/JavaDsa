



import java.io.*;

class Program6{

	public static void main(String []args)throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		

		int arr[] = new int[5];
System.out.println(arr.length);
System.out.println("******************");
	
		int sum =0;
		for(int i=1;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
			sum=sum+arr[i];
		}

		System.out.println("******************");

		for(int i=1;i<arr.length;i++){

			System.out.println(arr[i]);

			}

			System.out.println("Sum is : "+sum);

			System.out.println(arr[0]);
	}
}