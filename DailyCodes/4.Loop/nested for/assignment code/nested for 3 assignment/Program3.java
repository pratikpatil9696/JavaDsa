/*

10
9  8
7  6  5
4  3  2  1

*/






class Program3{
	public static void main(String[]args){

	
		int n=10;
		int rowcol=4;

		for(int i=1;i<=rowcol;i++){

			for(int j=1;j<=i;j++){

				System.out.print(n-- +"  ");
			}

		System.out.println();
		}
	}
}