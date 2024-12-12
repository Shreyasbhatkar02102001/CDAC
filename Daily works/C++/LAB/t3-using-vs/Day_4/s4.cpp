#include <cstdio>

static int num1 = 200;  //// file scope
int num3 = 300;     /// program scope

int main()
{

    int num2 = 100;  // functions scope

    for (int i = 0; i < num2; i++){ //// Block scope

    }

    return 0;
}