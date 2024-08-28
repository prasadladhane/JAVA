class Demo4{
	void fun(int x,int y){
		System.out.println("int-int");
	}
	void fun(int x,float y){
		System.out.println("int-float");
	}
	void fun(float x,int y){
		System.out.println("float-int");
	}
	void fun(float x,float y){
		System.out.println("float-float");
	}
	public static void main(String[]args){
		Demo4 obj=new Demo4();
		obj.fun(10,20);
		obj.fun(10,20.5f);
		obj.fun(10.25f,20);
		obj.fun(10.12f,20.25f);
	}
}
