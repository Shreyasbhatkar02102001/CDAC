#include <cstdio>
namespace na 
{
    int num1 = 100;
}
namespace na 
{
    int num2 = 150;
}

int num1 = 200;

int main()
{

    int num1 =30;
    printf("num1 = %d\n", na::num1);    // 100
    printf("num1 = %d\n", na::num2);    // 150
    printf("num1 = %d\n", num1);        // 30
    printf("num1 = %d\n", ::num1);      // 200

    return 0;
}