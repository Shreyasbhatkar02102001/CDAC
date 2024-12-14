// Q1. Create a class called Student with the following private data members: 
// 1. name (string): to store the name of the student. 
// 2. rollNumber (int): to store the roll number of the student. 
// 3. marks (float): to store the marks obtained by the student. 
// 4. grade (char): to store the grade calculated based on the marks. 
// Implement getter and setter member functions for each data member 
// Create a member function calculateGrade() that calculates the grade based on the following 
// grading scale: 
// A: 90-100 
// B: 80-89 
// C: 70-79 
// D: 60-69 
// F: Below 60 
// Implement a menu-driven program in the main() function with the following options: 
// 1. Accept Information 
// 2. Display information 
// 3. Calculate Grade 
// 4. Exit the program.



#include <iostream>
#include <string>
using namespace std;

class Student{

    private :
    string name;
    int rollNumber;
    float marks;
    char grade;


    public :

    void setName(string name){
        this->name = name;
    }

    string getName(){
        return this->name;
    }

    void setRollNumber(int rollNumber){
        this->rollNumber = rollNumber;
    }

    int getRollNumber(){
        return this->rollNumber;
    }

    void setMark(float marks){
        this->marks = marks;
    }

    float getMark(){
        return this->marks;
    }

    void setGrade(char grade){
        this->grade = grade;
    }

    char getGrade(){
        return this->grade;
    }

    void calculateGrade(){
        if (marks >= 90 && marks < 100){
            grade = 'A';
        }
        else if (marks >= 80 && marks < 90){
            grade = 'B';
        }
        else if (marks >= 70 && marks < 80){
            grade = 'C';
        }
        else if (marks >= 60 && marks < 70){
            grade = 'D';
        }
        else {
            grade = 'E';
        }

    }

    void display(){
        cout << "Name: " << name << endl;
        cout << "Rollno: " << rollNumber << endl;
        cout << "Marks: " << marks << endl;
        cout << "Grade: " << grade << endl;
    }
};


int main(){

    Student s1;
    int choice;
    string name;
    int rollNo;
    float marks;

    do {

        cout << "\nMenus " << endl;
        cout << "\nAccept Information " << endl;
        cout << "\nCalculate Grade " << endl;
        cout << "\nDisplay " << endl;
        cout << "\nExit Program " << endl;
        cout << "\nEnter choice " << endl;
        cin >> choice;

        switch (choice) 
        {
            case 1:

                cin.ignore();
                cout << "Enter Student name : " ;
                getline(cin, name);
                s1.setName(name);

                cout << "Enter roll no : " ;
                cin >> rollNo;
                s1.setRollNumber(rollNo);

                cout << "Enter marks : ";
                cin >> marks;
                s1.setMark(marks);
                break;

            case 2:

                s1.calculateGrade();
                break;

            case 3:

                s1.display();
                break;

            case 4:
                cout << "exiting program ..." << endl;
                break;
            
            default:
                cout << "Invalid input !!!!!!! " << endl;
                break;
        }

    }while (choice != 4);

    

    return 0;

}