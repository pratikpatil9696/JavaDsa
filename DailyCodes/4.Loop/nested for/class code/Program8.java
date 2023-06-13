/*

A 1 B 2
A 1 B 2
A 1 B 2



*/

class Program8{
	public static void main(String[]args){
		
		int rows=3;
		int cols=4;
		
			for(int i=1;i<=rows;i++){
				
			char ch='A';
			int num=1;	
	
				for(int j=1;j<=cols;j++){
					
					if(j % 2 ==0){
					System.out.print(ch++ +" ");
					}

					else{
					System.out.print(num++ +" ");
					}


				}
		
			System.out.println();
			}




	}
}