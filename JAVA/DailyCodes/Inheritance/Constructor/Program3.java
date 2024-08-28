class Demo3{
	static Demo3(){
		System.out.println("In Constructor");
	}
	public static void main(String[]args){
		Demo obj=new Demo();
	}
}
// output is error because constructor cannot be static.
