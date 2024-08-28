class xyz{
	static void fun(){
		System.out.println("In Fun");
	}
}
class Demo{
	static void run(){
		System.out.println("In Run");
	}
	public static void main(String[]args){
		run();
		xyz.fun();
	}
}

