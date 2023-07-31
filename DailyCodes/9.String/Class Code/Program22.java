//My Length Method

class Program22{


	static int myString(String str1){

		char [] arr=str1.toCharArray();

		int count=0;
		for(int i=0;i<arr.length;i++){

			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		
		String str1="Pratik";

		int x=myString(str1);
		System.out.println(x);
	}
}