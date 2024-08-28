import java.util.*;
class Demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=sc.nextInt();

		int num=1;
		for(int i=1;i<=row;i++){
			for(int sp=1;sp<=i-1;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=row-i+1;j++){
				System.out.print(num++ +"\t");
			}
			num--;
			System.out.println();
		}
	}
}

