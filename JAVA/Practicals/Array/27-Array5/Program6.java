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
			int num=1,temp=arr[i],cnt=0;
			while(num<=temp){
				if(temp%num==0){
					cnt++;
				}
				num++;
			}
			if(cnt==2){
				System.out.println(arr[i]);
				break;
			}
		}
	}
}

