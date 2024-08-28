class MyThread extends Thread{
	void fun(){
		System.out.println("In Fun");
	}
}
class Client{
	public static void main(String[]args){
		System.out.println("In Main");
		MyThread mt=new MyThread();
		mt.start();

	}
}
