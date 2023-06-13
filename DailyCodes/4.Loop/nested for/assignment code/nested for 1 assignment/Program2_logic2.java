/*

4  5  6  7
4  5  6  7
4  5  6  7


*/

class Program1_logic2{
	public static void main(String[]args){
		
		int rows=3;
		int col=4;
	
		for(int i =1; i<=rows;i++){	
			int x=4;

			for(int j=1;j<=col;j++){
				System.out.print(x+++" ");
				//System.out.print(" ");
			}
		
		System.out.println();
    		}		

	}
}