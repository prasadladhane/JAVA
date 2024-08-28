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
		System.out.println("Enter the character to check:");
		char ch=sc.next().charAt(0);
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ch){
				cnt++;
			}
		}
		System.out.println(ch+" occures "+cnt+" times in given array.");
	}
}

