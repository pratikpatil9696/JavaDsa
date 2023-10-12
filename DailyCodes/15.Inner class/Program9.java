 class Outer{
	
		
			class Inner{

			
			final static int a =70;			
		}
}

class Client{

		public static void main(String[] args) {
				
			Outer obj = new Outer();

			
			
			System.out.println(Outer.Inner.a);
			//System.out.println(Outer.new Inner().a);
			System.out.println(obj.new Inner().a);
		
		}
}