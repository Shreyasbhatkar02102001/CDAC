#include <iostream>
using namespace std;

class Friut
{

};


class Student
{

};

class Person
{

};

class Employee
{

};


class Address
{

};


class Test	//Abstract Class
{
public:
	virtual void AddRecord()
	{
		//TODO
	}

	virtual void PrintRecord()=0;		//Pure Virtual Function, Abstract Function
};



int main()
{

	Test *t1;		//OK
	//Test t2;		//NOT OK, class test have one pure virtual function so it is abstract class which can't have its objects
	return 0;
}
