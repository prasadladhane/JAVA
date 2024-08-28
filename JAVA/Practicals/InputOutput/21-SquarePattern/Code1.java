import java.util.*;
class Demo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			int num=64+row;
			for(int j=1;j<=row;j++){
				if(i%2==0){
					System.out.print(row +" ");
				}else{
					System.out.print((char)num-- +" ");
				}
			}
			System.out.println();
		}
	}
}
