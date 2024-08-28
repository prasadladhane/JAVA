import java.util.*;
class Demo6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows : ");
		int row=sc.nextInt();

		for(int i=1; i<=row; i++){
			int num=row-i+1;
			for(int sp=1; sp<i; sp++){
				System.out.print("  ");
			}
			for(int j=1; j<=row-i+1; j++){
				System.out.print(num +" ");
			}
			System.out.println();
		}
	}
}

