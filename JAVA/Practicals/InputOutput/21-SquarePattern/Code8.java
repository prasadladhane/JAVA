import java.util.*;
class Demo8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			char ch='C';
			for(int j=1;j<=row;j++){
				if(i%2==1 && j%2==1){
					System.out.print("#" +" ");
				}else if(i%2==0 && j%2==0){
					System.out.print("#" +" ");
				}else{
					System.out.print(ch +" ");
					ch--;
				}
			}
			System.out.println();
		}
	}
}
