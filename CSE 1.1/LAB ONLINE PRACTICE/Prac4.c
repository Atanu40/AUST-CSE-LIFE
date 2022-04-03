/*Write a program to input 10 integers to make a list(array) and replace the
elements at indexes divisible by a given number with -1. Now print the modified
list and the sum of the elements that are replaced. */
#include <stdio.h>
int main ()
{
 int ar [10],n, i, sum =0,temp;
 printf("Enter 10 integers :");
 for(i=0;i<10;i++){
 scanf("%d",&ar[i]);
 }
 printf("Enter another integer: ");
 scanf("%d",&n);
 for(i=0;i<10;i++){
 if(i%n==0){
 temp=ar[i];
 sum=sum+temp;
 ar[i]=-1;
 }
 }
 printf("Modifies list : ");
 for(i=0;i<10;i++){
 printf("%d ",ar[i]);
 }
 printf("\nSum: %d",sum);
 return 0;
}
