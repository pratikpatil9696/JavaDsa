/*
Program 9: Write a program in java to accept three numbers and check whether they are Pythagorean triplets or not
example (what is a Pythagorean triplet): a=3,b=4,c=5
if
a*a+b*b=c*c
then
its pythagorean triplet

input1:

a=3,b=4,c=5

output=
its pythagorean triplet

*/

class Program9{

	public static void main(String[] args){

		int a=3;
		int b=4;
		int c=5;
			
			if(a*a + b*b == c*c || a*a+c*c==b*b  ||  b*b+c*c==a*a){
			System.out.println("is a pythagorean script");
			}

			
			else{
			System.out.println("not a pythagorean script");
			}

	}
}