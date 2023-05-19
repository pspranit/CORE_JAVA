#include<iostream>

using namespace std;

int MaxI(int x,int y)
{
	if(x>y)
	{
		return x;
	}
	else
	{
		return y;
	}
}
	
	double MaxD(double x,double y)
	{
	if(x>y)
	{
		return x;
	}
	else
	{
		return y;
	}
	}
	
	char MaxC(char x,char y)
	{
	if(x>y)
	{
		return x;
	}
	else
	{
		return y;
	}
}

int main()
{
	int i=10,j=20,iret=0;
	iret=MaxI(i,j);
	cout<<"Max is:"<<iret<<"\n";
	
	double a=3.10,b=6.10,dret=0;
	dret=MaxD(a,b);
	cout<<"Max is:"<<dret<<"\n";

	char ch='P',ch1='k',cret=0;
	iret=MaxC(ch,ch1);
	cout<<"Max is:"<<iret<<"\n";
	return 0;
}