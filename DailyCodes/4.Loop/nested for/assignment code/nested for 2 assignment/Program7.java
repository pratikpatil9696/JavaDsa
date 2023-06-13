/*

1 2 9
4 25 6 
49 8 81

*/



class Program7{
	public static void main(String[]args){

		int rows=3;
		int cols=3;
		
		int num=1;
		

		for(int i=1;i<=rows;i++){


				for(int j=1;j<=cols;j++){

					if(num % 2 ==1){
						System.out.print(num*num +" ");
						num++;
					}
					

					else{
					System.out.print(num +" ");
					num++;
					}
				
					
				}
		
		System.out.println();
			
		}
	}
}


//Logic no 1 it is not good answer

/*
class Program7{
	public static void main(String[]args){

		int rows=3;
		int cols=3;
		
		int num=1;
		

		for(int i=1;i<=rows;i++){


				for(int j=1;j<=cols;j++){

					if((i % 2==1) && j % 2==1)
					System.out.print(num*num +" ");
					
					
					else if((i % 2==0) && j % 2==0)
					System.out.print(num*num +" ");
					

					else
					System.out.print(num +" ");

					num++;

				
					
				}
		
		System.out.println();
			
		}
	}
}

*/


class Program7{
	public static void main(String[]args){

		int rows=3;
		int cols=3;
		
		int num=1;
		

		for(int i=1;i<=rows;i++){


				for(int j=1;j<=cols;j++){

					if(num % 2 ==1){
						System.out.print(num*num +" ");
						num++;
					}
					

					else{
					System.out.print(num +" ");
					num++;
					}
				
					
				}
		
		System.out.println();
			
		}
	}
}



