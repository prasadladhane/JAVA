import java.util.*;
class Demo10{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter no of rows : ");
                int row=sc.nextInt();

                for(int i=1; i<=row; i++){
			int num=64+i;
			
                        for(int space=1; space<i; space++){
                                System.out.print("\t");
                        }
                        for(int j=1; j<=row-i+1; j++){
                                if(i%2==1){
					if(j%2==1){
						System.out.print(num +" \t");
					}else{
						System.out.print((char)num +" \t");
					}
				}else{
					if(j%2==1){
						System.out.print((char)num +" \t");
					}else{
						System.out.print(num +" \t");
					}
				}
				num++;
			}
                        System.out.println();
                }
        }
}

