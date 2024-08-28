import java.util.*;
class Demo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++){
			sum+=arr[i];
		}
		int avg=sum/size;
		System.out.println("Array elements average is:"+avg);
	}
}

