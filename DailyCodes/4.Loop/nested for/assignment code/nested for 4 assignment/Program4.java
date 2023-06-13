/*
1  2  3  4
2  3  4
3  4
4

*/

class Program4{
	public static void main (String[]args){

		int x=4;
		
		for(int i=1;i<=x;i++){

			int	n=i;

				for(int j=1;j<=x-i+1;j++){

					System.out.print(n++ +"  ");
					
					
				}
			//n=(n+2)-1;
				System.out.println();
		}
	}
}