import java.util.*;
class Demo10{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int row=sc.nextInt();

		int num=row;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				if(j%2==0){
					System.out.print("@\t");
				}else{
					System.out.print(num++ +"\t");
				}
			}
			System.out.println();
		}
	}
}

