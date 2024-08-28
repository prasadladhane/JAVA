import java.util.*;
class Demo{
	static void fun(){
		System.out.println("Start Fun");
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Value for X:");
		int x=sc.nextInt();
		System.out.println("Enter Value for Y:");
		int y=sc.nextInt();

		try{
			System.out.println(x/y);
		} catch(Exception io){
			System.out.println("Exception");
		}
		System.out.println("End Fun");
	}

	public static void main(String[]args){
		System.out.println("Start Main");
		fun();
		System.out.println("End Main");
	}
}
