/*print in reverse if no is even
print in reverse order difference by 2 if no is odd
ip=6 op=6 5 4 3 2 1
ip7 op=7 5 3 1
*/
class Program9{
public static void main(String[]args){
	
	int n=7;
	int i=n;
	if(n % 2 ==0){
	   while(i>=1){
	   System.out.println(i);
	   i--;
	   }
	}
	else{
 	while(i>=1){
	System.out.println(i);
	i=i-2;
	}
	}

}
}
