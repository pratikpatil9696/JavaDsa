/*
print palindrome number or not
*/
class Program11{
public static void main(String[]args){
	
	int n=1231;
	int rev=0;
	int temp=n;
	

	while(n!=0){
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}

	if(rev==temp){
	System.out.println("It is Palindrome");
	}
	else{
	System.out.println("Not Palindrome");
	}

}


}
