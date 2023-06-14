import java.io.*;
class Program3{
	
	public static void main(String []args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter First Number");

		int no1=Integer.parseInt(br.readLine());

		System.out.println("Enter Second Number");

		int no2=Integer.parseInt(br.readLine());
		

		int mul=0;
			if(no1>0 && no2>0){

				mul=no1*no2;
			}

			else{
			System.out.println("Its is negative");
			}


		char ch;

		if(mul % 2==0){

			ch='A';

		}

		else{
			ch='B';
		}


		switch(ch){

		case 'A':{
			System.out.println("Number is Even");
			break;
		}

	case 'B':{
		System.out.println("Number is Odd");
		break;
		}


	}
	}
}