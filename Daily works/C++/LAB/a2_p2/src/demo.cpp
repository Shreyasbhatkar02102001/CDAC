/*
 * demo.cpp
 *
 *  Created on: 13-Dec-2024
 *      Author: shrey
 */

#include <iostream>
#include <string>
using namespace std;


/*int Add(int Num1, int Num2)
{
	return Num1+ Num2;
}
float Add(float Num1, float Num2)
{
	return Num1+ Num2;
}
	int Add(int Num1, int Num2, int Num3)
{
	return Num1+Num2+Num3;
}*/

class BlankAccount{

private :
	int accountNumber;
	string accountHolderName;
	double balance;

public :
	string getAccountHolderName() {
		return accountHolderName;
	}

	void setAccountHolderName( string &accountHolderName) {
		this->accountHolderName = accountHolderName;
	}

	int getAccountNumber()  {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this->accountNumber = accountNumber;
	}

	double getBalance()  {
		return balance;
	}

	void setBalance(double balance) {
		this->balance = balance;
	}

	void deposit(double amount){
		this->balance = this->balance + amount;
	}

	void withdraw(double amount) {
		this->balance = this->balance - amount;
	}


	void displayAccountDetails(){
		cout << "Account Name  : " <<  accountHolderName << endl;
		cout << "Account Number : " << accountNumber << endl;
		cout << "Account Balance : " << balance << endl;
	}


};

int main()
{
	BlankAccount ba;
	int id;
	string name;
	double balance;
	int choice;

	do {

		cout << "\n++  Menus  ++" ;
		cout << "\n1. Accept Information ";
		cout << "\n2. Desposit " ;
		cout << "\n3. Withdraw " ;
		cout << "\n4. Display " ;
		cout << "\n5. Exit Program " ;
		cout << "\nEnter choice  :  " ;
		cin >> choice;


		switch (choice)
		        {
		            case 1:

		                cin.ignore();
		                cout << "Enter  name : " ;
		                getline(cin, name);
		                ba.setAccountHolderName(name);

		                cout << "Enter account id : " ;
		                cin >> id;
		                ba.setAccountNumber(id);

		                cout << "Enter balance : ";
		                cin >> balance;
		                ba.setBalance(balance);
		                break;

		            case 2:

		            	cout << "Enter amount to desposit : ";
		            	double amount ;
		            	cin >> amount;
		                ba.deposit(amount);
		                break;

		            case 3:

		            	cout << "Enter amount to withdraw : ";
		            	double amt ;
		            	cin >> amt;
						ba.withdraw(amt);
						break;

		            case 4:
		            	ba.displayAccountDetails();
		            	break;

		            case 5:
		                cout << "exiting program ..." << endl;
		                break;

		            default:
		                cout << "Invalid input !!!!!!! " << endl;
		                break;
		        }

		    }while (choice != 5);








	return 0;
}




