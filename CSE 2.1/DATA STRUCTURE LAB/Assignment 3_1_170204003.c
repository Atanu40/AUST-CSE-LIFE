#include<stdio.h>
#include<limits.h>

#define stack_MAX 10
int stack[stack_MAX],arr[stack_MAX],choice,top,x,i;
int main()
{
    top=-1;
    printf("STACK OPERATIONS USING ARRAY");
    printf("\n------------------------------");
    printf("\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");

    do
    {
        printf("\n\nEnter the Choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
        {
            printf("\nEnter a value to be pushed: ");
            scanf("%d",&x);
            push(x);
            break;
        }
        case 2:
        {
            pop();
            printf("\nThe popped elements is %d",stack[top]);
            break;
        }
        case 3:
        {
            display();
            break;
        }
        case 4:
        {
            printf("\nExiting... \n");
            break;
        }
        default:
        {
            printf ("\nPlease Enter a Valid Choice (Between 1/2/3/4)");
        }

        }
    }
    while(choice!=4);
    return 0;
}
void push(int x)
{
    if(arr[0]!=NULL)
            {
                for(int i=0; i<stack_MAX; i++)
                {
                    stack[i]=arr[i];
                }
            }
    if(top>=stack_MAX-1)
    {
        printf("\n\tStack over-flow");

    }
    else
    {
        top++;
        stack[top]=x;
    }
}
int pop()
{
    if(arr[0]!=NULL)
            {
                for(int i=0; i<stack_MAX; i++)
                {
                    stack[i]=arr[i];
                }
            }
    if(top==-1)
    {
        printf("\nStack Empty");
    }
    else
    {
        return stack[top];
        top--;
    }
}
void display()
{
    for(int i=0; i<stack_MAX; i++)
    {
        arr[i]=stack[i];
    }
    if(stack[0]==NULL)
    {
        printf("\nStack is Empty");
    }
    else
    {
        printf("\nThe elements in Stack: ");
        for(int i = top; i>=0; i--)
        {
            pop();
            printf("%d ",stack[top]);
            top--;
        }
    }
}
