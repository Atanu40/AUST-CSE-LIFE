//3. Write a program to input two angles of a triangle and check whether the triangle is a right-angled triangle or not.

#include <stdio.h>

int main(void)
{
    float a, b;

    printf("Enter two angles of a triangle: ");
    scanf("%f %f", &a, &b);

    if (a == 0 || b == 0 || (a+b) >= 180)
    {
        printf("\nInvalid input.\n");
    }
    else if (a == 90 || b == 90 || (a+b) == 90)
    {
        printf("\nThe triangle is a right-angled triangle.\n");
    }
    else
    {
        printf("\nThe triangle is not a right-angled triangle.\n");
    }

    return 0;
}
