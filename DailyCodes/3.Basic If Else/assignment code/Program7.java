/*
Calculate profit or loss. Write a program that takes the cost price and selling price (take it hardcoded) and calculates its profit or loss
I/P=selling price=1200
O/P=costPrice=1000
Profit is 200
*/


class Program7{

	public static void main(String[] args){

		int sp=-1200;
		int cp=1200;

			
			if(sp>cp){
			int profit=sp-cp;
			System.out.println(profit+" is a profit");
			}

			
			else if(cp>sp){
			int loss=cp-sp;
			System.out.println(loss+" is a loss");
			}


			else if(sp==cp)
			System.out.println("No Profit No Loss");
	}
}