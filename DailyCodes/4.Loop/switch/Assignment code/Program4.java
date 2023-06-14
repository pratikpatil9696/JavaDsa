import java.io.*;
class Program4{
	public static void main(String []args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("What's Your Interest?"+'\n'+"1.Movies"+'\n'+"2.Series");

		int ch=Integer.parseInt(br.readLine());

		switch(ch){

		case 1:{
			System.out.println("aaaaa");
			break;
		}

		case 2:{
			System.out.println("BBBB");
			break;
		}
		}



	}

}