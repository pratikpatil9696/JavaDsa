import java.io.*;
class Program2{
	
	public static void main(String []args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter no");
		int num=Integer.parseInt(br.readLine());

		switch(num){
		case 1:{
			System.out.println("One");
			break;
		}

	   	case 2:{
	   		System.out.println("Two");
	   		break;
	   	}

	   case 3:{
	   		System.out.println("Three");
	   		break;
	   }

	   case 4:{
	   		System.out.println("Four");
	   		break;
	   }

	   case 5:{
	   		System.out.println("Five");
	   		break;
	   }

		default : {
			System.out.println("You Have Entered Greater Than 5");
			break;
		}


		}
	}
}