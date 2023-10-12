

import java.io.*;
class Demo{

	static int sumNat(int num){

		int sum=(num*(num+1))/2;
		return sum;
	}

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no");
		int num=Integer.parseInt(br.readLine());

		int ret=sumNat(num);

		System.out.println(ret);
	}
}