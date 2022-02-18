// TW 9 Expression Tree

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>


struct node {
    char data;
    struct node* left;
    struct node* right;
    struct node* next;
};
 struct node *head=NULL;

struct node* newNode(char data)
{
    struct node* node = (struct node*)malloc(sizeof(struct node));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    node->next = NULL;

    return (node);
}

bool isOperator(char c)
{
    return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
}

void inorder(struct node* node)
{
    if(node == NULL)
        return;
    if (isOperator(node->data))
    {
        printf("(");
    }
    inorder(node->left);
    printf("%c", node->data);
    inorder(node->right);

    if (isOperator(node->data))
    {
        printf(")");
    }
}
void postorder(struct node *root)
{
 if(root!=NULL)
 {
  postorder(root->left);
  postorder(root->right);
  printf("%c ",root->data);
 }
}

void preorder(struct node *root)
{
 if(root!=NULL)
 {
  printf("%c ",root->data);
  preorder(root->left);
  preorder(root->right);
 }
}


void push(struct node* x)
{
    if(head==NULL)
    head = x;
    else
    {
        (x)->next = head;
        head  = x;
    }
}

struct node* pop()
{
    struct node* p = head;
    head = head->next;
    return p;
}

int main()
{
    char s[30];
    printf("\nEnter the expression: ");
    scanf("%[^\n]s", s);
    int l = strlen(s);
    for(int i=0;i<l;i++)
        printf("%c ", s[i]);
    printf("\nl = %d\n", l);
    struct node *x, *y, *z;
    for (int i = 0; i < l; i++) {
 
        if (s[i] == '+' || s[i] == '-' || s[i] == '*'
            || s[i] == '/')
        {
            z = newNode(s[i]);
            x = pop();
            y = pop();
            z->left = y;
            z->right = x;
            push(z);
        }
        else
        {
            z = newNode(s[i]);
            push(z);
        }
    }

    printf("The given expression is\n");
    for (int i = 0; i < l; i++)
    {
        printf("%c",s[i]);
    }

    printf("\nThe Inorder Traversal of Expression Tree:\t");
    inorder(z);

    printf("\nThe Preorder Traversal of Expression Tree:\t");
    preorder(z);

    printf("\nThe Postorder Traversal of Expression Tree:\t");
    postorder(z);
    
    printf("\n");

    return 0;
}
