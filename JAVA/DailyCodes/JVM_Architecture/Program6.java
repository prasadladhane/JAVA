class InputDemo{
	void fun(){
		System.out.println("In fun");
	}
	static void run(){
		System.out.println("In static run");
	}
	public static void main(String[]args){
		System.out.println("In main");
		run();
		InputDemo obj=new InputDemo();
		obj.fun();
		obj.run();
	}
}
