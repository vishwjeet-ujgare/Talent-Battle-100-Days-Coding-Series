#include<iostream>
using namespace std;

int main() {
    char  c;

    cout << "Enter an alphabet: ";
    cin >> c;
cout<<c;    
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
    {
         cout << c << " is a vowel.";
    }
    else if(isalpha(c))//isaplha method is to check wheter value is alphabet or not 
    {
         cout << c << " is a consonant.";
    }
    else
    {
    cout << c << " is not a valid input.";
    }
    return 0;
}
