/*3. Write a program to print the Fibonacci series up to n terms where n is user input. [Fibonacci Series: 0, 1, 1, 2, 3, 5, ...]*/

#include <stdio.h>

int main(void)
{
    int n, i, c, p1=1, p2=0;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = 0 ; i < n ; i++)
    {
        if ( i <= 1)
        {
            c = i;
        }
        else
        {
            c = p1 + p2;
            p2 = p1;
            p1 = c;
        }

        if (i == n-1)
        {
            printf("%d", c);
        }
        else
        {
            printf("%d, ", c);
        }

    }

    return 0;
}
