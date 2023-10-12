import java.io.*;

class Demo{

	void getData()throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int  data =0;
		try{
		 
		  data = Integer.parseInt(br.readLine());
		}

		catch(NumberFormatException e){

			System.out.println("sapdle");
			e.printStackTrace();
		}
		System.out.println(data);

	}

	public static void main(String[] args) throws IOException {
		
		Demo obj = new Demo();
		obj.getData();
	}
}