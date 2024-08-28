import java.util.*;
class Demo7{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{121,144,225,88,90,84};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1 || arr.length%2==5){
				if(arr.length%2==1){
					System.out.println(arr[i]);
				}
			}
		}
	}
}

