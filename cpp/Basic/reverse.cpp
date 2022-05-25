#include<iostream>
using namespace std;
int main(){
    int num,rev=0,rem,temp;
    cout<<"ENTER NUMBER: "; 
    cin>>num;

    temp=num;

    while(temp!=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
    }

    cout<<"REVERSE OF"<<" "<<num<<" is: "<<rev;
    return 0;
}