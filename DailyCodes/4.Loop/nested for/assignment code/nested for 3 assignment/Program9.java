/*

1
8   27
64   125   216
343   512   729   1000

*/






class Program9{
	public static void main(String[]args){


		int rowcol=4;
		
		int num=1;
			
		for(int i=1;i<=rowcol;i++){
	
						
			for(int j=1;j<=i;j++){  
				System.out.print(num*num*num +"   ");
				num++;
			}

		
		System.out.println();
		}
	}
}












