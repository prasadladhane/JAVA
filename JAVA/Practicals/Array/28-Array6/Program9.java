import java.util.*;
class Demo9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int cnt=0,rem=0,rev=0,temp=0;
		for(int i=0;i<size;i++){
			temp=arr[i];
			while(temp>0){
				rem=temp%10;
				rev=rem+rev*10;
				temp/=10;
			}
			if(rev==arr[i]){
				cnt++;
			}
		}
		System.out.println("Count of palindrome element is:"+cnt);
	}
}

