/*

1 2 3 4
2 3 4 5
3 4 5 6 
4 5 6 7

*/

class Program10{
	public static void main(String[]args){
		
		int rows=4;
		int col=4;
		
	 	
		for(int i =1; i<=rows;i++){	
			
			int x=i;

			for(int j=1;j<=col;j++){
				
				System.out.print(x+" ");
				x=x+1;									
				
			}
		
		
		System.out.println();
		
    		}		

	}
}