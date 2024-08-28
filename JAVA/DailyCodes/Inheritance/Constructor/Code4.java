class Demo4{
	Demo4(int x){
		System.out.println("In Constructor");
		System.out.println(x);
		System.out.println(this);  //700
	}
	public static void main(String[]args){
		Demo4 obj=new Demo4(20);
		System.out.println(obj);  //700
	}
}
