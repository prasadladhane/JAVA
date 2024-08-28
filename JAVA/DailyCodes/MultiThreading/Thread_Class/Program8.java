class ThreadDemo extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(getName());
	}
}
class MyThread extends Thread{
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(getName());
}
class Client{
	public static void main(String[]args){
		ThreadDemo td=new ThreadDemo();
		MyThread mt=new MyThread();
		mt.start();
		td.start();
	}
}
