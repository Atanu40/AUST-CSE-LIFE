//1. Write a C program to swap the values of two integer variables with and without using any extra variable.

#include <stdio.h>

int main(void)
{
    int a, b, temp;

    printf("Enter the value of a: ");
    scanf("%d", &a);

    printf("Enter the value of b: ");
    scanf("%d", &b);

    temp = a;
    a = b;
    b = temp;

    printf("\nAfter swapping values, the value of a: %d.\nAfter swapping values, the value of b: %d.\n", a, b);

    return 0;
}
