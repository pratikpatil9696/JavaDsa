/*

9
9 8
9 8 7
9 8 7 6

*/






class Program6{
	public static void main(String[]args){


		int rowcol=4;
		

		for(int i=1;i<=rowcol;i++){

				int num=9;

			for(int j=1;j<=i;j++){  

				System.out.print(num-- +" ");
			}

		
		System.out.println();
		}
	}
}