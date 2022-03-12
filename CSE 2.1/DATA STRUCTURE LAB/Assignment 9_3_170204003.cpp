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

void inorderRecursive(struct node* node);
void inorderNonRecursive(struct node* node);
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
        printf("\n\nPress 1 for Inorder Recursive\nPress 2 for Inorder Non-recursive\nPress 3 for Exit\n\n");
        int ch,key;
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            printf("\nInorder Traversal(Recursive) : ");
            inorderRecursive(root);
            break;
        case 2:
            printf("\nInorder Traversal(Non-recursive) : ");
            inorderNonRecursive(root);
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

void inorderRecursive(struct node* node)
{
    if (node == NULL)
        return;
    inorderRecursive(node->left);
    printf("%d ", node->key);
    inorderRecursive(node->right);
}

void inorderNonRecursive(struct node* root)
{
    if (root == NULL)
        return;
    struct node *p=root;
    stack<node *> s;
    while (p != NULL || s.empty() == false)
    {
        while (p !=  NULL)
        {
            s.push(p);
            p = p->left;
        }

        p = s.top();
        s.pop();
        printf("%d ", p->key);
        p = p->right;
    }
}
