import java.util.*;
class Demo9{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{5,7,9,1,13,15,19,90};
		int count=0;
		int temp=1;
		int num=2;
		for(int i=0;i<arr.length;i++){
			while(temp<=arr[i]){
				if(num%temp==0){
					count++;
				}if(count==2){
					System.out.print(arr[i]+" ");
				}
				temp++;
			}
		}
	}
}

