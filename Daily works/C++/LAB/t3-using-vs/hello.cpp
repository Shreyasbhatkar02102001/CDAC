#include <cstdio>
using namespace std;

int main()
{
    int Num1 = 100;   //  non-constant method local variable
    int *ptrNum = &Num1;  // ptrNum is non-constant local pointer variable

    *ptrNum = 200;

    printf("Value of Num1 = %d\n", Num1);   // 200
    printf("Value of Num2 = %d\n", *ptrNum);   // 200

    const int *ptrNum2 = &Num1; // Num1 is read-only  variable
    // *ptrNum2 = 400; // not ok


    printf("Value of Num1 = %d\n", Num1);   // 200
    printf("Value of Num2 = %d\n", *ptrNum2);   // 200

    return 0;
}