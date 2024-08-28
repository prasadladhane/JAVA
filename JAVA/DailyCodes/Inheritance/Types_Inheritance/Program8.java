class Parent{
	int x=10;
	static int y=20;

	Parent(){
		System.out.println("In Parent");
	}
	void fun(){
		System.out.println("In Fun");
	}
	static void run(){
		System.out.println("In Run");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	public static void main(String[]args){
		Child obj=new Child();

		System.out.println(obj.x);
		System.out.println(obj.y);

		obj.fun();
		obj.run();
	}
}
