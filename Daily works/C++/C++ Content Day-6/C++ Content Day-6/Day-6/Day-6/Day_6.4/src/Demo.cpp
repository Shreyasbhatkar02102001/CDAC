#include <iostream>
using namespace std;

int main()
{
	int Num1=100;

	int &Num2=Num1;		//Num2 is reference variable

	int &Num3=Num1;

	int &Num4=Num3;
	cout<<"Num1:	"<<Num1<<endl;
	cout<<"Num2:	"<<Num2<<endl;
	cout<<"Num3:	"<<Num3<<endl;
	cout<<"Num4:	"<<Num4<<endl;
	cout<<"------------------------"<<endl;
	Num2=200;
	cout<<"Num1:	"<<Num1<<endl;
	cout<<"Num2:	"<<Num2<<endl;
	cout<<"Num3:	"<<Num3<<endl;
	cout<<"Num4:	"<<Num4<<endl;
	return 0;
}

int main1()
{
	typedef int Malkeet;
	Malkeet Num1=100;
	cout<<"Num1:	"<<Num1;


	return 0;
}
