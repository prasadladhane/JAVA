class DefaultHandelling{
	static void fun(int x,int y){
		System.out.println("Start Fun");
		System.out.println(x/y);
		System.out.println("End Fun");
	}
	public static void main(String[]args){
		int x=10;
		int y=5;
		System.out.println("Start Main");
		fun(x,y);
		System.out.println("End Main");
	}
}

