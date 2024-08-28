import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int x=0;
		int y=0;
		try{
			x=sc.nextInt();
			y=sc.nextInt();
			System.out.println(x/y);
		}catch(Exception e){
			System.out.println("Zero Division Error");
		}
		System.out.println("End Main");
	}
}

