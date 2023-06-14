import java.io.*;
class ad{
	
	public static void main(String []args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter First Number");

		int no1=Integer.parseInt(br.readLine());

		System.out.println("Enter Second Number");

		int no2=Integer.parseInt(br.readLine());
		






		int mul;
			if(no1>0 && no2>0){

				mul=no1*no2;
				System.out.println(mul);

			}

			else{
			System.out.println("Its is negative");
			}

			
		
	}
}