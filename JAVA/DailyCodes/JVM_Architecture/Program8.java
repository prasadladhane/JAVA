class Demo{
	static int q=50;
	int p=60;

}

class Client{
	int a=10;
	static int b=20;
	public static void main(String[]args){
		int x=30;
		int y=40;
		
		Demo obj1=new Demo();
		System.out.println("In Main");

		System.out.println(x);
		System.out.println(y);

		//System.out.println(a);
		System.out.println(b);

		System.out.println(obj1.p);
		System.out.println(Demo.q);
	}
}
	
