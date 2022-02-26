#include<stdio.h>
int main()
{
    int arr[20000];
    int n,start,end,mid,key;

    printf("How many sorted elements you want to enter?\n");
    scanf("%d",&n);
    for(int i = 0; i<=n; i++)
    {
        arr[i]=i;
    }

    start = 0;
    end = n;
    printf("Enter which element you want to search:\n");
    scanf("%d",&key);

    do
    {
        mid = (int)((start+end)/2);
        if(arr[mid]== key)
        {
            printf("Found at %dth position\n",mid+1);
            break;
        }
        else if(arr[mid]>key)
        {
            end = mid-1;
        }
        else
        {
            start = mid+1;
        }
    }
    while(start<=end);

    if(start>end)
    {
        printf("Not Found!!\n");
    }

    return 0;
}
