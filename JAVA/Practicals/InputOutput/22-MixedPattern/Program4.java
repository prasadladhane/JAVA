import java.util.*;
class Demo4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=sc.nextInt();

		char ch1='A';
		char ch2='a';
		for(int i=1;i<=row;i++){
			for(int sp=1;sp<=i-1;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=row-i;j++){
				if(row%2==0){
					System.out.print(ch2++ +"\t");
				}else{
					System.out.print(ch1++ +"\t");
				}
			}
			ch1--;
			ch2--;
			System.out.println();
		}
	}
}

