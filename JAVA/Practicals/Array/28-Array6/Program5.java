import java.util.*;
class Demo5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter array element:");
		for(int i=0;i<size1;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size for 2nd array:");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enter elements :");
		for(int i=0;i<size2;i++){
			arr2[i]=sc.nextInt();
		}
		int size=size1+size2;
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			if(i<size1){
				for(int j=0;j<size1;j++){
					if(i==j){
						arr[i]=arr1[j];
					}
				}
			}
			else if(i>=size1 && i<size2){
				for(int j=0;j<size2;j++){
					if(i==(size1+j)){
						arr[i]=arr2[j];
					}
				}
			}
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]+" ");
		}
	}
}

