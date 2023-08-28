class macd{

	int item = 5;
	String Product="Fries";


	void menu(){
		String menu1="Veg";
		String menu2="NonVeg";
		System.out.println(item);
		System.out.println(Product);
	}
}

class User{
	public static void main(String[] args) {
		
			
			macd obj=new macd();
			obj.menu();
	}
}