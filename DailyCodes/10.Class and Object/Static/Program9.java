

class Program9{
	public static void main(String[] args) {
	


		Program9 obj = new Program9();
		Program9 obj1 = new Program9();
		Program9 obj2 = new Program9();

		System.out.println(obj);

		int arr[]=new int[50];
		System.out.println(arr);

		System.out.println(System.identityHashCode(arr));

		System.out.println(System.identityHashCode(obj));

		System.out.println("******");

		System.out.println(obj);

		System.out.println(obj1);

		System.out.println(obj2);

		System.out.println("*****");

		System.out.println(System.identityHashCode(obj));
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));


	}
}