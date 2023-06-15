//print the the sum of all even numbers
//print the multiplication of odd numbers

class Program8{
public static void main(String[]args){
	
	int n=1;
	int sum=0;
	int mul=1;

		while(n<=10){
		 
			if(n % 2 ==0){
			 sum=sum+n;
			}
			else{
			mul=mul*n;
			}
		i++;
		}

		System.out.println("The sum of even No is "+sum );
		System.out.println("The Multiplication of odd no is "+mul);
	
}
}
