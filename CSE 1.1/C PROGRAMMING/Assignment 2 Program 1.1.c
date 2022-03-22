/*1. Write a program to find, first using a 'while' loop and then a 'for' loop,
the sum of first n terms (n >= 1) of the series 2x3, 3x4, 4x5, ... , (n+1)(n+2).
You need to verify that you get the same result in both the cases.*/

#include <stdio.h>

int main(void)
{
    int n, i, sum = 0;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    i = 1;

    while (i <= n)
    {
        sum = sum + (i + 1)*(i + 2);
        i++;
    }

    printf("\nThe sum of the first n terms of the series: %d\n", sum);

    return 0;
}
