import java.util.*;
class Demo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size:");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;

		System.out.println("find no:");
		int num=sc.nextInt();

		for(int i=0;i<size;i++){
			if(arr[i]==num){
				count++;
				break;
			}
		}
		System.out.println(num+" is occured "+count+" times");
		System.out.println();
	}
}
