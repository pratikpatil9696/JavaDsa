
			

//Problem Statement 1=N is not  perfect Square

class Demo{

	static int sqrt(int num){

		int x=0;
		int itr=0;

		for(int i=1;i<=num;i++){

			if(i*i <= num){
			 x = i;
			}

			else{
				break;
			}

			itr++;
		}

		System.out.println(itr);
		return x;

	}


	public static void main(String[] args) {
		
		int num=500;
		int ret =sqrt(num);

		System.out.println(ret);
	}

}