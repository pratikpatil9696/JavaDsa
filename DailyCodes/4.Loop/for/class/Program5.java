//ArmStrong NUmber

class Program5{
	public static void main(String [] args){
	

	int n=153;
	int temp=n;
	
	int sum=0;

	
	
	while(n!=0){
	
	int rem = n % 10;
	
	sum=sum+(rem*rem*rem);
	
	n=n/10;
	}

	if(temp==sum){

	System.out.println("Yes");
	}

	else{
	System.out.println("No");
	}

}
}