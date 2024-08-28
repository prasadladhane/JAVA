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
                            if (arr[i]== num){
					System.out.print("num "+  num +  " first occurred ai index:" + i);
				}else{
					System.out.print("num not found in array");
		}break;
        }

        }
}


