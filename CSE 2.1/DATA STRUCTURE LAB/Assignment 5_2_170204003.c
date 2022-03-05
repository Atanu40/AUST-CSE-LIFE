#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node * next;
}*head;

void createList(int n);
void displayList();
void insertAtBeginning(int data);
void insertAtN(int data, int position);
void deleteKey(struct node ** head, int key);


int main()
{
    int n, key, data, choice=1, schoice;

    head = NULL;

    while(choice != 5)
    {
        printf("============================================\n");
        printf("       CIRCULAR LINKED LIST PROGRAM\n");
        printf("============================================\n");
        printf("1. Create List\n");
        printf("2. Insert\n");
        printf("3. Delete by Key\n");
        printf("4. Display list\n");
        printf("5. Exit\n");
        printf("--------------------------------------------\n");
        printf("Enter your choice : ");

        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                printf("Enter the total number of nodes in list: ");
                scanf("%d", &n);
                createList(n);
                displayList();
                break;
            case 2:
                 printf("Where do you want to insert?\n");
                printf("1. First\n2. Defined Position\n3. Go Back\n");
                scanf("%d",&schoice);
                if(schoice==1)
                {
                    printf("Enter data to be inserted at beginning: ");
                    scanf("%d", &data);
                    insertAtBeginning(data);
                }
                if(schoice==2)
                {
                    printf("Enter node position: ");
                    scanf("%d", &n);
                    printf("Enter data you want to insert at %d position: ", n);
                    scanf("%d", &data);
                    insertAtN(data, n);
                }
                if(schoice==3)
                    break;
                displayList();
                break;
            case 3:
                printf("Enter key to delete from list: ");
                scanf("%d", &key);
                deleteKey(&head, key);
                displayList();
                break;
            case 4:
                displayList();
                break;
            case 5:
                break;
            default:
                printf("Error! Invalid choice. Please choose between 0-6");
        }

        printf("\n");
    }

    return 0;
}

void createList(int n)
{
    int i, data;
    struct node *prevNode, *newNode;

    if(n >= 1)
    {
        head = (struct node *)malloc(sizeof(struct node));

        printf("Enter data of 1 node: ");
        scanf("%d", &data);

        head->data = data;
        head->next = NULL;

        prevNode = head;

        for(i=2; i<=n; i++)
        {
            newNode = (struct node *)malloc(sizeof(struct node));

            printf("Enter data of %d node: ", i);
            scanf("%d", &data);

            newNode->data = data;
            newNode->next = NULL;
            prevNode->next = newNode;
            prevNode = newNode;
        }

        prevNode->next = head;

        printf("\nCIRCULAR LINKED LIST CREATED SUCCESSFULLY\n");
    }
}

void displayList()
{
    struct node *current;
    int n = 1;

    if(head == NULL)
    {
        printf("List is empty.\n");
    }
    else
    {
        current = head;
        printf("DATA IN THE LIST:\n");

        do {
            printf("Data %d = %d\n", n, current->data);

            current = current->next;
            n++;
        }while(current != head);
    }
}

void insertAtBeginning(int data)
{
    struct node *newNode, *current;

    if(head == NULL)
    {
        printf("List is empty.\n");
    }
    else
    {
        newNode = (struct node *)malloc(sizeof(struct node));
        newNode->data = data;
        newNode->next = head;

        current = head;
        while(current->next != head)
        {
            current = current->next;
        }
        current->next = newNode;

        head = newNode;

        printf("NODE INSERTED SUCCESSFULLY\n");
    }
}

void insertAtN(int data, int position)
{
    struct node *newNode, *current;
    int i;

    if(head == NULL)
    {
        printf("List is empty.\n");
    }
    else if(position == 1)
    {
        insertAtBeginning(data);
    }
    else
    {
        newNode = (struct node *)malloc(sizeof(struct node));
        newNode->data = data;
        current = head;
        for(i=2; i<=position-1; i++)
        {
            current = current->next;
        }
        newNode->next = current->next;
        current->next = newNode;

        printf("NODE INSERTED SUCCESSFULLY.\n");
    }
}

void deleteKey(struct node ** head, int key)
{
    int i, count;
    struct node *prev, *cur;

    if (*head == NULL)
    {
        printf("List is empty.\n");
        return;
    }

    count = 0;
    cur   = *head;
    prev  = cur;

    while (prev->next != *head)
    {
        prev = prev->next;
        count++;
    }

    i = 0;
    while (i <= count)
    {
        if (cur->data == key)
        {
            if (cur->next != cur)
                prev->next = cur->next;
            else
                prev->next = NULL;

            if (cur == *head)
                *head = prev->next;

            free(cur);

            if (prev != NULL)
                cur = prev->next;
            else
                cur = NULL;
        }
        else
        {
            prev = cur;
            cur  = cur->next;
        }
        i++;
    }
}
