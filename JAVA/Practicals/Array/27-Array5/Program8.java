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
		int min=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		int secMin=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]<=secMin && arr[i]>min){
				secMin=arr[i];
			}
		}
		System.out.println("Second minimum element in array is:"+secMin);
	}
}

