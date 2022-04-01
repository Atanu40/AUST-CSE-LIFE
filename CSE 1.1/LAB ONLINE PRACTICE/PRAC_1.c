/* Write a program to take two integers from
user as input and displays “Lucky Number!!”
if the sum of those numbers is divisible by
both 3 and 6, otherwise displays “Not so lucky.” */
#include<stdio.h>
int main (void)
{
 int a,b;
 printf("Enter Two integers :");
 scanf("%d%d",&a,&b);
 if((a+b)%3==0&&(a+b)%6==0)
 printf("Lucky Number!!");
 else
 printf("Not so lucky!!");
 return 0;
}

