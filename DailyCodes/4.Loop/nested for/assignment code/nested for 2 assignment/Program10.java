/*

  F  5  D  3  B  1
  F  5  D  3  B  1
  F  5  D  3  B  1

*/
/*

class Program10{
	public static void main(String[]args){

		int rows=3;
		int cols=3;
		
		

		for(int i=1;i<=rows;i++){

			char ch ='F';
			int num = 5;

				for(int j=1;j<=cols;j++){

				System.out.print("  "+ch+ "  "+num);
					ch--;
					num--;
					ch--;
					num--;
				}
		
		System.out.println();
			
		}
	}
}




*/

// Logic No 2

/*
class Program10{
	public static void main(String[]args){

		int rows=6;
		
		

		for(int i=1;i<=rows;i++){

			int x=rows;
			char ch='F';

				for(int j=1;j<=rows;j++){

				if(j % 2 ==1 ){
				System.out.print(ch+ " ");
				}
				else

				System.out.print(x+ " ");

				
					ch--;
					x--;
				}
		
		System.out.println();
			
		}
	}
}

*/

//Logic No 3


class Program10{
	public static void main(String[]args){

		int rows=6;
		
		

		for(int i=1;i<=rows;i++){

			int x=rows;
			int ch=64+rows;

				for(int j=1;j<=rows;j++){

				if(j % 2 ==1 ){
				System.out.print((char)ch+ " ");
				}
				else

				System.out.print(x+ " ");

				
					ch--;
					x--;
				}
		
		System.out.println();
			
		}
	}
}




