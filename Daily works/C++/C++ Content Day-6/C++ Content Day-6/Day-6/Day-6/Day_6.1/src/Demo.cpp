#include <iostream>
using namespace std;
class Test
{
public:
	int Num1;	//non-constant data member

	const int Num2;
	Test():Num1(100),Num2(200)
	{
		this->Num1=0;
		//this->Num2=0;		//NOT OK
	}

	Test(int Num1, int Num2):Num1(Num1),Num2(Num2)
	{
		//this->Num1=Num1;
	}


	void PrintData()
	{
		cout<<" Num1:	"<<this->Num1<<endl;
		cout<<" Num2:	"<<this->Num2<<endl;
	}
};

int main()
{
	Test t1;	//Non-Paramterized cons will be called
	t1.PrintData();

	Test t2(20,30);

	t2.PrintData();
}
int main1()
{
	int Num1;	//Declaration + Definition
	Num1=90;
	Num1=890;

	const int Num2=200;
	//Num2=100;
}
