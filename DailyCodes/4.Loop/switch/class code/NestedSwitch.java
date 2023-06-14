class NestedSwitch{
	public static void main(String []args){
System.out.println("...............");
		String str="Netflix";

			switch(str){

				case "Netflix" :{
					
								String str1="movies";

								switch(str1){

								case "series":{
										System.out.println("Its Series...");
										//break;
									}

								case "movies":{
									System.out.println("Its Movies...");
									//break;
								}
								}
					//break;

					}

			   case "Prime":{

								String str1="movies";

								switch(str1){

								case "series":{
										System.out.println("prime Series...");
										///break;
									}

								case "movies":{
									System.out.println("prime Movies...");
									//break;
								}
								}

                 //break;
			    }

			}

	}
}