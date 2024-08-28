class Demo2{
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
		Demo2 obj=new Demo2();
		obj.fun(25);
	}
}
