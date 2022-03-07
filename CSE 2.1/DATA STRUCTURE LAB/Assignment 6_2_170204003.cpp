#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int n,i,j,k;
    struct Node* next;
};
struct Node* top=NULL;
void Push(int n,int i,int j,int k)
{
    struct Node* temp;
    temp = (struct Node*)malloc(sizeof(struct Node));
    temp->n=n;
    temp->i=i;
    temp->j=j;
    temp->k=k;
    temp->next=top;
    top=temp;
}
void Pop()
{
    struct Node* temp;
    temp = (struct Node*)malloc(sizeof(struct Node));
    if(top == NULL)
        return;
    temp=top;
    top=top->next;
    free(temp);
}

int isEmpty()
{
    if(top == NULL)
        return 1;
    return 0;
}

struct Node* Top()
{
    return (top);
}
int main()
{
    int n,r=0;
    printf("Enter Number of Disks: ");
    scanf("%d",&n);
    Push(n,1,2,3);
    while(!isEmpty())
    {
        struct Node* temp=Top();
        n=temp->n;
        int i=temp->i;
        int j=temp->j;
        int k=temp->k;
        Pop();
        if(n==1)
        {
            printf("Move the top disk from pole %d to pole %d.\n",i,k);
            r++;
        }
        else
        {
            Push(n-1,j,i,k);
            Push(1,i,j,k);
            Push(n-1,i,k,j);
        }
    }
    printf("Total Steps: %d",r);
}
