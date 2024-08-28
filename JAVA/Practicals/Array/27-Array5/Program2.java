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
		int oSum=0;
		int eSum=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				eSum+=arr[i];
			}
			else{
				oSum+=arr[i];
			}
		}
		System.out.println("Odd Sum"+oSum);
		System.out.println("Even Sum"+eSum);
	}
}

