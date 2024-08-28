import java.util.*;
class Demo5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.print("Enter Elements:"+" ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<10){
				System.out.println(arr[i]+" is less than 10");
			}
		}
	}
}
