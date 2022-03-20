//4. Write a program to input a letter and display it in opposite case, i. e., if the given letter is in upper case, display it in lower case and vice-versa.

#include <stdio.h>

int main(void)
{
    char ch;

    printf("Enter a letter: ");
    scanf("%c", &ch);

    if (ch >= 'a' && ch <= 'z')
    {
        printf("\n%c in opposite case: %c\n", ch, 'A' + (ch - 'a'));
    }
    else if (ch >= 'A' && ch <= 'Z')
    {
        printf("\n%c in opposite case: %c\n", ch, 'a' + (ch - 'A'));
    }
    else
    {
        printf("\n%c is not a letter.\n", ch);
    }

    return 0;
}
