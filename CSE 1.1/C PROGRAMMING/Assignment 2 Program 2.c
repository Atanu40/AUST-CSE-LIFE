/*2. Write a program to check whether a given integer is palindrome or not. [121 is palindrome but 123 is not]*/

#include <stdio.h>

int main(void)
{
    int num, n, rem, rev = 0;

    printf("Enter an integer: ");
    scanf("%d", &num);

    n = num;

    while (n != 0)
    {
        rem = n%10;
        rev = (rev * 10) + rem;
        n = n/10;
    }

    if (num == rev)
    {
        printf("\nThe integer is a palindrome.\n");
    }
    else
    {
        printf("\nThe integer is not a palindrome.\n");
    }

    return 0;
}
