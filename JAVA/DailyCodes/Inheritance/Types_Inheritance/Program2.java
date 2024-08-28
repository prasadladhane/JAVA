class Demo{
	int x=10;

	Demo(){
		System.out.println("In No-arg Constructor");
	}
	Demo(int y){
		System.out.println("In parameterized constructor");
	}
	public static void main(String[]args){
		Demo obj1=new Demo();
				//Demo(obj1);
				
		Demo obj2=new Demo(10);
				//Demo(obj2,10);
	}
}

