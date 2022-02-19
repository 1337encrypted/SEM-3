#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

typedef struct node
{
    int data;
    struct node *next;
}NODE;

bool isEmpty(NODE **);
bool isFull();
void push(NODE **,int);
int pop(NODE **);
//int stackTop();

int main()
{
    NODE *top = NULL;
    int tmp;
    push(&top,20);
    
    tmp = pop(&top);
    if(tmp)
        printf("\nItem %d popped", tmp);
    
    printf("\n");
    return 0;
}

bool isEmpty(NODE **top)
{
    if(*top == NULL)
        return 1;
    else
        return 0;
}
bool isFull()
{
    NODE *tmp;
    if(!(tmp = (NODE*)malloc(sizeof(NODE))))
    {
        free (tmp);
        return true;
    }
    else
        return false;
}

void push(NODE **top,int dataIn)
{
    NODE *tmp;
    tmp = (NODE*)malloc(sizeof(NODE));
    if(tmp == NULL)
    {
        printf("\nMalloc failure");
        return;
    }
    
    tmp->data = dataIn;
    tmp->next = *top;
    *top = tmp;
    printf("\nItem %d inserted successfully",dataIn);
}
int pop(NODE **top)
{
    if(*top == NULL)
    {
        printf("\nStack underflow");
        return 0;
    }
    int item;
    NODE *tmp;
    tmp = *top;
    item = tmp->data;
    *top = tmp->next;
    free(tmp);
    return item;
}
