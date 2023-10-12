
//User Defined Exception

import java.util.Scanner;

class DataUnderFlowException extends RuntimeException{

	DataUnderFlowException(String msg){

		super(msg);
	}
}

class DataOverFlowException extends RuntimeException{

	DataOverFlowException(String msg){

		super(msg);
	}
}

class ArrayDemo{

	public static void main(String[] args) {
		
		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Data");
		System.out.println("Note : 0 < data < 100");
		for(int i=0;i<arr.length;i++){

			 int data=sc.nextInt();
			 try{
			 if(data<0){

			 	throw new DataUnderFlowException("Bhava data 0 Peksha lahan ahe");
			 }

				}

				catch(DataUnderFlowException e){
					System.out.println("asdadasd");
				}
			 if(data>100){

			 	throw new DataOverFlowException("Bhava data 100 Peksha Motha ahe");
			 }

			 arr[i]=data;
		}



		System.out.println("Print the data");
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]);
			System.out.print("  ");
		}	
	}
}