/*  Write a program to input integers into a 2D array (dimension: user
input), display the array in the shape of a matrix and find the sum of the
elements in the even number columns using nested loop */
#include <stdio.h>
int main ()
{
 int i , j , r, c,sum=0;
 printf("Enter the number of row: ");
 scanf("%d",&r);
 printf("Enter the Number of column: ");
 scanf("%d",&c);
 int ar[r][c];
 printf("Enter %d integers : ", r*c);
 for (i=0;i<r;i++){
 for(j=0;j<c;j++){
 scanf("%d",&ar[i][j]);
 }
 }
 printf("The given 2D array : \n");
 for (i=0;i<r;i++){
 for(j=0;j<c;j++){
 printf("%d ",ar[i][j]);
 }
 printf("\n");
 }
 for (i=0;i<r;i++){
 for(j=0;j<c;j++){
 if(j%2==1){
 sum=sum+ar[i][j];
 }
 }
 }
 printf("The sum : %d",sum);
 return 0;
}
