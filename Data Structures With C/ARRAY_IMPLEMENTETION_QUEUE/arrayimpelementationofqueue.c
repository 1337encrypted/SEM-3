#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#define n 4
int arr[n];
int front=-1,rear=-1;

bool enqueue(int);
int dequeue();
bool isFull();
bool isEmpty();
int queueFront();
int queueRear();

int main()
{
    int ch,temp;
    while(true)
    {
        printf("\n1.Enqueue\t");
        printf("2.Dequeue\t");
        printf("3.isFull\t");
        printf("4.isEmpty\t");
        printf("\n5.Queue front\t");
        printf("6.Queue rear\t");
        printf("7.Exit\t");
        printf("\nEnter your choice: ");
        scanf("%d",&ch);
        
        switch(ch)
        {
            case 1:printf("\nEnter item to be inserted: ");
                scanf("%d",&temp);
                if(enqueue(temp))
                    printf("\nItem is inserted\n");
                else
                    printf("\nQueue overflow\n");
                break;
            
            case 2:temp=dequeue();
                if(temp!=-1)
                    printf("\nItem removed: %d\n",temp);
                else
                    printf("\nQueue underflow\n");
                break;
            
            case 3:if(isFull())
                    printf("\nQueue is full\n");
                else
                    printf("\nQueue is not full\n");
                break;
                
            case 4:if(isEmpty())
                    printf("\nQueue is empty\n");
                else
                    printf("\nQueue is not empty\n");
                break;
            
            case 5:temp=queueFront();
                if(temp!=-1)
                    printf("\nQueue front:%d\n",temp);
                else
                    printf("\nQueue is empty\n");
                break;
            
            case 6:temp=queueRear();
                if(temp!=-1)
                    printf("\nQueue rear:%d\n",temp);
                else
                    printf("\nQueue is empty\n");
                break;
            
            case 7:exit(0);
            default: printf("\nInvlid. Please try again\n");
                continue;
            
        }
    }
}
bool enqueue(int temp)
{
    if(isEmpty())
        front=rear=0;
    else if((rear+1)%n == front)
        return false;
    else
        rear=(rear+1)%n;
    arr[rear]=temp;
    return true;
}
int dequeue()
{
    int temp;
    if(isEmpty())
        return -1;
    else if(front == rear)
    {
        temp = arr[front];
        front = rear = -1;
    }
    else
    {
        temp = arr[front];
        front = (front+1)%n;
    }
    return temp;
}
bool isFull()
{
    if((rear+1)%n == front)
        return true;
    else
        return false;
}
bool isEmpty()
{
    if(front==-1 && rear==-1)
        return true;
    else
        return false;
}
int queueFront()
{
    if(isEmpty())
        return -1;
    else
        return arr[front];
}
int queueRear()
{
    if(isEmpty())
        return -1;
    else
        return arr[rear];
}
