
interface Core2Web{

	void lang();
}

class Year2022{

	public static void main(String[] args) {
		
		Core2Web c2w = new Core2Web(){

			public void lang(){

				System.out.println("Flutter/Java");
			}
		};

		c2w.lang();
	}
}