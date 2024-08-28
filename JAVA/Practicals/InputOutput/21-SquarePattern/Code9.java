import java.util.*;
class Demo9{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			int num=row;
			for(int j=1;j<=row;j++){
				if(i%2==0){
					if(j%2==1){
						System.out.print(num*j +" ");
					}else{
						System.out.print(num +" ");
					}
				}else{
					if(i%2==1){
						if(j%2==1){
							System.out.print(--num +" ");
							num+=3;
						}else{
							System.out.print(num +" ");
						}
					}
				}
			}
			System.out.println();
		}
	}
}
