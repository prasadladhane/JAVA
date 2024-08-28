import java.util.*;
class Demo6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=sc.nextInt();

		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1 && j%2==1){
					System.out.print(num*num +" ");
				}else if(i%2==0 && j%2==0){
					System.out.print(num*num +" ");
				}else{
					System.out.print(num +" ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
