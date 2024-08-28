import java.util.*;
class Demo5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int rows=sc.nextInt();

		for(int i=1; i<=rows; i++){
			int num=rows-i+1;
			for(int sp=1; sp<=rows-i;sp++){
				System.out.print("\t");
			}
			for(int j=1; j<=i*2-1; j++){
				System.out.print(num +"\t");
			}
			System.out.println();
		}
	}
}

