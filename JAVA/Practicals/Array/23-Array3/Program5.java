import java.util.*;
class Array{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size ");

                int size = sc.nextInt();
                int arr[] = new int[size];
                int num = 5;
                for(int i=0;i<arr.length;i++){
                        System.out.print("Enter "+i+"th Element :");
                        arr[i] = sc.nextInt();

                        }

                        for (int i=0;i<arr.length;i++){
                             System.out.print( arr[i]*arr[i] "\t");
        }

        }
}


