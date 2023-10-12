

class Demo{

	static int sqrt(int num){

	int start=1;
	int end=num;
	int ans=0;
	int itr=0;

	while(start <= end){

		itr++;
		int mid =(start+end)/2;
		int sqr =mid*mid;

		if(sqr==mid){
			System.out.println(itr);
			return mid;
		}

		if(sqr>num){
			end=mid-1;
		}
		else{
			ans=mid;
			start=mid+1;
		}
	}

	System.out.println(itr);
	return ans;

	}


	public static void main(String[] args) {
		
		int ret = sqrt(500);
		System.out.println(ret);
	}
}