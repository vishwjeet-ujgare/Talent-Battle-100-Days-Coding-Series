#include<stdio.h>
int main()
{
    int num;
    printf("Enter Integer Number : ");
    scanf("%d",&num);

    if(num%2==0)
    {
        printf("%d",num," is a Even Number.");
    }
    else
    {
        printf("%d ",num," is a Odd Number.");
    }
   
}