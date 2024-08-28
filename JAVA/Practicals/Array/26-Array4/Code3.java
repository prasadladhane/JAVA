import java.util.*;
class Demo3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		int secMax=arr[0];
		for(int i=0;i<size;i++){
			if(secMax<arr[i] && max>arr[i]){
				secMax=arr[i];
			}
		}
		System.out.println("Second max element in array:"+secMax);
	}
}

