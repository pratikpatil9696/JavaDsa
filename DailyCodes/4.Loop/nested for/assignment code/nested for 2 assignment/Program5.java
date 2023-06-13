/*

26 Z 25 Y
24 X 23 W 
22 V 21 U 
20 T 19 S
*/

class Program5{
	public static void main(String[]args){

		int rows=4;
		int cols=4;
		
		int num=26;
		char ch='Z';

		for(int i=1;i<=rows;i++){


				for(int j=1;j<=cols;j++){

					if(j % 2 ==1){

						System.out.print(num +" ");
						num--;
					}

					else{
						System.out.print(ch +" ");
						ch--;
					}
					
					
				}
		
		System.out.println();
			
		}
	}
}

