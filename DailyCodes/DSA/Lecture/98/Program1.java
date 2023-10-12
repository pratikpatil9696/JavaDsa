
//Counting Factor


import java.util.*;
class Demo{

	public static void main(String[] args) {
		
		
		Demo obj = new Demo();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int x= sc.nextInt();

		int fact=obj.countFactors(x);

		System.out.println("Count :"+fact);
	}



  int countFactors(int x){

	int count=0;

	for(int i=1;i<=x;i++){

			if(x % i ==0){
				count++;
			}
	}

	return count;
}

}

