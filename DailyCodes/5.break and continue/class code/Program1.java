class Program1{

	public static void main(String[] args){
		
		int n=15;
		int count=0;

		for(int i=1;i<=n;i++){
		  if(n%1==0){
			count++;
			}
 			System.out.println(i);
			if(count>2){
			  break;
			}
		}

		if(count==2){
		System.out.println("Prime");
		}	
		
		else{
		System.out.println("Not Prime");
		}
	}


}