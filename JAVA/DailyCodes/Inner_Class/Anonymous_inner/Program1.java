class Demo{
	void fun(){
		System.out.println("In Fun");
	}
}
class Outer{
	public static void main(String[]args){
		Demo obj1=new Demo(){

		};
		Demo obj2=new Demo(){
		
		};
	}
}
