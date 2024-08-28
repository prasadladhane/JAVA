import java.util.*;
class Demo1{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter no of rows : ");
                int row=sc.nextInt();

                int num1=64+row;
                int num2=96+row;
                for(int i=1; i<=row; i++){
                        for(int j=1; j<=row; j++){
                                if(j<(row-i+1)){
                                        System.out.print((char)num2+"\t");
                                }else{
                                        System.out.print((char)num1+"\t");
                                }
                                num1++;
                                num2++;
                        }
                        System.out.println();
                }
        }
}

