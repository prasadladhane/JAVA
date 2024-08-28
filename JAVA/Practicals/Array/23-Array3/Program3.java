import java.util.*;
class Array{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size ");

                int size = sc.nextInt();
                int arr[] = new int[size];
                int count = 0;
			int num = 2;
                for(int i=0;i<arr.length;i++){
                        System.out.print("Enter "+i+"th Element :");
                        arr[i] = sc.nextInt();

                        }

                        for (int i=0;i<arr.length;i++){
				if (arr[i]==num){
				count++;
		}

		}
                            if (count==0){
                                        System.out.print("num " + num + "not found in array");
                                }else{
                                        System.out.print("num " + "occurred " + count + "times in array");
                }
        

        }
}


