class Program17{
	

	void fun(int[] xarr){

		xarr[1]=70;
		xarr[2]=80;
	}
  

    public static void main(String [] args) {


    		int arr[]={10,20,30,40};


    		System.out.println(System.identityHashCode(arr[0]));
    		System.out.println(System.identityHashCode(arr[1]));
    		System.out.println(System.identityHashCode(arr[2]));
    		System.out.println(System.identityHashCode(arr[3]));


    		//print array
			for (int x : arr){
				System.out.println(x);
			}



    		Program17 obj =new Program17();

    		obj.fun(arr);


    		//Check fun change hashcode
			System.out.println(System.identityHashCode(arr[1]));
			System.out.println(System.identityHashCode(arr[2]));
			

			//print changeble array
			for (int x : arr){
				System.out.println(x);
			}


			//Chech new assign of 70 & 80 hash code
			int x=70;
			int y=80;


			System.out.println(System.identityHashCode(x));
			System.out.println(System.identityHashCode(y));

			// arr[1] and arr[2]  and

			// int x and int y  

			// Both have Same hash code because of they are in Integer cache

    }
}

