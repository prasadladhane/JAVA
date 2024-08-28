class Demo3{
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
		Demo3 obj=new Demo3();
		obj.fun('A');
		obj.fun(25.8f);
	}
}
