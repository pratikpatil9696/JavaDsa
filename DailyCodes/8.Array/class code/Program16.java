class Program16{
	

	void fun(int xarr[]){

		xarr[1]=10+10;
	}
  

    public static void main(String [] args) {


    		int arr[]={10,20,30,40};


    		System.out.println(System.identityHashCode(arr[0]));
    		System.out.println(System.identityHashCode(arr[1]));
    		System.out.println(System.identityHashCode(arr[2]));
    		System.out.println(System.identityHashCode(arr[3]));


    		Program16 obj =new Program16();

    		obj.fun(arr);


			System.out.println(System.identityHashCode(arr[1]));
	


    }
}

