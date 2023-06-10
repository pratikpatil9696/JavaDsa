/*
Electricity Bill Problem
print the bill amount
unis <=100 : price per unit 1
unis >100 : price per unit 2
input : 50
output : 50
input : 200
output:300
*/



class ifElse8{

     public static void main(String[]args){
	
	int unit=200;

		if(unit<=100){
		System.out.println(unit);
		} 
		

		else{
		unit=100+(unit-100)*2;
		System.out.println(unit);
		}
		
		
		


   }
}