

import java.util.*;

class Cricplayer{

	int jerNo=0;
	String name=null;

	Cricplayer(int jerNo,String name){
		
		this.jerNo=jerNo;
		this.name=name;


	}

	
	
	
}


class Demo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new Cricplayer(18,"virat"));


		System.out.println(al);
		System.out.println(al);
	}
}