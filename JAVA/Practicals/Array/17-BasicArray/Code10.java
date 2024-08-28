import java.util.*;
class Demo10{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//System.out.print("Enter Total No of Players:");
		//int size=sc.nextInt();
		int arr[]=new int[3];
		System.out.print("Enter Jersey No:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==45){
				System.out.println("Rohit Sharma");
			}else if(arr[i]==18){
				System.out.println("Virat Kohli");
			}else if(arr[i]==7){
				System.out.println("MS Dhoni");
			}else{
				System.out.println("Wrong Input");
			}
		}
	}
}

