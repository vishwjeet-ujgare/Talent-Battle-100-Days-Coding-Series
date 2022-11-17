#include<iostream>

int main()
{
    char ch;
    std::cout<<"Enter a character : ";
    std::cin>>ch;

    if((ch>='a' &&ch<='z') ||(ch>='A' &&ch<='Z'))
    {
        std::cout<<ch<<" is an alphabet";
    }
    else   
    {
        std::cout<<ch<<" is not an alphabet";
    }
    return 0;
}