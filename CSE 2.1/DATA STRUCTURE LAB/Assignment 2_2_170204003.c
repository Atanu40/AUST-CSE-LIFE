#include<stdio.h>
#include<math.h>

void mergeArray(int arr[] , int p , int q , int r)
{
    int n1 = q-p+1;
    int n2 = r-q;
    int L[n1+1] , R[n2+1];
    for(int i = 0 ; i < n1 ; i++)
    {
        L[i] = arr[p+i];
    }
    for(int j = 0 ; j < n2 ; j++)
    {
        R[j] = arr[q+1+j];
    }
    L[n1] = INFINITY;
    R[n2] = INFINITY;
    for(int i = 0 , j = 0 , k = p ; k <= r ; k++)
    {
        if(L[i] <= R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
    }
}

void mergeSort(int arr[] , int p , int r)
{
    if(p<r)
    {
        int q = floor((p+r)/2);
        mergeSort(arr , p , q);
        mergeSort(arr , q+1 , r);
        mergeArray(arr , p , q , r);
    }
}

int main()
{
    int n;
    printf("How many elements you want to sort using Merge Sort:\n");
    scanf("%d",&n);
    int arr[n];
    for(int i = 0 ; i < n ; i++)
        arr[i] = rand()%20000;

    printf("Order of Unsorted Elements:\n");
    for(int i = 0 ; i < n ; i++)
        printf("%d\n", arr[i]);

    mergeSort(arr , 0 , n-1);

    printf("\nOrder of Sorted Elements:\n");
    for(int i = 0 ; i < n ; i++)
         printf("%d\n", arr[i]);

    return 0;
}

