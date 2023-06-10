// write a program to find a maximum between three numbers

class Program6{

	public static void main(String[] args){

	  	int num1 = 40;
		int num2 = 4;
		int num3 = 40;

			if(num1>num2 && num1>num3){
			System.out.println(num1+" is a greater");
			}


			else if (num2>num1 && num2>num3){
			System.out.println(num2+" is a greater");
			}


			else if(num3>num1 && num3>num2){
			System.out.println(num3+" is a greater");
			}



			else if(num1>num3 && num1==num2){
			System.out.println("num1 and num2 equal");
			}		



			else if(num2>num1 && num3==num2){
			System.out.println("nume2 and num3 equal");
			}



			else if(num1>num2 && num1==num3){
			System.out.println("num1 and num3 equal");
			}



	

	}
}