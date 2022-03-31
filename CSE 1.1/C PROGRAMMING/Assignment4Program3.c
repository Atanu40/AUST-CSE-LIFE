//3. The total number of moves of disks required to solve the Tower of Hanoi problem with n disks is expressed in
//the following equation:
//Hn = 2H(n-1) +1, for n>1 and H1 = 1.
//Write a program that finds the total number of moves for any given number n of disks using global variables
//and recursion. Write two different functions that are called from the main function.

#include <stdio.h>

void input();
int hanoi(int n);

int n;

int main()
{
    input();

    printf("Total number of moves: %d", hanoi(n));

    return 0;
}

void input()
{
    printf("Enter the number of disks: ");
    scanf("%d", &n);
}

int hanoi(int n)
{
    if(n == 1)
        return 1;

    else
        return 2*hanoi(n-1) + 1;
}
