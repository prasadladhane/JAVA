import java.util.*;
class Demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the specific number:");
		int num=sc.nextInt();
		int pin=0;
		for(int i=0;i<size;i++){
			if(arr[i]==num){
				System.out.println(num+" is found at index:"+i);
				break;
			}
		}
		System.out.println();
	}
}
			
