class SwitchDemo4{
	public static void main(String[]args){
		int x=5;

		switch(x){

		default:System.out.println("No Match");
			
		case 1:System.out.println("One");

		case 2:System.out.println("Two");

		case 3+2:System.out.println("five");

			case 3:System.out.println("Three");

		case 4:System.out.println("four");

		}
	}
}