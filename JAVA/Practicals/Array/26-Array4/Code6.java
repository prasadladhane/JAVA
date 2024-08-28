import java.util.*;
class ArrayD{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		char arr[]=new char[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		int vCnt=0, cCnt=0;
		for(int i=0;i<size;i++){
			if(arr[i]=='a'||arr[i]=='A'||arr[i]=='e'||arr[i]=='E'||arr[i]=='i'||arr[i]=='I'||arr[i]=='o'||arr[i]=='O'||arr[i]=='u'||arr[i]=='U'){
				vCnt++;
			}
			else{
				cCnt++;
			}
		}
		System.out.println("Count of vowels:"+vCnt);
		System.out.println("Count of consonants:"+cCnt);

	}
}

