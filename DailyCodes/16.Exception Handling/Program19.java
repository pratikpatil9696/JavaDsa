

import java.io.*;


class Demo{

	public static void main(String[] args) {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x =0;

		try{

			x= Integer.parseInt(br.readLine());
		}


		catch(IOException   ie){

			System.out.println("Exceptio - 1");
		}


		catch(NumberFormatException ie){

			System.out.println("Exceptio - 2");
		}


		catch(NullPointerException ie){

			System.out.println("Exceptio - 3");
		}


		catch(Exception ie){

			System.out.println("Exceptio - 4");
		}



		System.out.println("8***********");

		

	}
}