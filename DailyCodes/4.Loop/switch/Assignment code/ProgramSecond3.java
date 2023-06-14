import java.util.*;
class ProgramSecond3{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		int num1,num2;

		System.out.println("Enter First Number");
		num1=sc.nextInt();

		System.out.println("Enter Second Number");
		num2=sc.nextInt();

		if(num1<0 || num2<0){
			System.out.println("Number is Negative");

		}

		else{

			switch((num1*num2)%2){

			case 0:{
				System.out.println("Even Number");
				break;
			}

			case 1:{
				System.out.println("Odd Number");
				break;
			}

			}
		}
	}
}