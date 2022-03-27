//2. Write a C program to remove white spaces from a given string.

#include <stdio.h>
#include <string.h>

int main()
{
    char str[200];
    int len, i, count = 0;

    printf("Enter a string: ");
    gets(str);

    len = strlen(str);

    for(i = 0; i < len; i++)
    {
        if(str[i] == ' ')
        {
            for(; str[i+1] != ' ' && i < len; i++)
                str[i-count] = str[i+1];

            count++;
        }
    }

    str[i-count] = '\0';

    printf("The string without white spaces: ");
    puts(str);

    return 0;
}
