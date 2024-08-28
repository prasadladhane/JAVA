class ThreadDemo{
	static void fun()throws InterruptedException{
		for(int i=1;i<=5;i++){
			System.out.println("In Fun");
			Thread.sleep(5000);
		}
	}
	public static void main(String[]args)throws InterruptedException{
			System.out.println("In Main");
			fun();
			System.out.println("End Main");
	}
}
			


