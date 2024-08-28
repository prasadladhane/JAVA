import java.util.*;
class ArrayD{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		char arr[]=new char[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<size;i++){
			if(arr[i]>90){
				int num=arr[i]-32;
				System.out.println((char)num);
			}
			else{
				System.out.println(arr[i]);
			}
		}
	}
}

