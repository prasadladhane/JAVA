import java.util.*;
class Demo10{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{1,4,5,6,11,9,10};
		int count=0;
		int temp=1;
		int num=0;
		for(int i=0;i<arr.length;i++){
			while(temp<=arr[i]){
				if(num%temp==0){
					count++;
				}
				temp++;
			}
		}
	}
}

