/* Write a program to input a string from user, convert the last
letter of every word into lowercase and print the string back. Note that, your
code should contain exactly one character array.*/
#include <stdio.h>
#include <string.h>
int main()
{
 char ch [100];
 int i,len;
 printf("Enter the string :");
 gets(ch);
 len=strlen(ch);
 ch[len-1]=ch[len-1]+32;
 for(i=1;ch[i]!='\0';i++){
 if(ch[i]==' '){
 ch[i-1]=ch[i-1]+32;
 }
 }
 puts(ch);
 return 0;
}
