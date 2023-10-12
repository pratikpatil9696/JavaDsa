enum ProLang{

	C,CPP,Java,Python
}

class Demo{

	public static void main(String[] args) {


		System.out.println(ProLang.C);
		System.out.println(ProLang.Java);

		ProLang lang=ProLang.Java;
		
		System.out.println(lang.ordinal());
		System.out.println(lang.name());
		System.out.println(lang.toString());
	}
}