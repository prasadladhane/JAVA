import java.util.*;
class Demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			if(max<arr[i]){
				max=arr[i];
			}
		}
		int diff=max-min;
		System.out.println("The difference between minimum & maximum is:"+diff);
	}
}

