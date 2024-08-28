import java.util.*;
class Demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int oddSum=0;
		int evenSum=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(arr[i]%2==1){
				oddSum=oddSum+arr[i];
			}else{
				evenSum=evenSum+arr[i];
			}
		}
			System.out.println(oddSum+"is sum of odd no");
			System.out.println(evenSum+"is sum of even no");
	}
}

