#include <cstdio>

namespace na 
{
    int num1 = 100;
}
namespace nb 
{
    int num1 = 150;
}

int num1 = 200;

int main()
{
    int num1 =30;
    printf("num1 = %d\n", na::num1);    // 100
    printf("num1 = %d\n", nb::num1);    // 150
    printf("num1 = %d\n", num1);        // 30
    printf("num1 = %d\n", ::num1);      // 200
}