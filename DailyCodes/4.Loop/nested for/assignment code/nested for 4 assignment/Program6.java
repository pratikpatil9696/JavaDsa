/*
1
2  3
3  4  5
4  5  6  7

*/

class Program6{
	public static void main (String[]args){

		int row=4;



		for(int i=1;i<=row;i++){
			int temp =i;
			for(int j=1;j<=i;j++){
				System.out.print(temp+"  ");
				temp++;
			}

		System.out.println();
		}
	}
}