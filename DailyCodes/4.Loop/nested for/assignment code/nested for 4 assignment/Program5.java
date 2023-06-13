/*
A  B  C  D
B  C  D
C  D
D

*/

class Program5{
	public static void main (String[]args){

		int x=4;
		char ch='A';
		
		for(int i=1;i<=x;i++){

				char temp=ch;

				for(int j=1;j<=x-i+1;j++){

					System.out.print(temp+++"  ");
					
					
				}
				ch++;
				System.out.println();
		}
	}
}