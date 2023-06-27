/*

Program 2
WAP to find the number of even and odd integers in a given array of integers
Input: 1 2 5 4 6 7 8
Output:
Number of Even Elements: 4
Number of Odd Elements : 3
*/



import java.io.*;
class Program2{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array");
		int size =Integer.parseInt(br.readLine());
		int arr[]=new int[size];


			System.out.println("Enter Elements of Array");
			for(int i=0;i<arr.length;i++){

				 arr[i]=Integer.parseInt(br.readLine());
			}




				//Count odd and even numbers

				int odd =0;
				int even=0;
				for(int i=0;i<arr.length;i++){

				  	if(arr[i] % 2 ==0){
				  		even++;
				  	}

				  	else{
				  		odd++;
				  	}
				 
			}


			System.out.println("Numbers of Even element : "+even+"\nNumbers of Odd Element : "+odd);

			
	}

}