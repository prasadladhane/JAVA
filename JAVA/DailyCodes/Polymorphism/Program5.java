class Parent{
	void marry(){
		System.out.println("Aliya");
	}
}
class Child extends Parent{
	void marry(){
		System.out.println("Disha");
	}
}
class Client{
	public static void main(String[]args){
		Parent p=new Child();
		p.marry();
	}
}
