class Demo9{
	public static void main(String[]args){
		String str=new String("Shashi");
		System.out.println(str); //Shashi
		System.out.println(System.identityHashCode(str)); //1000

		str=str+"Bagal";
		System.out.println(str); //ShashiBagal
		System.out.println(System.identityHashCode(str)); //2000
		str=str+"C2W"; 
		System.out.println(str); //ShashiBagalC2W
		System.out.println(System.identityHashCode(str)); //3000
	}
}

