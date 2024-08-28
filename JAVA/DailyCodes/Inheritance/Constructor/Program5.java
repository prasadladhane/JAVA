class Demo5{
	Demo5(int x){
		System.out.println("In Constructor");
		System.out.println(x);
		System.out.println(this);
	}
	public static void main(String[]args){
		Demo5 obj=new Demo5(20);
		System.out.println(obj);
	}
}
