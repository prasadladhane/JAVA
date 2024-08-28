class Demo{
	int x=10;

	Demo(){
		this(10);
		System.out.println("In No-arg Constructor");
	}
	Demo(int x){
		this(10,20);
		System.out.println("In para-1 constructor");
	}
	Demo(int x, int y){
		super();
		System.out.println("In para-2 constructor");
	}
	public static void main(String[]args){
		Demo obj1=new Demo();
	}
}

