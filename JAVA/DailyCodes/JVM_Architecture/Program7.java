class InputDemo{
	void fun(){
		System.out.println("In instance-fun");
	}
	static void run(){
		System.out.println("In static-run");
	}
}
class Client{
	void gun(){
		System.out.println("In non static-gun");
	}
	public static void main(String[]args){
		System.out.println("In Main");
		
		InputDemo obj1=new InputDemo();
		Client obj2=new Client();

		obj1.fun();
		InputDemo.run();
		obj2.gun();
	}
}
