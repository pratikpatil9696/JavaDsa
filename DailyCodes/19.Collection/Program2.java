
import java.util.*;
class Demo{

	public static void main(String[] args) {
		
		ArrayList al2 = new ArrayList();

		al2.add("Sanskar");
		al2.add("Ashu");
		al2.add("Pratik");
		al2.add(10);

		Object arr[]=al2.toArray();
		System.out.println(arr);

		for(Object data:arr){
			System.out.print(data+" ");
		}

		System.out.println();
	}
}