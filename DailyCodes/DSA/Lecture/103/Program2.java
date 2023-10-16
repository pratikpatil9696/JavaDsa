
//given an integer array of size N count the no of elements having atleast 1 element greater than itself

class Demo{

	public static void main(String[] args) {
		
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
		int count=0;


		//Brut Force
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){

			for(int j=1;j<arr.length;j++){

				if (arr[i]<arr[j]) {

					count++;
					break;
					
				}

			}
		}

		System.out.println(count);


		int maxEle=Integer.MIN_VALUE;

		for (int i=0;i<arr.length;i++ ) {

			if(arr[i]>maxEle){
				maxEle=arr[i];
			}
			
		}

		int count2 =0;
		for(int i=0;i<arr.length;i++){

			if(arr[i]==maxEle){
				count2++;
			}
		}

		System.out.println(arr.length-count2);

	}
}
