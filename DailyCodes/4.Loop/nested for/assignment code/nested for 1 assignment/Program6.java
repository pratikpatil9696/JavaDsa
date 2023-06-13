/*

9 8 7
9 8 7
9 8 7

*/

class Program6{
	public static void main(String[]args){
		
		int rows=3;
		int col=3;
	 	
		for(int i =1; i<=rows;i++){	
			
			int x=9;

			for(int j=1;j<=col;j++){
				
				System.out.print(x+" ");
				x=x-1;//x--
			}
		
		
		System.out.println();
		
    		}		

	}
}