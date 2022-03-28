//3. Write a program that will read an integer between 20 and 99 from user and print it out in words. You have to use switch statement and repeat the whole process 'n' [user input] times.

#include <stdio.h>

int main()
{
    int n, num, i;

    printf("How many times to execute the program: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++)
    {
        printf("\nEnter an integer [20-99]: ");
        scanf("%d", &num);

        if(num < 20 || num > 99)
        {
            printf("Invalid input.\n");
        }

        else
        {
            printf("In words: ");

            switch(num/10)
            {
            case 2:
                printf("Twenty ");
                break;
            case 3:
                printf("Thirty ");
                break;
            case 4:
                printf("Forty ");
                break;
            case 5:
                printf("Fifty ");
                break;
            case 6:
                printf("Sixty ");
                break;
            case 7:
                printf("Seventy ");
                break;
            case 8:
                printf("Eighty ");
                break;
            case 9:
                printf("Ninety ");
                break;
            }

            switch(num%10)
            {
            case 0:
                break;
            case 1:
                printf("One");
                break;
            case 2:
                printf("Two");
                break;
            case 3:
                printf("Three");
                break;
            case 4:
                printf("Four");
                break;
            case 5:
                printf("Five");
                break;
            case 6:
                printf("Six");
                break;
            case 7:
                printf("Seven");
                break;
            case 8:
                printf("Eight");
                break;
            case 9:
                printf("Nine");
                break;
            }

            printf("\n");
        }
    }

    return 0;
}
