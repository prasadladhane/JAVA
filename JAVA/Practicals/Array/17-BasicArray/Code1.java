import java.util.*;
class Demo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.print("Enter Array Elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){	
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}


