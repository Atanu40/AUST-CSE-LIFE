#include<stdio.h>
#include<math.h>
#include<time.h>

long int fix=20000, compares1=0, compares2=0, compares3=0, moves1=0, moves2=0, moves3=0;
clock_t start1,start2,start3,end1,end2,end3;
double cpu_time_used1,cpu_time_used2,cpu_time_used3;
int main()
{
    int arr1[fix],n=fix-1;
    for(int i=0; i<fix; i++)
    {
        arr1[i]=rand()%20000;
    }
    start1 = clock();
    bubbleSort(arr1,n);
    end1 = clock();
    cpu_time_used1 = (double) (end1 - start1);
    start2 = clock();
    insertionSort(arr1,n);
    end2=clock();
    cpu_time_used2 = ((double) (end2 - start2));
    start3 = clock();
    selectionSort(arr1,n);
    end3 = clock();
    cpu_time_used3 = ((double) (end3 - start3));
    printf("Bubble    Sort Movement:%d\tComparison:%d\tTime:%f\n",3*moves1,compares1,cpu_time_used1);
    printf("Insertion Sort Movement:%d\tComparison:%d\tTime:%lf\n",moves2,compares2,cpu_time_used2);
    printf("Selection Sort Movement:%d\tComparison:%d\tTime:%lf\n",3*moves3,compares3,cpu_time_used3);
    return 0;
}
void bubbleSort(int arr1[],int n)
{
    int k=n,temp;
    while(k!=0)
    {
        int t=0;
        for(int j=1; j<k-1; j++)
        {
            compares1++;
            if(arr1[j]>arr1[j+1])
            {
                temp=arr1[j+1];
                arr1[j+1]=arr1[j];
                arr1[j]=temp;
                moves1++;
                t=j;
            }
        }
        k=t;
    }
//    printf("After Bubble Sorting:\n\n");
//    for (int i = 0; i <= n; i++)
//        printf("%d\n", arr1[i]);
}

void insertionSort(int arr1[],int n)
{
    int arr2[n+1];
    arr2[0]= -INFINITY;
    for(int i=1; i<=n+1; i++)
        arr2[i]=arr1[i-1];
    for(int j=1; j<=n; j++)
    {
        int temp=arr2[j];
        moves2++;
        int i=j-1;
        compares2++;
        while(temp<arr2[i])
        {
            compares2++;
            arr2[i+1]=arr2[i];
            moves2++;
            i--;
        }
        arr2[i+1]=temp;
        moves2++;
    }
//    printf ("\nAfter Insertion Sorting:\n\n");
//    for(int i=1; i<=n+1; i++)
//        printf ("%d \n",arr2[i]);
}
void selectionSort(int arr1[],int n)
{
    for(int i=n-1; i>=1; i--)
    {
        int t=0;
        for(int j=1; j<=i; j++)
        {
            compares3++;
            if(arr1[t]<arr1[j])
            {
                t=j;
            }
        }
        int temp=arr1[t];
        arr1[t]=arr1[i];
        arr1[i]=temp;
        moves3++;
    }
//    printf ("\nAfter Selection Sorting:\n\n");
//    for(int i=0;i<n+1;i++)
//        printf ("%d \n",arr1[i]);
}
