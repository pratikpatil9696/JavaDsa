import java.io.*;
import java.util.*;
class Program1{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Enter Marks Of 'DSBDA' : ");
		
		int dsbda=Integer.parseInt(br.readLine());

		System.out.println("Enter Marks Of 'SMA' : ");
		
		int sma=Integer.parseInt(br.readLine());

		System.out.println("Enter Marks Of 'WT' : ");
	
		int wt = Integer.parseInt(br.readLine());

		System.out.println("Enter Marks Of 'AI' : ");

		int ai = Integer.parseInt(br.readLine());

		System.out.println("******************Marks*******************" +'\n'+ "DSBDA : "+dsbda +""+'\n'+ "SMA : " + sma+""+ '\n'+ 

 		 "WEB : " + wt+""+ '\n'+ "Artifical : "+ai+'\n'+"*****************************************************" );
		
		double avg=dsbda+sma+wt+ai;

		char ch;

		if(avg>75){
			ch='A';
		}

		else if(avg>60) {
			ch='B';

		}

		else if(avg>40){
			ch='C';
		}

		else{
			ch='D';
		}

		switch(ch){

		case 'A' : {

				System.out.println("Grade A");
				break;
		}

	case 'B':{

		System.out.println("Grade B");
		break;
	}

	case 'C':{
		System.out.println("Grade C");
		break;

	}
	case 'D':{

	System.out.println("fail");
	break;
	
		}
}

			
		
		



	}
}