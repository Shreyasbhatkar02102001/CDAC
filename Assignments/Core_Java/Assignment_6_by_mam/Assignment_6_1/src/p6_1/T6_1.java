package p6_1;

import java.util.Scanner;

import javax.swing.event.MenuListener;
/*1)	Create a base class BankAccount with methods like deposit() and withdraw(). 
 *		 Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount. 
 * 		Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details.
 * 
 */
class BankAccount {
	    private int balance;
		private int limit;
	    static Scanner sc = new Scanner(System.in);
	    
	    public BankAccount() {
	        this(0);
	    }
	    
	    BankAccount(int n) {
	        this.balance = n;
	    }
	    
	    public void setLimit(int limit) {
	        this.limit = limit;
	    }
	    
	    public int getLimit() {
	        return this.limit;
	    }
	    
	    public void deposit(int b) {
	        this.balance += b;
	    }
	    
	    public void withdraw(int n) {
	        if (n <= balance) {
	            this.balance -= n;
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		@Override
	    public String toString() {
	        return "BankAccount [balance=" + balance + "]";
	    }
	    
	    void acceptDeposit() {
	        System.out.print("Enter Deposit amount: ");
	        int amount = sc.nextInt();
	        deposit(amount);
	    }
	
}

class SavingsAccount  extends BankAccount{
	
	@Override
    public void withdraw(int n) {
        if (n <= getLimit() && n <= getBalance()) {
            super.withdraw(n);
        } else {
            System.out.println("Unable to withdraw due to exceeded withdrawal limit or insufficient funds.");
        }
    }
    
    void setLimit() {
        System.out.print("Enter the limit for withdrawal: ");
        setLimit(sc.nextInt());
    }

	
}


public class T6_1 {
	
	BankAccount b1 = new SavingsAccount(); // upcasting
	SavingsAccount s1 = (SavingsAccount) b1;          //   downcastinh
	
	

	void menuList() {
		System.out.println("\n0. Exit");
		System.out.println("1. Deposit");
		System.out.println("2. Limit");
		System.out.println("3. Withdraw");
		
		
		System.out.println("Enter choice : ");
		int choice = BankAccount.sc.nextInt();
		
		do {
			switch(choice) {
			
			case 1:	
				((SavingsAccount) b1).acceptDeposit();
				break;
				
			case 2:
				s1.setLimit();
				break;
				
			case 3:
				System.out.print("amount : ");
				int n = BankAccount.sc.nextInt();
				s1.withdraw(n);
				break;
				
			default:
				System.out.println("Invalid input");
				break;
			}
		}while( choice != 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T6_1 t1 =  new T6_1();
		t1.menuList();

	}

}
