class Demo12{
	public static void main(String[]args){
		StringBuffer sb=new StringBuffer("Shashi");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

		sb=sb.append("Bagal");
		//sb=sb+"Bagal";
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());
	}
}

