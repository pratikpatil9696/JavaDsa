/*

1  2  3  4
4  5  6
6  7
7

*/


class Program11{
	public static void main(String[]args){

		int rowcol=4;
		int num=1;
		int x=1;
				for(int i=1;i<=rowcol;i++){
				

						
					for(int j=1;j<=rowcol-i+1;j++){

						System.out.print(num +"  ");
							num++;
							x++;
					}

				num=x-1;
				x=num;		
				System.out.println();	
				}
	}
}






