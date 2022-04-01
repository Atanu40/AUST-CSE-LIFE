/*CT1-Set2: Write a program to take two integers (‘num1’ and ‘num2’) from user
as input and displays “Lucky Number!!” if the difference (num1-num2) of those
numbers is positive and divisible by 5, otherwise displays “Not so lucky.” */
#include<stdio.h>
int main (void)
{
 int a,b;
 printf("Enter Two integers :");
 scanf("%d%d",&a,&b);
 if((a-b)>0&&(a-b)%5==0)
 printf("Lucky Number!!");
 else
 printf("Not so lucky!!");
 return 0;
}
