class Parent{
	int x=10;
	void fun(){
		System.out.println("In Fun");
	}
}
class Child extends Parent{

}
class Client{
	public static void main(String[]args){
		Child obj=new Child();
		System.out.println(obj.x);
		obj.fun();
	}
}
