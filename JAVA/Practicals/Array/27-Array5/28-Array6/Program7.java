import java.util.*;
class Demo7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array will be like:");
		for(int i=0;i<size;i++){
			if(arr[i]>='A' && arr[i]<='Z'){
				System.out.println((char)arr[i]+" ");
			}
			else{
				System.out.println(arr[i]+" ");
			}
		}
	}
}

