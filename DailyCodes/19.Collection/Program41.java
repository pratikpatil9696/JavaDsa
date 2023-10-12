
import java.util.*;

class Project implements Comparable{

	String projName;
	int teamSize;
	int duration;

	Project(String projName,int teamSize,int duration){

		this.projName=projName;
		this.teamSize=teamSize;
		this.duration=duration;
	}

	public String toString(){
		return "{" +projName+ ":" +teamSize+ ":" +duration+ "}"; 
	}

	public int compareTo(Object obj1){
		return projName.compareTo(((Project)obj1).projName);
	}
}


class Demo{

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();

		pq.offer(new Project("Persistent",100,5));	
		pq.offer(new Project("Microsoft",50,4));	
		pq.offer(new Project("Google",80,3));	
		pq.offer(new Project("Biencaps",21,7));	

		System.out.println(pq);

	}
}