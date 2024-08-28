class Demo5{
	int x=10;
	Demo5(int x){
		System.out.println("In Constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[]args){
		Demo4 obj=new Demo4(20);
	}
}
