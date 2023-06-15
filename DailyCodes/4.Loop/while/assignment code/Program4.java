//print the odd digit of given no

class Program4{
public static void main(String[]args){
	
	int n=654654354;
	
	while(n!=0){

	int rem=n%10;
	if(rem % 2 == 1) {
	System.out.println(rem);
	} 
	n=n/10;
	}
}
}
