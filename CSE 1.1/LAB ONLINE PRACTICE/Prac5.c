/* Write a program to input a string from user, capitalize the
first letter of every word and print the string back. Note that, your code
should contain exactly one character array. */
#include <stdio.h>
#include <string.h>
int main()
{
 char ch [100];
 int i;
 printf("Enter the string :");
 gets(ch);
 ch[0]=ch[0]-32;
 for(i=1;ch[i]!='\0';i++){
 if(ch[i]==' '){
 ch[i+1]=ch[i+1]-32;
 }
 }
 puts(ch);
 return 0;
}
