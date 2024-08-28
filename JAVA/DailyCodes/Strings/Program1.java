class StringDemo1{
	public static void main(String[]args){
		String str1="Shashi";
		String str2="c2w";
		String str3="Shashi";

		System.out.println(System.identityHashCode(str1)); //1000
		System.out.println(System.identityHashCode(str2)); //2000
		System.out.println(System.identityHashCode(str3)); //1000
	}
}
