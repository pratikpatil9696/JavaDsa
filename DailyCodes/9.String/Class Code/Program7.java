
//runtome la kahi pn banvle ki new string la call jato

class Program7{

	public static void main(String[] args) {
		
		String str1="Pratik";
		String str2="Patil";
		
		System.out.println(str1+str2);
	
		String str3="PratikPatil";

		String str4= str1+str2;

		System.out.println(System.identityHashCode(str3));

		System.out.println(System.identityHashCode(str4));


	}
}

/*

Output

PratikPatil   -scp
366712642     -scp
1829164700    -Heap