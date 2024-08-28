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
		for(int i=0;i<size;i++){
			int temp=arr[i];
			int fact=1;
			while(temp>0){
				fact=fact*temp;
				temp--;
			}
			System.out.print(fact+" ");
		}
		System.out.println();
	}
}

