import java.util.*;
class Demo4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();

		int sum=0;
		int arr[]=new int[size];
		System.out.print("Enter Elements:"+" ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(arr[i]%2==1){
				sum+=arr[i];
			}
		}
		System.out.print("Sum of odd elements:"+sum);
		System.out.println();
	}
}

