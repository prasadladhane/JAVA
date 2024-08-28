import java.util.*;
class Demo4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter array element:");
		int arr2[]=new int[size];
		for(int i=0;i<size;i++){
			arr2[i]=sc.nextInt();
		}
		System.out.println("Common elements in the given arrays are:");
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}

