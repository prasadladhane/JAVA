import java.util.*;
class Demo8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{4,5,7,9,10};
		int count=0;
		int temp=1;
		int num=2;
		for(int i=0;i<arr.length;i++){
			while(temp<=arr[i]){
				if(num%5==0){
					count++;
				}if(count>2){
					System.out.println(arr[i]);
				}
			}
		}
	}
}

