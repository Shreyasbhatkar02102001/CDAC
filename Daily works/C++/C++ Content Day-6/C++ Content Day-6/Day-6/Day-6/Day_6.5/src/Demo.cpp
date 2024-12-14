#include <iostream>
using namespace std;

void ChangeData(int num1, int num2)
{
	num1=100;
	num2=200;
}

void ChangeData1(int *num1, int *num2)
{
	*num1=100;
	*num2=200;
}

void ChangeData2(int &num1, int &num2)	//Here num1 and num2 are the references
{
	num1=100;
	num2=200;
}
int main()
{
	int X=1;
	int Y=2;
	cout<<"Before Passing to the ChangeData"<<endl;
	cout<<"X:	"<<X<<endl;
	cout<<"Y:	"<<Y<<endl;

	//ChangeData(X, Y);	//Call By Value

	//ChangeData1(&X, &Y);	//Call By Address

	//ChangeData2(X, Y);	//call By Reference

	cout<<"After Passing to the ChangeData"<<endl;
	cout<<"X:	"<<X<<endl;
	cout<<"Y:	"<<Y<<endl;
	return 0;
}
