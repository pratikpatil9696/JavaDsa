/*

12 12 12

11 11 11

10 10 10

*/

class Program5{
	public static void main(String[]args){
		
		int rows=3;
		int col=3;
	 	int x=12;
		for(int i =1; i<=rows;i++){	
			

			for(int j=1;j<=col;j++){
				System.out.print(x+" ");
				
			}
		
		x=x-1;
		System.out.println();
		
    		}		

	}
}