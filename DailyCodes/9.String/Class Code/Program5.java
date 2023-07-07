
// char internally int mhnun jato

class Program5{
	public static void main(String[] args) {

		char ch='A';
		int x=65;


		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(x));
		
	}
}

/*

Output:-

366712642
1829164700

check byte code 
bypush is used for when we put data into integer cache or anything else

byte code madhe tula ...char ch='A'... sathi pan 65 ch disel //ascii value of A is 65
		             ...int x=65;...  ani ya sathi pn 65 ch disel

doghancha identityhashcode same asla pahije hota pn to nahi yache reason aapn object chya functionality primitive data type sathi use krrto 
teva to valueOf() la call karto ani valueOf() he navin object banvte..pn ha problem fakt identityHashCode magitlyavr yeto

*doghe pn 65 ch jatat identityHashCode magitla ki problem yeto

*/