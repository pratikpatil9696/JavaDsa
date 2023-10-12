

import java.io.*;
class Demo{

	static int numCount(int a,int b){

		int count=0;

		if(a<b){
			count=b-a+1;
		}
		else{
			count=a-b+1;
		}


		return count;
	}

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		

		int ret=numCount(a,b);

		System.out.println(ret);
	}
}