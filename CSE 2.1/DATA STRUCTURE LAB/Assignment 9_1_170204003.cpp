#include<bits/stdc++.h>
#include<stdio.h>
#include<malloc.h>
using namespace std;

struct node
{
    int key;
    struct node* left;
    struct node* right;
};

void preorderRecursive(struct node* node);
void preorderNonRecursive(struct node* node);
struct node* createTree(int key);

int main()
{
    struct node *root  = createTree(1);
    root->left         = createTree(2);
    root->right        = createTree(3);
    root->left->left   = createTree(4);
    root->left->right  = createTree(5);
    while(1)
    {
        printf("\n\nPress 1 for Preorder Recursive\nPress 2 for Preorder Non-recursive\nPress 3 for Exit\n\n");
        int ch,key;
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            printf("\nPreorder Traversal(Recursive) : ");
            preorderRecursive(root);
            break;
        case 2:
            printf("\nPreorder Traversal(Non-recursive) : ");
            preorderNonRecursive(root);
            break;
        case 3:
            printf("\nProgram is Exiting.....");
            exit(0);
            break;
        default:
            printf("\nInvalid Input Given");
        }
    }
    return 0;
}
struct node* createTree(int key)
{
    struct node* node = (struct node*)malloc(sizeof(struct node));
    node->key = key;
    node->left = NULL;
    node->right = NULL;

    return(node);
}

void preorderRecursive(struct node* node)
{
    if (node == NULL)
        return;
    printf("%d ", node->key);
    preorderRecursive(node->left);
    preorderRecursive(node->right);
}

void preorderNonRecursive(struct node* root)
{
    if (root == NULL)
        return;
    stack<node *> s;
    s.push(root);

    while (!s.empty())
    {
        struct node *p = s.top();
        s.pop();
        if (p!=NULL)
        {
            printf("%d ", p->key);
            s.push(p->right);
            s.push(p->left);
        }

    }
}
