/*
1A 2B 3C
1A 2B 3C
1A 2B 3C
*/

class Program4{
	public static void main(String[]args){

		int rows=4;
		int cols=4;
		
		for(int i=1;i<=rows;i++){

			int num=1;
			char ch='A';

				for(int j=1;j<=cols;j++){
					System.out.print(num++ +""+ ch++ +" ");
					
				}
		
		System.out.println();
			
		}
	}
}

