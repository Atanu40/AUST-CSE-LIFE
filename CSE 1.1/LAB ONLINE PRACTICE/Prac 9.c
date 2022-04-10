/* Write a program to input the names of ‘n’ guests from user. Then
find and display the total number of male and female guests from the list as
well as display the shortest name (based on character count) among all. Assume
that the names will start with Mr. and Mrs. for male and female guests
respectively.*/
#include <stdio.h>
#include <string.h>
int main ()
{
 int i , min=100 , n,female=0,male=0 ;
 printf("How many guests ?\nAns:");
 scanf("%d",&n);
 char ch [n][50];
 getchar();
 printf("Enter Guests name: \n");
 for (i=0;i<n;i++){
 gets(ch[i]);
 }
 for (i=0;i<n;i++){
 if(min>strlen(ch[i])){
 min=strlen(ch[i]);
 }
 if(ch[i][2]=='.'){
 male++;
 }
 if(ch[i][3]=='.'){
 female++;
 }
 }
 printf("The shortest name: \n");
 for (i=0;i<n;i++){
 if(min==strlen(ch[i])){
 puts(ch[i]);
 }
 }
 printf("The female guest: %d\nThe male guest: %d\n",female,male);
 return 0;
}

