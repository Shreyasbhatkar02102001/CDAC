#include <cstdio>


int main()
{   
    // here extern will look for num1 which is declared globally and externally defined
    extern int num1;                  
    printf("Global num1 :    %d\n", ::num1);     //  100
    num1 = 200;
    printf("Global num1 : %d\n", ::num1);     // 200

    return 0;
}
int num1 = 100;

int main1()
{
    int num1 = 90;
    printf("num1 = %d\n", num1);     //90
    printf("Global num1 :    %d\n", ::num1);     //  100
    :: num1 = 200;
    printf("Global num1 : %d\n", ::num1);     // 200

    return 0;
}