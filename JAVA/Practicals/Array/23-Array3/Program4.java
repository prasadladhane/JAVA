import java.util.*;
class Array{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size ");

                int size = sc.nextInt();
                int arr[] = new int[size];
             
                for(int i=0;i<arr.length;i++){
                        System.out.print("Enter "+i+"th Element :");
                        arr[i] = sc.nextInt();

                        }

                        for (int i=0;i<arr.length;i++){
                            if (arr[i]%2== 0){
                                        System.out.print("0" + "\t");
                                }else{
                                        System.out.print("1" + "\t");
                }
        }

        }
}


