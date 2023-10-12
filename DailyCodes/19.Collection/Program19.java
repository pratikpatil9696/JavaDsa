

//User Defined Class Sorting 

import java.util.*;

class Employee{

	String empName = null;
	float sal = 0.0f;


	Employee(String empName , float sal){

		this.empName=empName;
		this.sal=sal;
	}

	public String toString(){
		return "{" + empName + ":" + sal + "}";
	}
}


class SortByName implements Comparator{

	public int compare(Object obj1,Object obj2){

		return ((Employee)obj1).empName.compareTo(((Employee)obj2).empName);
	}
}


class SortBySal implements Comparator{

	public int compare(Object obj1,Object obj2){
		return (int)(((Employee)obj1).sal - ((Employee)obj2).sal);
	}
}


class Demo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add(new Employee("Kanha" , 200000.0f ));
		al.add(new Employee("Ashish", 250000.0f ));
		al.add(new Employee("Badhe" , 150000.0f ));
		al.add(new Employee("Rahul" , 175000.0f ));
		
		System.out.println(al);

		Collections.sort(al,new SortByName());
		System.out.println(al);

		
		Collections.sort(al,new SortBySal());
		System.out.println(al);
		
	}
}