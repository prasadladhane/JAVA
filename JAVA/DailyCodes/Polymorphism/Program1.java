class Demo1{
	void fun(int x){
		System.out.println("Int-Int");
	}
	void fun(char x){
		System.out.println("fun-char");
	}
	void fun(float x){
		System.out.println("fun Float");
	}
	public static void main(String[]args){
		Demo1 obj=new Demo1();
		obj.fun();
	}
}
