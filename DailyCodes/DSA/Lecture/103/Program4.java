
//reverse array

class Demo{

	public static void main(String[] args) {
		
		int arr[]= new int[]{4,9,8,3,1,7,1};

		int i=0;
		int j=arr.length-1;

		while(i<j){

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

			i++;
			j--;
		}

		for (int k=0;k<arr.length;k++){

			System.out.println(arr[k]);
		}
	}
}