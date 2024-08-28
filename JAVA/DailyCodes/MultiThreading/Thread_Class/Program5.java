class MyThread extends Thread{
	void fun(){
		System.out.println("In Fun");
	}
}
class Client{
	public static void main(String[]args){
		MyThread mt=new MyThread();
		mt.start();
		mt.start();
	}
}
