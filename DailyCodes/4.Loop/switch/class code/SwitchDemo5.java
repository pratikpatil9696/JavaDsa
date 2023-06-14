class SwitchDemo5{
	public static void main(String[]args){
		int x=65;

		switch(x){

		default:System.out.println("No Match");
			
		case 65:System.out.println("One");
				break;
		case 2:System.out.println("Two");

		case 3+2:System.out.println("five");

			case 3:System.out.println("Three");

		case 4:System.out.println("four");

		}
	}
}