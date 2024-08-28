import java.util.*;
class Demo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int num=2;
		int count=0;
		System.out.print("Enter Elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(arr[i]==num){
				count++;
			}if(count>0){
				System.out.print(num+"occured"+count+"times in array");
			}else{
				System.out.println(num+"number not found");
			}
		}
	}
}

