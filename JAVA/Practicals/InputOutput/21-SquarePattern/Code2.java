import java.util.*;
class Demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=sc.nextInt();

		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(num%3==0 || num%5==0){
					if(num%3==0){
						System.out.print(num*3 +" ");
					}else{
						System.out.print(num*5 +" ");
					}
				}else{
					System.out.print(num +" ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
