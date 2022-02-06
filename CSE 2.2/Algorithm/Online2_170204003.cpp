#include<bits/stdc++.h>
#include<stdlib.h>
using namespace std;

int  main()
{
    int n, f, l, k = 0;
    printf("Input number of elements you want to sort: ");
    scanf("%d", &n);
    int q=n;
    int A[n],D[n];
    for (int i=1; i<=n; i++)
    {
        A[i]=rand()%9;
    }
    printf("\nEnter the range (first and last index number) you want to sort: ");
    scanf("%d%d",&f,&l);
    for(int i=f,j=1; i<=l, j<=(l-f)+1; i++,j++)
    {
        D[j]=A[i];
        if (D[j] > k)
        {
            k = D[j];
        }
    }
    printf("\nBefore Sorted: ");
    for(int i=1; i<=n; i++)
        printf("%d ",A[i]);
    printf("\nRanged Unsorted Elements: ");
    for(int i=1; i<=(l-f)+1; i++)
        printf("%d ",D[i]);
    n=(l-f)+1;
    int B[n], C[k];
    for (int i=0; i<=k; i++)
        C[i] = 0;
    for (int j=1; j<=n; j++)
        C[D[j]] = C[D[j]] + 1;
    for (int i=1; i<=k; i++)
        C[i] = C[i] + C[i-1];
    for (int j=n; j>=1; j--)
    {
        B[C[D[j]]] = D[j];
        C[D[j]] = C[D[j]] - 1;
    }
    printf("\nAfter Sorted : ");
    for (int i=1; i<=n; i++)
        printf("%d ", B[i]);
    int N[100];
    printf("\nTotal Array: ");
    for(int i=1; i<=f-1; i++)
        printf("%d ",A[i]);
    for(int i=1; i<=n; i++)
        printf("%d ",B[i]);
    for(int i=l+1; i<=q; i++)
        printf("%d ", A[i]);

    printf("\n");
    return 0;
}

