class Program6{

	public static void main(String[] args) {
		
		String str1="Pratik";
		String str2=str1;
		String str3=new String(str2);

		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

	}
}

/*
Output

366712642
366712642
1829164700

new ne kahi pan banvle ki navin gola

*/