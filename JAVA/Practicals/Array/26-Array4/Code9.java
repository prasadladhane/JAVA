import java.util.*;
class Demo9{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
		char arr[]=new char[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<size;i++){
			if(arr[i]<'a' || arr[i]>'z'){
				System.out.println("#");
			}else{
				System.out.println(arr[i]);
			}
		}
	}
}

