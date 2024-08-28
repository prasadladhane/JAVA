class DefaultHandelling4{
	static void gun(int x,int y){
		System.out.println("Start gun");
		System.out.println(x/y);
		System.out.println("End Gun");
	}
	static void fun(int x,int y){
		System.out.println("Start Fun");
		gun(x,y);
		System.out.println("End Gun");
	}
	public static void main(String[]args){
		int x=10;
		int y=0;
		System.out.println("Start Main");
		fun(x,y);
		System.out.println("End Main");
	}
}
