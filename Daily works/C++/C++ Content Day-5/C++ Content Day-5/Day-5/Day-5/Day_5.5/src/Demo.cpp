#include <iostream>
#include <string.h>
using namespace std;
class Student
{
private:			//Data Hiding
	int RollNo;		//Data Member
	string Name;

	/*Student *const this*/

public:

	void AddRecord()
	{
		cout<<"Enter Roll No:	"<<endl;
		cin>>this->RollNo;
		cout<<"Enter Name:	"<<endl;
		cin>>this->Name;
	}
	void PrintRecord()
	{
		cout<<"Roll No:	"<<this->RollNo<<" Name:	"<<this->Name<<endl;
	}

	string getName(){
		return Name;
	}

	void setName(string Name) {
		this->Name = Name;
	}

	int getRollNo() {
		return RollNo;
	}

	void setRollNo(int RollNo) {
		this->RollNo = RollNo;
	}
};
int main()
{
	Student s1;
	s1.setRollNo(101);		//s1 calling the Setter Method to Set/Write the value of RollNo Data Member
	s1.setName("Malkeet");

	cout<<"Name:"<<s1.getName()<<endl;
	cout<<"Roll No:"<<s1.getRollNo()<<endl;

	return 0;
}
