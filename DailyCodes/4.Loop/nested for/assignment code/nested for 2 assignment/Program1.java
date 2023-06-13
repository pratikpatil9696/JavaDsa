/*

C2W1 C2W2 C2W3
C2W1 C2W2 C2W3
C2W1 C2W2 C2W3

*/


//Logic one
/*
class Program1{
	public static void main(String[]args){

		int rows=3;
		int cols=3;
		String ch ="C2W";
		for(int i=1;i<=rows;i++){
			
			int num =1;

				for(int j=1;j<=cols;j++){
					System.out.print(ch+""+num+++" ");
				}
			System.out.println();
		}
	}
}


*/

//logic two


class Program1{
	public static void main(String[]args){

		int rows=3;
		int cols=3;
		
		for(int i=1;i<=rows;i++){
			
			int num =1;

				for(int j=1;j<=cols;j++){
					System.out.print("C2W"+num++ +" ");
				}
			System.out.println();
		}
	}
}

