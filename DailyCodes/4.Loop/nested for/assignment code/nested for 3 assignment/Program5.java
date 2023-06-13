/*

10 10 10 10
11 11 11
12 12
13

*/






class Program5{
	public static void main(String[]args){


		int rowcol=4;
		int num=10;

		for(int i=1;i<=rowcol;i++){

			for(int j=1;j<=rowcol-i+1;j++){     //..j<=rowcol-i+1

				System.out.print(num +" ");
			}

		num=num+1;
		System.out.println();
		}
	}
}