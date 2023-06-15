//print the the sum of all even numbers
//print the multiplication of odd numbers

class Program7{
public static void main(String[]args){
	
	int n=123;
	int sum=0;
	int mul=1;

		while(n!=0){
		  int rem = n % 10;
  		  n= n/10;

			if(rem % 2 ==0){
			 sum=sum+rem;
			}
			else{
			mul=mul*rem;
			}
		}

		System.out.println("The sum of even No is "+sum );
		System.out.println("The Multiplication of odd no is "+mul);
	
}
}
