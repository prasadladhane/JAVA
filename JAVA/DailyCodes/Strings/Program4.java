class StringDemo4{
	public static void main(String[]args){
		String str1="kanha";
		String str2="Ashish";
		String str3="kanhaAshish";
		String str4=str1+str2;

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
