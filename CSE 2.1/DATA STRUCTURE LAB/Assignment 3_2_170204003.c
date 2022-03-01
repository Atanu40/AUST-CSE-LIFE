#include<stdio.h>
#include<limits.h>

#define queue_MAX 10
void main()
{
    int queue[queue_MAX],ch,e,front=-1,back=-1;
    printf("QUEUE OPERATIONS USING ARRAY");
    printf("\n------------------------------");
    printf("\n1.ENQUEUE\n2.DEQUEUE\n3.DISPLAY\n4.EXIT");
    void enqueue()
    {
        if(back==queue_MAX-1)
            printf("\nQueue is Full");
        else
        {
            if(front==-1)
                front = 0;
            printf("\nEnter a value to be enqueued: ");
            scanf("%d",&e);
            back++;
            queue[back]=e;
        }
    }
    int dequeue()
    {
        if(front==-1 || front>back)
        {
            printf("\nQueue is empty");
        }
        else
        {
            return queue[front];
            front++;
        }
    }
    void display()
    {
        if(front==-1)
            printf("\nQueue is Empty");
        else
            printf("\nQueue Elements are: ");
        {
            for(int i=front; i<=back; i++)
            {
                printf("\n%d ",queue[i]);
            }
        }
    }
    while(1)
    {
        printf("\n\nEnter the Choice: ");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            enqueue();
            break;
        case 2:
            dequeue();
            printf("\nDequeued Element is %d",queue[front]);
            break;
        case 3:
            display();
            break;
        case 4:
            printf("Exiting.... \n");
            exit(0);
        default:
            printf("\nPlease Enter a Valid Choice (Between 1/2/3/4)");
        }
    }
}
