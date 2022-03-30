//2. Write a multiple function program to let the user enter 'n' (user input) names and then output the
//names, one at a time, in any order according to user's choice. To stop the program, user must enter
//a negative integer. Note that, you have to take input in main function and output output in another
//function and the largest name should be outputed along with the length when the user decides to
//quit.

#include <stdio.h>
#include <string.h>

void output();

char name[300][100];
int m, n, i, minlen, maxlen = 0;

int main()
{
    printf("Enter the number of names: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++)
    {
        printf("Enter name %d: ", i+1);
        scanf("%s", name[i]);
//        gets(name[i]);

        minlen = strlen(name[i]);

        if(minlen > maxlen)
            maxlen = minlen;

        printf("\n");
    }

    output();

    return 0;
}

void output()
{
    while(1)
    {
        printf("Which name to print: ");
        scanf("%d", &m);

        if(m < 0)
        {
            printf("The largest name(s):\n");

            for(i = 0; i < n; i++)
            {
                if(strlen(name[i]) == maxlen)
                    puts(name[i]);
            }

            printf("The length of the largest name(s): %d\n", maxlen);
            printf("\nProgram terminated!\n");
            break;
        }
        else if(m == 0 || m > n)
            printf("Not available in the list.\n\n");
        else
            printf("Name %d: %s\n\n", m, name[m-1]);
    }
}
