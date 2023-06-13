/*

14 15 16 17
15 16 17 18
16 17 18 19
17 18 19 20

*/

/*
class Program3{
	public static void main(String[]args){

		int rows=4;
		int cols=4;
		int x=14;
		int y=14;
		for(int i=1;i<=rows;i++){
			
		    	

				for(int j=1;j<=cols;j++){
					System.out.print(x++ +" ");
				}
			System.out.println();
			y++;
			x=y;
		}
	}
}

*/


class Program3{
	public static void main(String[] args){

		int rows=4;
		int cols=4;

		for(int i=1;i<=rows;i++){

			int num=14+i-1;


					for(int j=1;j<=cols;j++){
						System.out.print(num++ +" ");
					}

		System.out.println();			
		}
	}

}