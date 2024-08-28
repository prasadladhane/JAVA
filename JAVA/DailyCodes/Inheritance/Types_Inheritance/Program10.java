class Parent{
	int x=10;
	Parent(){
		System.out.println("In Parent Constructor");
	}

	void fun(){
		System.out.println("In Fun");
	}
}
class Child extends Parent{
	int x=20;
	Child(){
                System.out.println("In Child Constructor");
                System.out.println(x);
                System.out.println(super.x);

        }
	void run(){
		System.out.println("In Run");
	}
	public static void main(String[]args){
		Child obj=new Child();
	}
}
