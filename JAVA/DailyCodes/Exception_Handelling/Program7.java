class DefaultHandelling3{
	static void fun(int x,int y){
		System.out.println("Start fun");
		try{
			System.out.println(x/y);
		}catch(Exception e){
			System.out.println("Exception Handelled");
		}
			System.out.println("End fun");
	}
		
	public static void main(String[]args){
		int x=10;
		int y=0;
		System.out.println("Start Main");
		fun(x,y);
		System.out.println("End Main");
	}
}

