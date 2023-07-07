
//How String goes internally

class Program3{
	public static void main(String[] args) {
		
		String str1="Core2Web";
		String str2=new String("Core2Web");
		String str3="Core2Web";
		String str4=new String("Core2Web");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}

}


/*

Output:-

366712642
1829164700
366712642
2018699554

1st and 3rd Same identityHashCode
when we create string using "new" it always goes heap section 
*/