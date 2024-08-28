import java.util.*;
class Demo3{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter no of rows : ");
                int row=sc.nextInt();

                int num1=row;
                int num2=96+row;
                for(int i=1; i<=row; i++){
                        for(int j=1; j<=row; j++){
                                if(i%2==1){
                                        if(j%2==0){
						System.out.print(num1 +"\t");
					}else{
						System.out.print((char)num2 +"\t");
					}
                                }else{
                                        if(j%2==0){
                                                System.out.print((char)num2 +"\t");
                                        }else{
                                                System.out.print(num1 +"\t");
                                        }
                                }
                                num1++;
                                num2++;
                        }
                        System.out.println();
                }
        }
}

