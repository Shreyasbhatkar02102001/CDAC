/*
 * vector
 *
 *  Created on: 16-Dec-2024
 *      Author: shrey
 */
//#include <stdio.h>
#include <iostream>
#include <string>
#include <vector>
using namespace std;


class Person {

private:

	string name;
	int age;
	string address;

public:

	void setName(string name){
		this->name = name;
	}

	void setAge(int age){
		this->age = age;
	}

	void setAddress(string address){
		this->address = address;
	}

	string getName(){
		return this->name;
	}

	int getAge(){
		return this->age;
	}

	string getAddress(){
		return this->address;
	}

};


class Employee : public Person {

private:

	int empid;
	string designation;
	double salary;

public :

	Employee(string name, int age, string address, int empid, string designation, double salary){
		setName(name);
		setAge(age);
		setAddress(address);
		this->empid = empid;
		this->designation = designation;
		this->salary = salary;
	}

	void setEmpid(int empid){
		this->empid = empid;
	}

	void setDesignation(string designation){
		this->designation = designation;
	}

	void setSalary(double salary){
		this->salary = salary;
	}

	int getEmpid(){
		return this->empid;
	}

	string getDesignation(){
		return this->designation;
	}

	double getSalary(){
		return this->salary;
	}


};


class Admin {

private :


	vector <Employee> list;
	string name;
	int age;
	string address;
	int empid;
	string designation;
	double salary;

public:

	void addEmp(){

		cout << "Enter name : " <<  endl ;
		cin >> name;

		cout << "Enter age : " << endl ;
		cin >> age;

		cout  << "Enter address " << endl;
		cin >> address;

		cout << "Enter empid : " << endl;
		cin >> empid;

		cout  << "Enter designation : " << endl;
		cin >> designation;

		cout  << "Enter salary : "  << endl;
		cin  >> salary;

		Employee emp(name, age, address, empid, designation, salary);

		list.push_back(emp);

	}


	void getEmp() {

		for (Employee e: list){

			cout << "\n--------------------------------------" << endl;
			cout << e.getName() << endl;
			cout << e.getAge() << endl;
			cout << e.getAddress() << endl;
			cout << e.getEmpid() << endl;
			cout << e.getDesignation() << endl;
			cout << e.getSalary() << endl;
			cout << "--------------------------------------" << endl;
		}

	}


	void updateEmp(){

		int id;
		bool flag = false;

		cout << "\nEnter id to update : " << endl;
		cin >> id;

		for (Employee &e: list) {
			if (id == e.getEmpid()) {
				flag = true;

				cout << "Enter updated desgination : " << endl;
				cin >> designation;
				e.setDesignation(designation);

				cout << "Enter updated salary : " << endl;
				cin >> salary;
				e.setSalary(salary);

				cout << "Enter updated Address : " << endl;
				cin >> address;
				e.setAddress(address);

				cout << "Record has been updated Successfully : " << endl;
			}
		}

		if (flag != true){
			cout << "Record has not been updated " << endl;
		}
	}



	void deleteEmp() {

		int id;
		int i = 0;
		bool flag = false;

		cout << "\nEnter id to delete : " << endl ;
		cin >> id;

		for (Employee &e: list){
			if (id == e.getEmpid()){
				flag = true;
				list.erase(list.begin() + i);
				cout << "Record is deleted " <<endl;
			}

			i++;
		}

		if (flag != true) {
			cout << "Cannot found record " << endl;
		}
	}



};

int main(){

	Admin admin;
	int choice;


	do {

		cout << "*****Main*****" << endl;
		cout << "1. Add Employee" << endl;
		cout << "2. GetAll Employees" << endl;
		cout << "3. Update an Employee" << endl;
		cout << "4. Delete an Employee" << endl;
		cout << "5. Exit Program" << endl;
		cout << "Enter choice : " << endl;
		cin >> choice;

		switch(choice) {

		case 1:
			admin.addEmp();
			break;

		case 2:
			admin.getEmp();
			break;

		case 3:
			admin.updateEmp();
			break;

		case 4:
			admin.deleteEmp();
			break;

		case 5:
			cout << "Exiting Program  ,,,,,," << endl;
			break;

		default :
			cout << "Invalid choice !!!!!" << endl;
			break;

		}
	}while(choice != 5);


	return 0;
}
































