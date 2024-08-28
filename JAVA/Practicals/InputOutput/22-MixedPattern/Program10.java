import java.util.*;
class Demo10{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter no of rows : ");
                int row=sc.nextInt();

                for(int i=1; i<=row; i++){
                        for(int sp=1; sp<=row-i; sp++){
                                System.out.print("\t");
                        }
                        //int num=i*2-1;
			int num1=i;
			int num2=1;
                        for(int j=1; j<=i*2-1; j++){
                                if(i>j){
					System.out.print(num1-- +"\t");
				}else{
					System.out.print(num2++ +"\t");
				}
                        }
                        System.out.println();
                }
        }
}

