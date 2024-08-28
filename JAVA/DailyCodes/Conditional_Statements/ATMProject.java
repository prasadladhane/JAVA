import java.util.*;
class Demo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		while(true){

		System.out.println("----Enter the ATM card-----");
		System.out.println("-----Choose Operation-----");
		System.out.println("-----1: Withdrwal-----");
	        System.out.println("-----2: Deposit-----");
		System.out.println("-----3: Check Balance-----");
		System.out.println("-----4: Pin Change-----");
		int userPin=1234;
		long mobNo1=9322379197l;
		int totalAmount=1000;
		int op=sc.nextInt();

		switch(op){
			case 1:
				System.out.println("Enter Pin:");
				int pin=sc.nextInt();

				if(userPin==pin){
					System.out.println("Enter amount to be withdrawn:");
					int userAmount=sc.nextInt();
					int sub=totalAmount-userAmount;
					if(userAmount<=totalAmount){
						System.out.println(userAmount+"withdrawn successfully");
						System.out.println("availble balance is:"+sub);
					}else{
						System.out.println("Insufficient balace!!");
					}
				}else{
					System.out.println("Wrong Pin!! Enter Correct one");
				}
				break;

			case 2:
                                System.out.println("Enter Pin:");
                                pin=sc.nextInt();

                                if(userPin==pin){
                                        System.out.println("Enter amount to be Deposit:");
                                        int depAmount=sc.nextInt();
					int add=totalAmount+depAmount;
                                        if(depAmount<=totalAmount || depAmount>=totalAmount){
                                                System.out.println(depAmount+" deposited successfully");
                                                System.out.println("availble balance is:"+add);
                                        }
				}else{
						System.out.println("Wrong Pin!!Enter Correct Pin");
				}
				break;
			case 3:
				 System.out.println("Enter Pin to check balance:");
                                pin=sc.nextInt();

                                if(userPin==pin){
                                        System.out.println("your total balance is:"+ totalAmount);
                                }else{
                                                System.out.println("Wrong Pin!!Enter Correct Pin");
                                }
                                break;
			case 4:
				System.out.println("Enter Current Pin:");                                                                                                               pin=sc.nextInt();
				System.out.println("Enter Your Registered  Mobile Number:");
					long mobNo2=sc.nextLong();
                                if(userPin==pin && mobNo1==mobNo2){
                                        System.out.println("Enter new Pin:");
                                        int newPin=sc.nextInt();
                                        userPin=newPin;
                                        System.out.println("Your pin changed successfully");
                                }else{
                                                System.out.println("Wrong Pin Or Wrong Mobile Number!!Enter Correct");
                                }
                                break;
			default: 
				System.out.println("Wrong Choice!! Enter Correct choice");
		}
	}
}
}
