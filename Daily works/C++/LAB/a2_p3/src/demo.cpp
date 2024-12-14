/*
 * demo.cpp
 *
 *  Created on: 13-Dec-2024
 *      Author: shrey
 */

#include <iostream>
#include <string>
using namespace std;


class TollBooth{

private :
	int totalVehicles;
	double totalRevenue;

public :

	TollBooth() : totalVehicles(0) , totalRevenue(0.0) {}

	void reset(){
		totalVehicles = 0;
		totalRevenue = 0.0;
	}

	void vehiclePayingToll(int vehicleType, double tollAmount){
		totalVehicles++;
		totalRevenue += tollAmount;
	}


	double getTotalRevenue() const {
		return totalRevenue;
	}

	int getTotalVehicles() const {
		return totalVehicles;
	}



	void displayTotalCarsPassed(){
		cout << "Total cars passed  : " <<  totalVehicles << endl;
	}

	void displayTotalRevenue(){
		cout << "Total Revenue collected : " << totalRevenue << endl;
	}


};

int main()
{
	TollBooth tb;
	int vehicleType;
	double tollAmount;
	int choice;

	do {

		cout << "\n++  Menus  ++" ;
		cout << "\n1. Add a standard car and collect toll ";
		cout << "\n2. Add a truck and collect toll " ;
		cout << "\n3. Add a bus and collect toll " ;
		cout << "\n4. Display total cars passed  " ;
		cout << "\n5. Display total revenue collected " ;
		cout << "\n6.  Reset booth statistics  " ;
		cout << "\nEnter choice  :  " ;
		cin >> choice;


		switch (choice)
		        {
		            case 1:

		                vehicleType = 1;
		                cout << "Enter toll amount : ";
		                cin >> tollAmount;
		                tb.vehiclePayingToll(vehicleType, tollAmount);
		                break;

		            case 2:

		            	vehicleType = 2;
		            	cout << "Enter toll amount : ";
		            	cin >> tollAmount;
		            	tb.vehiclePayingToll(vehicleType, tollAmount);
		            	break;

		            case 3:

		            	vehicleType = 1;
		            	cout << "Enter toll amount : ";
		            	cin >> tollAmount;
		            	tb.vehiclePayingToll(vehicleType, tollAmount);
		            	break;

		            case 4:
		            	tb.displayTotalCarsPassed();
		            	break;

		            case 5:
		                tb.displayTotalRevenue();
		                break;

		            case 6:
		            	tb.reset();
		            	break;

		            case 7:
		            	cout << "exiting program ..." << endl;
		            	break;

		            default:
		                cout << "Invalid input !!!!!!! " << endl;
		                break;
		        }

		    }while (choice != 7);








	return 0;
}




