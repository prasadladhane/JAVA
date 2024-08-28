class ThreadDemo extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("In Thread-ThreadDemo");
		}
	}
}
class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("In Thread-MyThread");
		}
	}
}
class Client{
	public static void main(String[]args){
		MyThread mt=new MyThread();
		ThreadDemo td=new ThreadDemo();
		mt.start();
		td.start();
	}
}

