#include <iostream>
using namespace std;
class Test
{
public:
	int Num1;	//non-constant data member
	int Num2;
	mutable int Num3;
	Test():Num1(100),Num2(200),Num3(300)
	{
		this->Num1=0;
		this->Num2=0;
	}

	Test(int Num1, int Num2):Num1(Num1),Num2(Num2),Num3(Num3)
	{

	}

	void NotChangeData()const
	{
		//this->Num1=30;		//NOT OK
		//this->Num2=40;		//NOT OK
		this->Num3=50;			//OK, Num3 is declared as mutable
	}

	void PrintData()
	{
		cout<<" Num1:	"<<this->Num1<<endl;
		cout<<" Num2:	"<<this->Num2<<endl;
		cout<<" Num3:	"<<this->Num3<<endl;
	}
};

int main()
{
	Test t1;
	t1.NotChangeData();
	t1.PrintData();

	return 0;
}
