
//Difference between Char array and int array(identityHashCode)

class Program1{

	public static void main(String[] args) {
		
		char arr[]={'x','y','z'};

		int arr2[]={10,10,20};


		System.out.println(arr);
		System.out.println(arr2);

		System.out.println("__________");

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));

		
		System.out.println("__________");
		
		System.out.println(System.identityHashCode(arr2[0]));
		System.out.println(System.identityHashCode(arr2[1]));
		System.out.println(System.identityHashCode(arr2[2]));

	
	}
}