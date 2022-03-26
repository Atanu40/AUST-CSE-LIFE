//1. Write a program to determine all Pythagorean triplets without duplication and with minimum possible computational cost in the range 1 to 1000.

#include <stdio.h>

int main()
{
    int i, j, k;

    printf("Pythagorean triplets in the range 1 to 1000:\n");

    for(i = 1; i <= 1000; i++)
    {
        for(j = i; j <= 1000; j++)
        {
            for(k = j; k <= 1000; k++)
            {
                if(i*i + j*j == k*k)
                    printf("%d, %d, %d\n", i, j, k);
            }
        }
    }

    return 0;
}
