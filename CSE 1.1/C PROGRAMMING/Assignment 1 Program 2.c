//2. Write a program to find whether a given number is even or odd. If found even, check for divisibility by 4, otherwise check for divisibility by 3.

#include <stdio.h>

int main(void)
{
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (n%2 == 0)
    {
        printf("\nThe number is even.");

        if (n%4 == 0)
        {
            printf("\nThe number is divisible by 4.\n");
        }
        else
        {
            printf("\nThe number is not divisible by 4.\n");
        }
    }
    else
    {
        printf("\nThe number is odd.");

        if (n%3 == 0)
        {
            printf("\nThe number is divisible by 3.\n");
        }
        else
        {
            printf("\nThe number is not divisible by 3.\n");
        }
    }

    return 0;
}
