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
			int cnt=0;
			int temp=arr[i];
			while(temp>0){
			int	rem=temp%10;
				cnt++;
				temp/=10;
			}
			System.out.print(cnt+"\t");
		}
		System.out.println();
	}
}

