#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<limits.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node *create()
{
    struct node *temp;
    printf("\nEnter data: ");
    temp = (struct node*)malloc(sizeof(struct node));
    scanf("%d",&temp->data);
    temp->left=temp->right=NULL;
    return temp;
}

void insert(struct node *root,struct node *temp)
{
    if(temp->data<root->data)
    {
        if(root->left!=NULL)
            insert(root->left,temp);
        else
            root->left=temp;
    }

    if(temp->data>root->data)
    {
        if(root->right!=NULL)
            insert(root->right,temp);
        else
            root->right=temp;
    }
}

bool search(node *root,int key)
{
    if (root == NULL)
        return false;
    if (root->data == key)
        return true;
    bool res1 = search(root->left, key);
    bool res2 = search(root->right, key);

    return res1 || res2;
}

struct node *findMax(struct node* node)
{
    struct node* cur=node;
    while(cur->right!=NULL)
          cur=cur->right;
    return cur;
}

struct node *findMin(struct node* node)
{
    struct node* cur=node;
    while(cur->left!=NULL)
          cur=cur->left;
    return cur;
}

void findPredecessor(struct node* node,struct node* pre,int val)
{
    if(node==NULL)
        return;
    if(node->data==val)
    {
        if(node->left!=NULL)
        {
            struct node* cur=node->left;
            while(cur->right!=NULL)
                cur=cur->right;
            pre=cur;
        }
    }
    if(node->data>val)
    {
        findPredecessor(node->left,pre,val);
    }
    else
    {
        pre=node;
        findPredecessor(node->right,pre,val);
    }
}

void findSuccessor(struct node* node,struct node* suc,int val)
{
    if(node==NULL)
        return;
    if(node->data==val)
    {
        if(node->right!=NULL)
        {
            struct node* cur=node->right;
            while(cur->left!=NULL)
                cur=cur->left;
            suc=cur;
        }
    }
    if(node->data>val)
    {
        suc=node;
        findSuccessor(node->left,suc,val);
    }
    else
    {
        findSuccessor(node->right,suc,val);
    }
}

struct node* deleteNode(struct node* root,int data)
{
    if(root==NULL)
        return root;
    if(data<root->data)
        root->left=deleteNode(root->left,data);
    else if(data>root->data)
        root->right=deleteNode(root->right,data);
    else
    {
        if(root->left==NULL)
        {
            struct node* temp=root->left;
            free(root);
            return temp;
        }
        struct node* temp=findMin(root->right);
        root->data=temp->data;
        root->right=deleteNode(root->right,temp->data);
    }
    return root;
}

void preorder(node *root)
{
    if(root!=NULL)
    {
        printf("%d ",root->data);
        preorder(root->left);
        preorder(root->right);
        printf("\n");
    }
}

int main()
{
    int ch1,key;
    char ch;
    node *root=NULL,*pre=NULL,*suc=NULL,*temp;
    while(1)
    {
        printf("Press\n1 for Insert\n2 for Search\n3 for Minimum Value of The Tree\n4 for Maximum Value of The Tree\n5 for Predecessor\n6 for Successor\n7 for Delete\n8 for Show(Inorder Traversal)\n9 for Quit\n\n");
        scanf("%d",&ch1);
        switch(ch1)
        {
        case 1:
            do
            {
                temp=create();
                if(root==NULL)
                    root=temp;
                else
                    insert(root,temp);

                printf("\nDo you want to enter more(y/n)? ");
                getchar();
                scanf("%c",&ch);
            }
            while(ch=='y'|ch=='Y');
            break;
        case 2:
            printf("\nEnter which element you want to search: ");
            scanf("%d",&key);
            if (search(root, key))
                printf("\nYes, %d found in the binary search tree\n",key);
            else
                printf("\n%d cannot be found in the binary search tree\n",key);
            break;
        case 3:
            printf("\nMinimum Value: %d\n",findMin(root)->data);
            break;
        case 4:
            printf("\nMaximum Value: %d\n",findMax(root)->data);
            break;
        case 5:
            printf("\nEnter the Node of which you want to find the Predecessor: ");
            scanf("%d",&key);
            findPredecessor(root,pre,key);
            printf("\nPredecessor of %d is %d\n",key,pre->data);
            break;
        case 6:
            printf("\nEnter the Node of which you want to find the Successor: ");
            scanf("%d",&key);
            findSuccessor(root,suc,key);
            printf("\nSuccessor of %d is %d\n",key,suc->data);
            break;
        case 7:
            printf("Enter which element you want to delete: ");
            scanf("%d",&key);
            deleteNode(root,key);
            break;
        case 8:
            printf("\nPreorder Traversal: ");
            preorder(root);
            break;
        case 9:
            printf("Exiting Program...");
            exit(0);
            break;
        default:
            printf("Invalid Input. Please Enter Between 0 to 9\n");
        }
    }
    return 0;
}


