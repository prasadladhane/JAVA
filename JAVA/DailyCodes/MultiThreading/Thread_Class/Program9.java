class DemoThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<5;i++){
			System.out.println("In Run");
		}
	}

	public static void main(String[]args) throws InterruptedException{
		System.out.println("In Main");
		DemoThread dt=new DemoThread();
		dt.start();
		for(int i=1;i<5;i++){
			System.out.println("Before Sleep");
		}
		Thread.sleep(2000);
		for(int i=1;i<5;i++){
			System.out.println("After Sleep");
		}
	}
}
