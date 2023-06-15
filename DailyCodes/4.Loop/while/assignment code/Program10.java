/*
print the countdown of days
ip day=7
op 7 days remaining
6 days remaining
5 days remaining
.
.
1 days remaining
0 days assignment is overdue

*/
class Program10{
public static void main(String[]args){
	
int day=7;

	if(day==0){
	System.out.println(day+"days assignment is overdue");
	}
	
	else{
		while(day>=1){
		System.out.println(day+"days remaining");
		day--;
		}
	
	}

	if(day==0){
	System.out.println(day+"days assignment is overdue");
	}
}


}
