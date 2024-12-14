/*
 * p4.cpp
 *
 *  Created on: 14-Dec-2024
 *      Author: shrey
 */

#include <iostream>
#include <string>
using namespace std;

class Employee{

private :
	int empID = 0;
	string empName;
	double empSalary;
	double empGrossSalary;

public :

	int getEmpID(){
		return this->empID;
	}

	/*void setEmpID(int id){
		this->empID = id;
	}*/

	void setEmpID(){
		this->empID++;
	}

	string getEmpName(){
		return this->empName;
	}

	void setEmpName(string name){
		this->empName = name;
	}

	double getEmpSalary(){
		return this->empSalary;
	}

	void setEmpSalary(double salary){
		this->empSalary = salary;
	}

	void calculateGrossSalary(){
		if (this->empSalary <= 5000){
			empGrossSalary = this->empSalary + this->empSalary * (0.10);
			cout << empGrossSalary << endl;
		}
		else if (this->empSalary > 5000 && this->empSalary <= 10000){
			empGrossSalary = this->empSalary + this->empSalary * (0.15);
			cout << empGrossSalary << endl;
		}
		else {
			empGrossSalary = this->empSalary + this->empSalary *  (0.20);
			cout << empGrossSalary << endl;
		}
	}

	void displayEmployeeDetails(){
		cout << "EmpID : " << empID << endl;
		cout << "EmpName : " <<empName << endl;
		cout << "EmpSalary  : " <<empSalary << endl;
		cout << "EmpGrossSalry : " <<empGrossSalary << endl;
	}


};

int main(){

	Employee emp;
	string name;
	double salary;
	int choice;

	do {
		cout << "++  Main   ++" ;
		cout << "\n1. Add new Employee " ;
		cout << "\n2. Calculate Gross Salary " ;
		cout << "\n3. Display Employee Details " ;
		cout << "\n4. Update Employee Details " ;
		cout << "\n Enter Choice : "  ;
		cin >> choice ;

		switch(choice){

		case 1:

			emp.setEmpID();

			cout << "\nEnter Employee Name : " ;
			cin >> name;
			emp.setEmpName(name);

			cout << "\nEnter Employee Salary : " ;
			cin >> salary;
			emp.setEmpSalary(salary);
			break;

		case 2:
			emp.calculateGrossSalary();
			break;

		case 3:
			emp.displayEmployeeDetails();
			break;

		case 4:

			cout << "\nUpdate Employee Details : " ;
			cout << "\n Enter Updated Name " ;
			cin >> name;
			emp.setEmpName(name);

			cin.ignore();
			cout << "\nEnter Updated Salary " ;
			cin >> salary;
			emp.setEmpSalary(salary);

			emp.calculateGrossSalary();
			break;

		case 5:
			cout << "\nExit Program ......" ;
			break;

		default:
			cout << "\nInvalid Input !!!!" ;
			break;


		}

	}while(choice != 5);

	return 0;
}


