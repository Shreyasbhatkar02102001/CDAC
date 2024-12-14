#include <iostream>
#include <string.h>
using namespace std;
class Student
{
public:
	int RollNo;
	string Name;

	/*Student *const this*/
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
};
int main()
{
	Student s1;			//Object of Student Class

	s1.AddRecord();		//s1.AddRecord(&s1);
	s1.PrintRecord();
	return 0;
}
