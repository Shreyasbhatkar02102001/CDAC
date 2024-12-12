#include <cstdio>

int main()
{   

    int num1 = 100;     // auto             
    printf("Global num1 :    %d\n", num1);          //  100 
    return 0;
}


// int main1()
// {   
    
//     // extern static int num1; //  not ok                 
//     printf("Global num1 :    %d\n", ::num1);     
//     num1 = 200;
//     printf("Global num1 : %d\n", ::num1);     

//     return 0;
// }
// static int num1 = 100;

