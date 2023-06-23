class Program13{
	

	static void fun (int xarr[]){

		xarr[2]=50;

		for(int x:xarr){
			System.out.println(x);
		}


	}
  

    public static void main(String[] args) {

	
		int arr[]={10,20,30};
		

		for(int x:arr){

			System.out.println(x);
		} 

		fun(arr);

		for(int x:arr){

			System.out.println(x);
		} 
    }
}

