import java.util.*;
class Demo6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int flag=0;
		System.out.println("Enter key");
		int key=sc.nextInt();
		for(int i=0;i<size;i++){
			if(arr[i]%key==0){
				System.out.println("An element multiple of 5 found at index:"+i);
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("Element not found");
		}

	}
}

