#include<bits/stdc++.h>
using namespace std;
#define S 5
void floyds(int b[][S])
{
    int i, j, k;
    for (k = 0; k < S; k++)
    {
        for (i = 0; i < S; i++)
        {
            for (j = 0; j < S; j++)
            {
                if ((b[i][k] * b[k][j] != 0) && (i != j))
                {
                    if ((b[i][k] + b[k][j] < b[i][j]) || (b[i][j] == 0))
                    {
                        b[i][j] = b[i][k] + b[k][j];
                    }
                }
            }
        }
    }
    for (i = 0; i < S; i++)
    {
        printf("Minimum Cost With Respect to Node: %d\n",i+1);
        for (j = 0,k=1; j < S; j++,k++)
        {
            printf("Node %d: %d\t",k,b[i][j]);
        }
        printf("\n");
    }
}
int main()
{
    int b[S][S];
    freopen("Input5.txt", "r", stdin);
    for (int i = 0; i < S; i++)
    {
        for (int j = 0; j < S; j++)
        {
            scanf("%d",&b[i][j] );
        }
    }
    floyds(b);
}
