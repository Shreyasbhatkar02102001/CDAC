#include <cstdio>

class Student
{
 public :
    int Rollno;
    char Name[30];
    
    void GetData()
    {
        printf("Enter Rollno : ");
        fflush(stdout);
        scanf("%d", &Rollno);
        printf("Enter Name : ");
        fflush(stdout);
        scanf("%s", Name);
    }

    void ShowDate()
    {
        printf("Rollno : %d\n", Rollno);
        printf("Name: %s\n", Name);
    }

};

int main()
{
    Student s1;                // Object of class Student
    s1.GetData();               // Message passing
    s1.ShowDate(); 

    return 0;
}