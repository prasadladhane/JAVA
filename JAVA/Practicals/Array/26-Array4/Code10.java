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
		System.out.println("Enter character key:");
		char ch=sc.next().charAt(0);
		for(int i=0;i<size;i++){
			if(arr[i]==ch){
				break;
			}
			else{
				System.out.println(arr[i]);
			}
		}
	}
}

