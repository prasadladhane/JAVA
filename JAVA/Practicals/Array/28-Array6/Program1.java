import java.util.*;
class Demo1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<size-1;i++){
			if(arr[i]>=arr[i+1]){
			}
			else{
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("Descending Order");
		}
		else{
			System.out.println("Not descending Order");
		}
	}
}

