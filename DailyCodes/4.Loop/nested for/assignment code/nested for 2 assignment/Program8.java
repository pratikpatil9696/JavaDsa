/*

A b C d
E f G h
I j K l
M n O p

*/


class Program8{
	public static void main(String[]args){

		int rows=4;
		int cols=4;
		
		char ch ='A';
		char ch2='a';

		for(int i=1;i<=rows;i++){


				for(int j=1;j<=cols;j++){

					if(j % 2 ==1){
						System.out.print(ch +" ");
						
					}
					

					else{
					System.out.print(ch2 +" ");
					
					}
					
					ch++;
					ch2++;
					
				}
		
		System.out.println();
			
		}
	}
}





//Logic no 1 it is not good answer

/*
class Program8{
	public static void main(String[]args){

		int rows=4;
		int cols=4;
		
		int num=1;
		char ch ='A';
		char ch2='a';

		for(int i=1;i<=rows;i++){


				for(int j=1;j<=cols;j++){

					if(num % 2 ==1){
						System.out.print(ch +" ");
						ch++;
						ch2++;
					}
					

					else{
					System.out.print(ch2 +" ");
					ch++;
					ch2++;
					}
				
					num++;
				}
		
		System.out.println();
			
		}
	}
}



*/