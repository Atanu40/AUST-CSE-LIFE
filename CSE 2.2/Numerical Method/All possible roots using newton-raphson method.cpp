#include <bits/stdc++.h>

using namespace std;

double f(double x)
{
    return x*x-4*x-10;
}
double df(double x)
{
    return 2*x-4;
}
int nr(double x,double en)
{
    int cnt=0;
    double prev=-9999.0;
    while(x<=en)
    {
        double y=x;
        double h = f(y) / df(y);
        while (abs(h) >= 0.01)
        {
            h=f(y)/df(y);
            y=y-h;
        }
        if(fabs(prev-y)<=0.001){
            x++;
            continue;
        }
        x++;
        prev=y;
        if(y>0 || y<=0)
            cout << "The value of the root is : " << y<<endl;
    }

}
int main()
{
    double st,en;
    cin>>st>>en;
    nr(st,en);
}
