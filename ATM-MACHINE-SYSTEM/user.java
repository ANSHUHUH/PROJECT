package ATMsystem;
import java.util.Scanner;

public class user {
	private String username="anshuhuh";
	private int pin = 2776;
	private double balance = 4000;
	 
	//public void verifyusername(String enteredusername, int pin) {
	//	if(enteredusername.equals(username)) {
		//	verifypin(pin);
	//	}else {
		//	System.out.println("incorrect username!!!");
		//}
	//}
	public boolean verifypin(int enteredpin) {
		return enteredpin == pin;
	}
	public void checkbalance() {
		System.out.println("BALANCE IS  :- "+ balance);
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("your amount: "+amount+" is deposit sucessful!!!");
		}else {
			System.out.println("invalid amount!!!");
		}
	}
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("insufficient balance!!!");
		}else if(amount <= 0) {
			System.out.println("invalid amount!!!");
		}else {
			balance -= amount;
			System.out.println("please collect your cash!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         user u1 = new user();
         System.out.println("===========welcome to ATM=============");
         int attempts = 3;
        	 while(attempts > 0){
        		 System.out.println("enter your pin : ");
        	 
          int enteredpin = sc.nextInt();
         if( u1.verifypin(enteredpin)) {
        	 int choice;
        	 do{
        		 System.out.println("\n1-check balance.");
        		 System.out.println("2-deposit.");
        		 System.out.println("3-withdraw.");
        		 System.out.println("4-exit.");
        		 System.out.println("choose option (1,2,3,4): ");
        		 choice = sc.nextInt();
        		 
        		 switch(choice) {
        		 case 1:{
        			 u1.checkbalance();
        			 break;
        		 }
        		 case 2:{
        			 System.out.println("enter amount : ");
        			 double amount = sc.nextDouble();
        			  u1.deposit(amount);
        			  break;
        		 }
        		 case 3:{
        			 System.out.println("enter amount : ");
        			  double amount = sc.nextDouble();
        			  u1.withdraw(amount);
        			  break;
        		 }
        		 case 4:{
        			  System.out.println("thanks for using ATM!!!"); 
        			  break;
        		 }
        		 default:{
        			 System.out.println("invalid choice!!!");
        		 }
        		 }
        		 
        	 }while(choice != 4);
         }else {
        	 attempts--;
        	 System.out.println("incorrect pin!!! only "+ attempts +" attempts remain ");
         }
	}
       System.out.println("===card  blocked !!! too many incorrect pins!!!===");
         sc.close();
	}

}
