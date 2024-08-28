import java.util.*;
class ArrayD{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		long num=sc.nextInt();
		long rem=0,rev=0,temp=num;
	       	int cnt=0;
		while(temp>0){
			rem=temp%10;
			rev=rem+rev*10;
			temp/=10;
		        cnt++;
		}
		
		int size=cnt;
		long arr[]=new long[size];
		for(int i=0;i<size;i++){
			if(rev>0){
			rem=rev%10;
			arr[i]=rem;
			}
			rev/=10;
		}
		for(int i=0;i<size;i++){
			long x=arr[i]+1;
			System.out.print(x+"\t");
		}
		System.out.println();
	}
}

