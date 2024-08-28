class MyThread extends Thread{
	void run(){
		for(int i=1;i<=5;i++){
			System.out.println("In Run");
		}
	}
}
class Client{
	public static void main(String[]args){
		MyThread mt=new MyThread();
		mt.start();
	}
}
