

import java.io.*;
class Demo{

	static int sumNat(int num){

		int sum=0;
		int itr=0;
		
		for(int i=1;i<=num;i++){

			sum=sum+i;
			itr++;

		}
		System.out.println(itr);
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