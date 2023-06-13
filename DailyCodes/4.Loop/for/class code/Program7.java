//ArmStrong NUmber users value

class Program7{
	public static void main(String [] args){
	

	int n=472335975;
	int temp=n;
	int var1=n;

	int count =0;
	int sum=0;


	//Count the Digit
	while(var1!=0){ 
	count++;
	var1=var1/10;
	}
	System.out.println("Count is "+count);

	
	
	//check armstrong
	while(n!=0){
	int rem = n % 10;
	int mul=1;

		for(int j=1;j<=count;j++){
		mul=mul*rem;
		}
	

	sum=sum+mul;	
	n=n/10;
	}




	if(temp==sum){
	System.out.println("it is Armstrong");
	}
	else{
	System.out.println("No Armstrong");
	}

}
}