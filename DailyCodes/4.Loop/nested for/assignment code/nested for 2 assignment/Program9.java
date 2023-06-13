/*

1C3  4B2  9A1
16C3  25B2  36A1
49C3  64B2  81A1

*/


class Program9{
	public static void main(String[]args){

		int rows=3;
		int cols=3;
		
		
		int num = 1;

		for(int i=1;i<=rows;i++){

			char ch='C';
			int num2=3;
				for(int j=1;j<=cols;j++){

				int rem = num * num;
					num++;

				System.out.print(rem+""+ch+""+num2+"  ");
					ch--;
					num2--;
				}
		
		System.out.println();
			
		}
	}
}



/*

1C3  4B2  9A1
16C3  25B2  36A1
49C3  64B2  81A1

*/


// Logic No 2


class Program9{
	public static void main(String[]args){

		int rows=3;
		int x=1;
		
		

		for(int i=1;i<=rows;i++){

			int num=rows;
			int ch=65+rows-1;

				for(int j=1;j<=rows;j++){

				System.out.print(x*x + "" + (char)ch + "" + num +"");
				
				num--;
				ch--;
				x++;
					
				}
		
		System.out.println();
			
		}
	}
}


