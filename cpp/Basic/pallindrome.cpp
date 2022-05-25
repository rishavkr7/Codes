#include <iostream>
using namespace std;
int main(){
    int num,temp,rev=0,rem;
    cout<<"ENTER NUMBER: ";
    cin>>num;

    temp=num;

    while(temp!=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
    }
    // cout<<rev<<endl;

    if(num==rev){
        cout<<num<<" : IS A PALLINDROME NUMBER"<<endl;
    }
    else{
        cout<<num<<" : IS NOT A PALLINDROME NUMBER"<<endl;
    }
return 0;

}