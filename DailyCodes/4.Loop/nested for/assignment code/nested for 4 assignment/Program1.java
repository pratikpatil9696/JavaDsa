/*
C2W10
C2W9   C2W8
C2W7   C2W6   C2W5
C2W4   C2W3   C2W2   C2W1

*/

class Program1{
	public static void main (String[]args){

		int x=4;
		int n=x*x-6;
		for(int i=1;i<=x;i++){

			

				for(int j=1;j<=i;j++){

					System.out.print(" C2W" +n);
					n--;
					
				}
			
		System.out.println();
		}
	}
}