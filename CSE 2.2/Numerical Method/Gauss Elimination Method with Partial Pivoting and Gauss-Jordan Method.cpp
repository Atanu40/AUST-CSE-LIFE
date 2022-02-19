#include<bits/stdc++.h>
int n,gc=0,gjc=0;
float a[10][10],temp[10],x[10];
using namespace std;
void gauss()
{
    float app,sum,mult;
    int i,j,k,p;
    for(i=0;i<n;i++)
    {
        app = a[i][i];
        p = i;
        gc++;
        for(k = i+1; k < n; k++)
        {
            gc++;
            if(fabs(app) < fabs(a[k][i]))
            {
               app = a[k][i] ;
               p = k;
            }
        }

        for(j=0;j<=n;j++)
        {
            gc++;
            temp[j] = a[p][j];
            a[p][j] = a[i][j];
            a[i][j] = temp[j];
        }
        for(j=i+1;j<n;j++)
        {
            gc++;
            mult = a[j][i]/a[i][i];
            for(k=0;k<=n;k++)
            {
                gc++;
                a[j][k] -= mult*a[i][k];
            }
        }
    }
    for(i=n-1;i>=0;i--)
    {
        gc++;
        sum = 0;
        for(j=i+1;j<n;j++)
        {
            gc++;
            sum += a[i][j]*temp[j];
        }
        temp[i] = (a[i][n]-sum)/a[i][i];
    }
    printf("Root : \n");
    for(i=0;i<n;i++)
    printf("X[%d] = %.5f\n",i+1,temp[i]);
}
void gaussjordan()
{
    int i,j,k;

    for (i=0;i<n;i++)
    {
        gjc++;
        for (k=i+1;k<n;k++)
        {
            gjc++;
            if (abs(a[i][i])<abs(a[k][i]))
            {
                for (j=0;j<=n;j++)
                {
                    gjc++;
                    double temp=a[i][j];
                    a[i][j]=a[k][j];
                    a[k][j]=temp;
                }
            }
        }
    }
    for (i=0;i<n-1;i++)
    {
        gjc++;
        for (k=i+1;k<n;k++)
            {
                gjc++;
                double t=a[k][i]/a[i][i];
                for (j=0;j<=n;j++)
                {
                    gjc++;
                    a[k][j]=a[k][j]-t*a[i][j];
                }
            }
    }

    for (i=n-1;i>=0;i--)
    {
        gjc++;
        x[i]=a[i][n];
        for (j=i+1;j<n;j++)
        {
            gjc++;
            if (j!=i)
                x[i]=x[i]-a[i][j]*x[j];
        }
        x[i]=x[i]/a[i][i];
    }

    cout<<"\nRoots : \n";
    for (i=0;i<n;i++)
        cout<<x[i]<<endl;
}
int main()
{
        printf("Enter n : ");
            scanf("%d",&n);
        printf("Enter the elements of matrix rowwise\n");
        int i,j;
        for(i=0;i<n;i++)
            for(j=0;j<=n;j++)
                scanf("%f",&a[i][j]);
        clock_t tic,toc;
        tic=clock();
        gauss();
        toc=clock();
        cout<<"Step for gauss elimination : "<<gc<<endl;
        cout<<"Time for gauss elimination : "<<(double)(toc-tic)/CLOCKS_PER_SEC<<endl;
        puts("--------------");
        tic=clock();
        gaussjordan();
        toc=clock();
        cout<<"Step for gauss jordan elimination : "<<gjc<<endl;
        cout<<"Time for gauss jordan : "<<(double)(toc-tic)/CLOCKS_PER_SEC<<endl;
}
