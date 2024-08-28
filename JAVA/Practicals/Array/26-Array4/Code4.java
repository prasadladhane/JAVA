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
		System.out.println("Enter the number you want to check:");
		int num=sc.nextInt();
		int cnt=0;
		for(int i=0;i<size;i++){
			if(arr[i]==num){
				cnt++;
			}
		}
		System.out.println(num+" occurs more than "+cnt+" times in the array.");
	}
}

