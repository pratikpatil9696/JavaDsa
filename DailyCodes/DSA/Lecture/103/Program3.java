
//given an array of size N 
//return r=the count of pairs(i,j)with Arr[i]+Arr[j]=k
//Arr=[3,5,2,1,-3,7,8,15,6,13]
//N=10
//k=10
//Note=i!=j
//output=6

class Demo{

	public static void main(String[] args) {
		
		int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
		int N=10;
		int k=10;
		int count=0;

		for(int i=0;i<N;i++){

			for(int j=0;j<N;j++){

				if(arr[i]+arr[j]==k && arr[i] != arr[j]){

					count++;
				}
			}
		}

		System.out.println(count);

	}
}