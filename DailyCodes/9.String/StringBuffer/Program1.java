class Program1{

	public static void main(String[] args) {
		
		StringBuffer sb =new StringBuffer("aaa");
		System.out.println(sb.capacity());

		sb.append("Pratik");
		sb.append("patil");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Incubator");

		System.out.println(sb);
		System.out.println(sb.capacity());






	}
}