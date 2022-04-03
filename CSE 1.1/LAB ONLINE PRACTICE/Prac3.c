/*CT2-Set1: Write a program to input 10 integers to make a list(array) and
replace the elements at indexes divisible by a given number with 0. Now print
the modified list and total number of replacements. */
#include <stdio.h>
int main ()
{
    int ar [10],n, i, count =0;
    printf("Enter 10 integers :");
    for(i=0; i<10; i++)
    {
        scanf("%d",&ar[i]);
    }
    printf("Enter another integer: ");
    scanf("%d",&n);
    for(i=0; i<10; i++)
    {
        if(i%n==0)
        {
            ar[i]=0;
            count++;
        }
    }
    printf("Modifies list : ");
    for(i=0; i<10; i++)
    {
        printf("%d ",ar[i]);
    }
    printf("\nNumber Replacements: %d",count);
    return 0;
}
