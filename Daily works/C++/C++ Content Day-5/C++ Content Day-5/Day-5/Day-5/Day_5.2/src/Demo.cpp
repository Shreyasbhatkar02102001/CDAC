#include <iostream>
using namespace std;
/*
int Add(int Num1, int Num2)
{
	return Num1+ Num2;
}
int Add(int Num1, int Num2, int Num3)
{
	return Num1+ Num2+ Num3;
}
int Add(int Num1, int Num2, int Num3, int Num4)
{
	return Num1+Num2+Num3+Num4;
}
int Add(int Num1, int Num2, int Num3, int Num4, int Num5)
{
	return Num1+Num2+Num3+Num4+Num5;
}
*/
const int Default=100;	//Const int

int Add(int Num1, int Num2, int Num3=Default, int Num4=Default, int Num5=0, int Num6=0)
{
	return Num1+Num2+Num3+Num4+Num5+Num6;
}
int main()
{
	cout<<"Sum of Two Ints:		"<<Add(10,20)<<endl;
	cout<<"Sum of Three Ints:	"<<Add(10, 20, 30)<<endl;
	cout<<"Sum of Four Ints:	"<<Add(10, 20, 30,40)<<endl;
	cout<<"Sum of Five Ints:	"<<Add(10, 20, 30,40,50)<<endl;
	cout<<"Sum of Six Ints:		"<<Add(10, 20, 30,40,50,60)<<endl;
	return 0;
}
