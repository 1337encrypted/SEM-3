#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

typedef struct NODE
{
    int data;
    struct NODE *next;
}Node;

Node *front = NULL;
Node *rear = NULL;

bool isFull();
bool isEmpty();
void enQueue();
int deQueue();

bool isFull()
{
    Node *tmp;
    if((tmp = (Node*)malloc(sizeof(Node))))
    {
        free (tmp);
        return false;
    }
    return true;
}

bool isEmpty()
{
    if(front == NULL && rear == NULL)
        return true;
    else
        return false;
}

void enQueue()
{
    int dataIn;
    if(isFull())
    {
        printf("\nQueue overflow\n");
        return;
    }
    else
    {
        Node *tmp = (Node*)malloc(sizeof(Node));
        printf("\nEnter the data to be enqueued: ");
        scanf("%d", &dataIn);
        tmp->data = dataIn;
        tmp->next = rear;
        rear = tmp;
        if(isEmpty())
            front = tmp;
        printf("\nEnqueued succefully\n");
    }
}

int deQueue()
{
    int dataOut;
    if(isEmpty())
    {
        printf("\nStack underflow\n");
        return -1;
    }
    else
    {
        dataOut = rear->data;
        Node *tmp = rear->next;
        rear = rear->next;
        free(tmp);
        return dataOut;
    }
}

int main()
{
    int ch,tmp;
    while(1)
    {
        printf("\n1.Enqueue");
        printf("\n2.Dequeue");
        printf("\n3.Exit");
        printf("\nChoose: ");
        scanf("%d", &ch);
        switch(ch)
        {
            case 1: enQueue();
                break;
            case 2: tmp = deQueue();
                if(tmp != -1)
                    printf("\ndeQueue %d\n", tmp);
                break;
            case 3: exit(0);
            default: printf("\nInvalid input. Please try again\n");
                continue;
        }
    }
}
