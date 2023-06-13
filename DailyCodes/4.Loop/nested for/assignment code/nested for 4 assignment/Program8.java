/*
10
I  H
7  6  5
D  C  B  A



*/

class Program8{
	public static void main (String[]args){

		int row=4;
		int temp= 10;
		char ch='J';
		for(int i = 1;i<=row ; i++){

			for(int j=1;j<=i;j++){

				if(i % 2==1){
					System.out.print(temp+"  ");
						ch--;
					temp--;
				}
				else{
					System.out.print(ch+"  ");
					ch--;
					temp--;
				}

			}

		
		System.out.println();
		}
	}
}