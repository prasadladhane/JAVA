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
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					System.out.println("First duplicate element present at index "+i);
					break;
				}
			}
		}
	}
}

