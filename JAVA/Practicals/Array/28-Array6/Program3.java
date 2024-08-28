import java.util.*;
class Demo3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Key");
		int key=sc.nextInt();
		int num=0,cnt=0;
		for(int i=0; i<size-1; i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
			if(cnt>2){
				num=arr[i];
			}
			if(num==arr[i]){
				arr[i]=num*num*num;
			}
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}

