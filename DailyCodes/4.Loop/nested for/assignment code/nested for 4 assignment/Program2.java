/*
1
3  4
6  7  8
10  11  12  13
15  16  17  18  19

*/

class Program2{
	public static void main (String[]args){

		int x=5;
		int n=1;
		for(int i=1;i<=x;i++){


				for(int j=1;j<=i;j++){

					System.out.print(n+++"  ");
					
					
				}
			//n=(n+2)-1;
			n++;
		System.out.println();
		}
	}
}