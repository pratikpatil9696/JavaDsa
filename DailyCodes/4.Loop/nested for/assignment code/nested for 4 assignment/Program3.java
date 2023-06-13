/*
10
10  9
9  8  7
7  6  5  4
4  3  2  1  0

*/

class Program3{
	public static void main (String[]args){

		int x=5;
		int n=10;
		for(int i=1;i<=x;i++){


				for(int j=1;j<=i;j++){

					System.out.print(n--+"  ");
					
					
				}
			//n=(n+2)-1;
				n++;
		System.out.println();
		}
	}
}