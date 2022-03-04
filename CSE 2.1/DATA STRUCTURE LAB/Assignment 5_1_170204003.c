#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node * prev;
    struct node * next;
}*head, *last;

void createList(int n);
void insertAtBeginning(int data);
void insertAtEnd(int data);
void insertAtN(int data, int position);
void deleteFromBeginning();
void deleteFromEnd();
void deleteFromN(int position);
void displayList();

int main()
{
    int n, data, choice=1, schoice, tchoice;

    head = NULL;
    last = NULL;

    while(choice != 5)
    {
        printf("============================================\n");
        printf("        DOUBLY LINKED LIST PROGRAM\n");
        printf("============================================\n");
        printf("1. Create List\n");
        printf("2. Insert Node\n");
        printf("3. Delete Node\n");
        printf("4. Display List\n");
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
            printf("1. First\n2. Last\n3. Defined Position\n4. Go Back\n");
            scanf("%d",&schoice);
            if(schoice==1)
            {
                printf("Enter data of first node : ");
                scanf("%d", &data);
                insertAtBeginning(data);
                displayList();
            }
            else if(schoice==2)
            {
                printf("Enter data of last node : ");
                scanf("%d", &data);
                insertAtEnd(data);
                displayList();
            }
            else if(schoice==3)
            {
                printf("Enter the position where you want to insert new node: ");
                scanf("%d", &n);
                printf("Enter data of %d node : ", n);
                scanf("%d", &data);
                insertAtN(data, n);
                displayList();
            }
            else if(schoice==4)
                break;

            break;

        case 3:
            printf("Where do you want to delete from?\n");
            printf("1. First\n2. Last\n3. Defined Position\n4. Go Back\n");
            scanf("%d",&tchoice);
            if(tchoice==1)
            {
                deleteFromBeginning();
                displayList();
            }
            else if(tchoice==2)
            {
                deleteFromEnd();
                displayList();
            }
            else if(tchoice==3)
            {
                printf("Enter the node position which you want to delete: ");
                scanf("%d", &n);
                deleteFromN(n);
                displayList();
            }
            else if(tchoice==4)
                break;

            break;

        case 4:
            displayList();
            break;

        case 5:
            printf("\nExiting...");
            break;
        default:
            printf("\nError! Invalid choice. Please choose between 0-5");
        }
        printf("\n");
    }

    return 0;
}

void createList(int n)
{
    int i, data;
    struct node *newNode;

    if(n >= 1)
    {
        head = (struct node *)malloc(sizeof(struct node));

        printf("Enter data of 1 node: ");
        scanf("%d", &data);

        head->data = data;
        head->prev = NULL;
        head->next = NULL;

        last = head;

        for(i=2; i<=n; i++)
        {
            newNode = (struct node *)malloc(sizeof(struct node));

            printf("Enter data of %d node: ", i);
            scanf("%d", &data);

            newNode->data = data;
            newNode->prev = last;
            newNode->next = NULL;

            last->next = newNode;
            last = newNode;
        }
        printf("\nDOUBLY LINKED LIST CREATED SUCCESSFULLY\n");
    }
}

void insertAtBeginning(int data)
{
    struct node * newNode;
    if(head == NULL)
    {
        printf("Error, List is Empty!\n");
    }
    else
    {
        newNode = (struct node *)malloc(sizeof(struct node));
        newNode->data = data;
        newNode->next = head;
        newNode->prev = NULL;

        head->prev = newNode;

        head = newNode;

        printf("NODE INSERTED SUCCESSFULLY AT THE BEGINNING OF THE LIST\n");
    }
}

void insertAtEnd(int data)
{
    struct node * newNode;

    if(last == NULL)
    {
        printf("Error, List is empty!\n");
    }
    else
    {
        newNode = (struct node *)malloc(sizeof(struct node));

        newNode->data = data;
        newNode->next = NULL;
        newNode->prev = last;

        last->next = newNode;
        last = newNode;

        printf("NODE INSERTED SUCCESSFULLY AT THE END OF LIST\n");
    }
}

void insertAtN(int data, int position)
{
    int i;
    struct node * newNode, *temp;

    if(head == NULL)
    {
        printf("Error, List is empty!\n");
    }
    else
    {
        temp = head;
        i=1;

        while(i<position-1 && temp!=NULL)
        {
            temp = temp->next;
            i++;
        }

        if(position == 1)
        {
            insertAtBeginning(data);
        }
        else if(temp == last)
        {
            insertAtEnd(data);
        }
        else if(temp!=NULL)
        {
            newNode = (struct node *)malloc(sizeof(struct node));

            newNode->data = data;
            newNode->next = temp->next;
            newNode->prev = temp;

            if(temp->next != NULL)
            {
                temp->next->prev = newNode;
            }
            temp->next = newNode;

            printf("NODE INSERTED SUCCESSFULLY AT %d POSITION\n", position);
        }
        else
        {
            printf("Error, Invalid position\n");
        }
    }
}

void deleteFromBeginning()
{
    struct node * toDelete;

    if(head == NULL)
    {
        printf("Unable to delete. List is empty.\n");
    }
    else
    {
        toDelete = head;

        head = head->next;

        if (head != NULL)
            head->prev = NULL;

        free(toDelete);
        printf("SUCCESSFULLY DELETED NODE FROM BEGINNING OF THE LIST.\n");
    }
}

void deleteFromEnd()
{
    struct node * toDelete;

    if(last == NULL)
    {
        printf("Unable to delete. List is empty.\n");
    }
    else
    {
        toDelete = last;

        last = last->prev;

        if (last != NULL)
            last->next = NULL;

        free(toDelete);
        printf("SUCCESSFULLY DELETED NODE FROM END OF THE LIST.\n");
    }
}

void deleteFromN(int position)
{
    struct node *current;
    int i;

    current = head;
    for(i=1; i<position && current!=NULL; i++)
    {
        current = current->next;
    }

    if(position == 1)
    {
        deleteFromBeginning();
    }
    else if(current == last)
    {
        deleteFromEnd();
    }
    else if(current != NULL)
    {
        current->prev->next = current->next;
        current->next->prev = current->prev;

        free(current);

        printf("SUCCESSFULLY DELETED NODE FROM %d POSITION.\n", position);
    }
    else
    {
        printf("Invalid position!\n");
    }
}

void displayList()
{
    struct node * temp;
    int n = 1;

    if(head == NULL)
    {
        printf("\nList is empty.\n");
    }
    else
    {
        temp = head;
        printf("DATA IN THE LIST:\n");

        while(temp != NULL)
        {
            printf("\nDATA of %d node = %d\n", n, temp->data);
            n++;
            temp = temp->next;
        }
    }
}
