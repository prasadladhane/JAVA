import java.util.*;
class Demo2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			System.out.println(size);
		}
		int dCnt=0,sum=0;
		int temp=0;
		int num=0;
		int cnt=1;
		for(int i=0;i<size;i++){
			temp=arr[i];
			num=1;cnt=0;
			while(num<=temp){
				if(temp%num==0){
					cnt++;
				}
			}
			if(cnt==2){

				sum+=arr[i];
				dCnt++;
			}
		}
		System.out.println("Sum of all prime numbers is "+sum+" and count of prime numbers in the given array is "+dCnt);

	}
}

