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

void postorderRecursive(struct node* node);
void postorderNonRecursive(struct node* node);
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
        printf("\n\nPress 1 for Postorder Recursive\nPress 2 for Postorder Non-recursive\nPress 3 for Exit\n\n");
        int ch,key;
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            printf("\nPostorder Traversal(Recursive) : ");
            postorderRecursive(root);
            break;
        case 2:
            printf("\nPostorder Traversal(Non-recursive) : ");
            postorderNonRecursive(root);
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
    struct node* node = (struct node*)
                        malloc(sizeof(struct node));
    node->key = key;
    node->left = NULL;
    node->right = NULL;

    return(node);
}

void postorderRecursive(struct node* node)
{
    if (node == NULL)
        return;
    postorderRecursive(node->left);
    postorderRecursive(node->right);
    printf("%d ", node->key);
}

void postorderNonRecursive(struct node* root)
{
    stack<node*> s;
    s.push(root);

    stack<int> s1;
    while(!s.empty())
    {
        node *p=s.top();
        s.pop();
        s1.push(p->key);

        if(p->left)
        {
            s.push(p->left);
        }
        if(p->right)
        {
            s.push(p->right);
        }
    }

    while(!s1.empty())
    {
        printf("%d ", s1.top());
        s1.pop();
    }
}
