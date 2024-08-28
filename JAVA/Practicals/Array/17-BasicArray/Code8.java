import java.util.*;
class Demo8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Count of Employee:");
		int count=sc.nextInt();
		int arr[]=new int[count];
		System.out.print("Enter Age:");
		for(int i=0;i<count;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<count;i++){
			System.out.println("Employee Age are:"+arr[i] );
		}
	}
}

