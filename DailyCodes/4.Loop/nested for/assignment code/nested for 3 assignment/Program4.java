/*

3C  3C  3C  3C
3C  3C  3C
3C  3C
3C
*/






class Program4{
	public static void main(String[]args){


		int rowcol=4;
		for(int i=1;i<=rowcol;i++){

			for(int j=1;j<=rowcol-i+1;j++){     //..j<=rowcol-i+1

				System.out.print("3C  ");
			}

		System.out.println();
		}
	}
}