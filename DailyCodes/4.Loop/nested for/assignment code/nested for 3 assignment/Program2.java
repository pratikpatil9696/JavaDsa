/*
1
2  3
4  5  6
7  8  9  10

*/





class Program2{
	public static void main(String[]args){

	
		int rowcol=4;
		int num=1;

		for(int i=1;i<=rowcol;i++){

			for(int j=1;j<=i;j++){

				System.out.print(num++ +"  ");
			}

		System.out.println();
		}
	}
}