import java.util.*;
class Demo10{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows : ");
		int rows=sc.nextInt();
	
		for(int i=1; i<=rows; i++){
			int num=65+rows-i;
			for(int sp=1; sp<=rows-i; sp++){
				System.out.print("\t");
			}
			for(int j=1; j<=i*2-1; j++){
				if(i>j){
					System.out.print((char)num++ +"\t");
				}else{
					System.out.print((char)num-- +"\t");
				}
			}
			System.out.println();
		}
	}
}

