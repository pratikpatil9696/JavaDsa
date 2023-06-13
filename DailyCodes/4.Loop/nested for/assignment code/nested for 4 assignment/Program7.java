/*

F
E  1
D  2  E
C  3  D  4
B  5  C  6  D
A  7  B  8  C  9


*/

class Program7{
	public static void main (String[]args){

		int row=6;
		char ch ='F';
		int temp =1;

		for(int i=1;i<=row;i++){

			
			char temp2=ch;

			for(int j=1;j<=i;j++){


				if(j % 2 ==1){
					
					System.out.print(temp2+"  ");
					temp2++;
				}

				else{
					System.out.print(temp+"  ");
					temp++;
				}
				
				
				
			}
			ch--;
		System.out.println();
		}
	}
}