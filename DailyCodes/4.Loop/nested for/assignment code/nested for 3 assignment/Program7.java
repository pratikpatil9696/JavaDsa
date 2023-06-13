/*

F
E   F
D   E   F
C   D   E   F
B   C   D   E   F
A   B   C   D   E   F

*/






class Program7{
	public static void main(String[]args){


		int rowcol=6;
		
		char ch='F';
			
		for(int i=1;i<=rowcol;i++){
	
				char ch2 = ch;
			
			for(int j=1;j<=i;j++){  
				System.out.print(ch2 +"   ");
				ch2++;
			}

		ch--;
		System.out.println();
		}
	}
}




//Logic No  2   Using Typecasting


/*


class Program7{
	public static void main(String[]args){


		int rowcol=6;
		
			
		for(int i=1;i<=rowcol;i++){
	
			int ch=65+rows-i;
			
			for(int j=1;j<=i;j++){  
				System.out.print((char)ch +"   ");
				ch++;
			}

		ch--;
		System.out.println();
		}
	}
}


