class Demo{
	static void fun(){
		System.out.println("In Fun");
	}
}
class StatDemo{
	public static void main(String[]args){
		Demo obj=new Demo();
		obj.fun();
	}
}
