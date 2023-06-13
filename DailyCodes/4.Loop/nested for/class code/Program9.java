/*

A 1 B 2
C 3 D 4
E 5 F 6



*/

class Program9{
	public static void main(String[]args){
		
		int rows=3;
		int cols=4;
		char ch='A';
		int num=1;
		
			for(int i=1;i<=rows;i++){
				
				
	
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