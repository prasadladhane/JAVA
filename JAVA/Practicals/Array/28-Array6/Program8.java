import java.util.*;
class Demo8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		char arr[]=new char[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		System.out.println("Before Array");
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=0;i<=size/2;i++){
			char temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		System.out.println("After Reverse");
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}

