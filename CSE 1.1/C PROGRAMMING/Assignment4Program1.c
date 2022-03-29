//1. Write a multifunction program to print the following patterns where number of rows is user input and must
//be read in main function. There should be separate function for each of the following patterns and note that,
//you cannot pass any data through parameters to those functions.

#include <stdio.h>

void pattern1();
void pattern2();

int row1, row2;

int main()
{
    printf("Rows of pattern 1: ");
    scanf("%d", &row1);

    pattern1();

    printf("\nRows of pattern 2 (top to middle): ");
    scanf("%d", &row2);

    pattern2();

    return 0;
}

void pattern1()
{
    int r, c, sp, s, d;

    for(r = row1, sp = 1; r >= 1; r--, sp++)
    {
        for(s = 1; s < sp; s++)
            printf(" ");

        for(c = 1, d = 2*r-1; c <= 2*r-1; c++, d--)
            printf("%d", d);

        printf("\n");
    }
}

void pattern2()
{
    int r, c, sp, s;

    for(r = row2, sp = 1; r >= 1; r--, sp++)
    {
        for(s = 1; s < sp; s++)
            printf(" ");
        for(c = 1; c <= 2*r-1; c++)
            printf("*");

        printf("\n");
    }

    for(r = 2, sp = row2-2; r <= row2; r++, sp--)
    {
        for(s = 1; s <= sp; s++)
            printf(" ");
        for(c = 1; c <= 2*r-1; c++)
            printf("*");

        printf("\n");
    }
}
