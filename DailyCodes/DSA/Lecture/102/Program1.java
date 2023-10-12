
class Demo{


	static int sum(int N){

		int sum=0;
		for(int i=0;i<=N;i++){

			sum+=i;

		}

		return sum;
	}

	static int gauss(int N){

		return (N*(N+1))/2;
	}

	public static void main(String[] args) {
		
		int total=sum(5);
		System.out.println(total);


		int totalgauss=gauss(5);
		System.out.println(totalgauss);
	}
}