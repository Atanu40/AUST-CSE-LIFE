#include<stdio.h>

int arr[20000];
void quickSort(int first,int last)
{
    int i, j, pivot, temp;

    if(first<last)
    {
        pivot=first;
        i=first;
        j=last;

        while(i<j)
        {
            while(arr[i]<=arr[pivot]&& i<=last)
            {
                i++;
            }
            while(arr[j]>arr[pivot] && j>=first)
            {
                j--;
            }
            if(i<j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[j];
        arr[j]=arr[pivot];
        arr[pivot]=temp;
        quickSort(first,j-1);
        quickSort(j+1,last);

    }
}

int main()
{
    int i, n;

    printf("How many elements you want to sort using Quick Sort:\n");
    scanf("%d",&n);

    for(i=0; i<n; i++)
        arr[i]=rand()%20000;

    printf("Order of Unsorted Elements:\n");
    for(i=0; i<n; i++)
        printf("%d\n",arr[i]);

    quickSort(0,n-1);

    printf("\nOrder of Sorted Elements:\n");
    for(i=0; i<n; i++)
        printf("%d\n",arr[i]);

    return 0;
}
