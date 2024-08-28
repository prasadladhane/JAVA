import java.util.*;
class ArrayD{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Reversed array:");
		for(int i=0;i<size/2;i++){
			int temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

