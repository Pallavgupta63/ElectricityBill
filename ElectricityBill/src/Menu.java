import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Welcome to BSES");
		System.out.println("Are you?");
		System.out.println("1. Admin");
		System.out.println("2. Customer");
		int n = s.nextInt(); 
		int flag=0;
//  -----------------------------------ADMIN STUB--------------------------------------------
		if(n==1) {
			
			System.out.println("Enter your passcode");
			int pass=s.nextInt();
			
			if(pass!=1234) {
				System.out.println("Passcode incorrect");
				flag=1;
				while(flag==1) {
					System.out.println("Enter passcode again");
					pass=s.nextInt();
					if(pass==1234) {
						flag=0;
					}
				}
			}
			Customer c= new Customer();
			System.out.println("Add a customer");
			System.out.println("Enter customer id:");
			c.c_id=s.nextInt();
			System.out.println("Enter customer name:");
			c.c_name=s.next();
			System.out.println("Creating a new connection....");
			c.conn();
			System.out.println("Enter bill amount:");
			c.bill_curr=s.nextInt();
		}
// ---------------------------------------CUSTOMER STUB---------------------------------------
		
		if(n==2) {
			System.out.println("Enter your Customer ID");
			int id=s.nextInt();
			System.out.println("Hello "+id);
			System.out.println("1. Create a wallet");
			System.out.println("2. View current month bill");
			System.out.println("3. Pay current month bill");
			System.out.println("4. View bill for last 6 months");
			System.out.println("5. Request a new connection");
			System.out.println("6. Status of new conenction");
			System.out.println("7. Exit");
			System.out.println("Make a choice");
			int choice=s.nextInt();
			Customer c= new Customer();
			switch(choice) {
				case 1: c.wallet_create();
					break;
				case 2: c.bill_current();
					break;
				case 3: c.bill_pay();
					break;
				case 4: c.last_six_months();
					break;
				case 5: c.conn();
					break;
				case 6: c.status();
					break;
				case 7:
					break;
			}
			
		}
		
	}

}
