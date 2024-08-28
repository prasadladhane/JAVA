import java.util.*;
class Demo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int flag=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++){
			if(arr[i]>=arr[i+1]){
				flag=0;
			}else{
				flag=1;
			}
			if(flag==0){
				System.out.println("Given array is in descending order:");
			}else{
				System.out.println("Given array is not in descending order:");
			}
		}
	}
}

