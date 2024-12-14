#include <iostream>
using namespace std;

int Add(int Num1, int Num2)
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
}

int main()
{
	cout<<"Sum of Two Ints:	"<<Add(10,20)<<endl;
	cout<<"Sum of Two floats:	"<<Add(10.89f,20.90f)<<endl;
	cout<<"Sum of Three Ints:	"<<Add(10, 20, 30)<<endl;
	return 0;
}
