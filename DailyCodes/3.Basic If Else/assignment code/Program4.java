/*

Write a java program that checks a number from 0 to 5 and prints its spelling, if the number is greater than 5 print the number is greater than 5

4=four
3=three

*/

class Program4{

	public static void main(String[] args){

	  int var=5;

		if(var<0){
		System.out.println(var+" is less than 0 ");		
		}

		else if (var==0){
		System.out.println("Zero");
		}


		else if (var==1){
		System.out.println("One");
		}


		else if (var==2){
		System.out.println("Two");
		}


		else if (var==3){
		System.out.println("Three");
		}


		else if (var==4){
		System.out.println("Four");
		}


		else if (var==5){
		System.out.println("Five");
		}

		
		else{
		System.out.println(var+" is a greater than five");
		}
	}
}