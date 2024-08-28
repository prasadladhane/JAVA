import java.util.*;
class Demo8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int row=sc.nextInt();

		int num=row;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				if(i%2==0 || j%2==0){
					System.out.print((char)(97+num) +"\t");
				}else{
					System.out.print((num*num)-1 +"\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}

