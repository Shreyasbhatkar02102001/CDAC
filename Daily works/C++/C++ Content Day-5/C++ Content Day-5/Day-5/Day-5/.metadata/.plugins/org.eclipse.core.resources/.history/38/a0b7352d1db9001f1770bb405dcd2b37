#include <iostream>
#include <string.h>
using namespace std;
class Student
{
private:			//Data Hiding
	int RollNo;		//Data Member
	string Name;

public:


	Student()
	{
		this->Name="No Name";
		this->RollNo=1234;
	}
	Student(int RollNo, string Name)
	{
		this->Name=Name;
		this->RollNo=RollNo;
	}
	void AddRecord(/*Student *const this*/)
	{
		cout<<"Enter Roll No:	"<<endl;
		cin>>this->RollNo;
		cout<<"Enter Name:	"<<endl;
		cin>>this->Name;
	}
	void PrintRecord(/*Student *const this*/)
	{
		cout<<"Roll No:	"<<this->RollNo<<" Name:	"<<this->Name<<endl;
	}

	string getName(/*Student *const this*/){
		return this->Name;
	}

	void setName(/*Student *const this*/string Name) {
		this->Name = Name;
	}

	int getRollNo(/*Student *const this*/) {
		return this->RollNo;
	}

	void setRollNo(/*Student *const this*/int RollNo) {
		this->RollNo = RollNo;
	}
};
int main()
{
	Student s1;		//It will call Default constructor to initialize s1 object data member

	Student s2(100, "Malkeet");		//Here parameterized cons will be called to initialize s2 object data member

	Student s3=s2;	//Copy Constructor, it is used to initialize / Assign one object data member with other object data member

	s2=s1;			//Copy Constructor, Assignment
	s1.PrintRecord();
	s2.PrintRecord();
	s3.PrintRecord();

	return 0;
}
