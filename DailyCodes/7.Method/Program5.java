import java.util.*;
class Program5{

	

	static void add(int x,int y){

	int ans = x+y;
	System.out.println(ans);

	}



		static void mul(int a,int b){

	int ans = a*b;
	System.out.println(ans);

	}





	public static void main(String []arsg){

		Program5 obj = new Program5();
		Scanner sc = new Scanner(System.in);

		System.out.println("asd");
		int x=sc.nextInt();
		int y=sc.nextInt();

		obj.add(x,y);
		obj.mul(x,y);

		}
}