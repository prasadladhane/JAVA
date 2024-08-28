import java.util.*;
class Demo8{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter no of rows : ");
                int row=sc.nextInt();

                for(int i=1; i<=row; i++){
			int num=i;
                        for(int space=1; space<i; space++){
                                System.out.print("  ");
                        }
                        for(int j=1; j<=row-i+1; j++){
                                System.out.print(num++ +" ");
                        }

                        System.out.println();
                }
        }
}

