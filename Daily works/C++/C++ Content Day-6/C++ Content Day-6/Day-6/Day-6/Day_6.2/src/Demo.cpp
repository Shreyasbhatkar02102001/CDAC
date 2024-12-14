#include <iostream>
using namespace std;
class Test
{
public:
	int Num1;	//non-constant data member
	int Num2;
	Test():Num1(100),Num2(200)
	{
		this->Num1=0;
		this->Num2=0;
	}

	Test(int Num1, int Num2):Num1(Num1),Num2(Num2)
	{

	}

	/* const Test *const this*/
	void SetData(/* Test *const this*/) const	//Constant Member Function
	{

		cout<<"Hello C++"<<endl;

	}

	void AddObject(Test &t3)const
	{
		Test T4;
		t3.Num1=90;
		t3.Num2=100;

		//this->Num1=90;		//NOT OK
		//this->Num2=890;		//NOT OK

	}

	void PrintData()
	{
		cout<<" Num1:	"<<this->Num1<<endl;
		cout<<" Num2:	"<<this->Num2<<endl;
	}
};

int main()
{
	const Test t1;		//t1 Constant Object of class Test

	//t1.Num1=100;		//NOT OK
	//t1.Num2=200;		//NOT OK


	//t1.PrintData();	//NOT OK

	t1.SetData();
	return 0;
}


int main1()
{
	Test t1;	//Non-Paramterized cons will be called

	Test t2(1000,2000);
	//t1.SetData();	//t1.SetData(&t1)

	t1.AddObject(t2);

	t2.PrintData();

	t1.PrintData();


}
