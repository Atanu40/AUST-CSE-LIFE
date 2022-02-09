#include<bits/stdc++.h>
#include<stdlib.h>
using namespace std;

int max(int a, int b)
{
    if(a > b)
    {
        return a;
    }
    else
    {
        return b;
    }
}

int knapSack(int W, int weight[], int profit[], int n)
{
    int i, w;
    int atanu[n+1][W+1];

    for (i = 0; i <= n; i++)
    {
        for (w = 0; w <= W; w++)
        {
            if (i==0 || w==0)
                atanu[i][w] = 0;
            else if (weight[i-1] <= w)
                atanu[i][w] = max(profit[i-1] + atanu[i-1][w-weight[i-1]],  atanu[i-1][w]);
            else
                 atanu[i][w] = atanu[i-1][w];
        }
    }

    int flag[20] = {0};
    i=n;

    int k=W;

    while(i>0 && k>0)

    {

        if(atanu[i][k]!=atanu[i-1][k])

        {

            flag[i]=1;

            k=k-weight[i-1];

            i=i-1;

        }

        else

            i--;

    }



    printf("\nThe resultant vector is ");

    printf("( ");

    for(i=1; i<=n; i++)

        printf("%d ",flag[i]);

    printf(")\n");



    return atanu[n][W];
}

int main()
{
    int i, n, profit[20], weight[20], W;

    printf("Enter number of items: ");
    scanf("%d", &n);

    printf("\nEnter Profit and Weight of items:\n");
    for(i = 0; i < n; ++i)
    {
        scanf("%d%d", &profit[i], &weight[i]);
    }

    printf("\nEnter maximum size/weight of knapsack: ");
    scanf("%d", &W);

    printf("\nDetails of all items: \n\n");
    printf("Profit\t\tWeight\t\n\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t\t%d\n",profit[i],weight[i]);
    }

    printf("\n\nMaximum profit: %d\n", knapSack(W, weight, profit, n));
    return 0;
}


