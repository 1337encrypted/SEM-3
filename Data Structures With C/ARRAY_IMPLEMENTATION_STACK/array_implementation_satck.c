#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#define SIZE 10

void push(int);
int pop();
bool isFull();
bool isEmpty();
int stackTop();

int stack[SIZE];
int top = -1;

int main(void)
{
	int ch,data;
	
	while(true)
	{	
		printf("\n======================");
		printf("\n1.Push Element");
		printf("\n2.Pop Stack");
		printf("\n3.Top Element");
		printf("\n4.Check Empty Stack");
		printf("\n5.Check Full Stack");
		printf("\n6.Exit");
		printf("\nChoose: ");
		scanf("%d", &ch);
		
		switch(ch)
		{
			case 1:
				printf("\nEnter the element to be pushed: ");
				scanf("%d", &data);
				push(data);
				break;
			case 2:
				printf("\nItem popped: %d", pop());
				break;
			case 3: 
				printf("\nStack top: %d", stackTop());
				break;
			case 4: 
				if(isEmpty)
					printf("\nStack is empty");
				else
					printf("\nStack is not empty");
				break;
			case 5: 
				if(isFull)
					printf("\nStack is full");
				else
					printf("\nStack is not full");
				break;
			case 6:
				exit(0);
			default: 
				printf("\nInvalid input, please try again");
		}

	}

	return 0;
}

void push(int dataIn)
{
	if(top == (SIZE-1))
	{
		printf("\nStack overflow");
	}
	else
	{
		stack[++top] = dataIn;
		printf("\nItem pushed sucessfully");
	}	
	return;
}
int pop()
{
	if(top == -1)
		printf("\nStack underflow");
	return stack[top--];
}
bool isFull()
{
	if(top == SIZE-1)
		return 1;
	else 
		return 0;
}
bool isEmpty()
{
	if(top == -1)
		return 1;
	else 
		return 0;
}
int stackTop()
{
	if(top == -1)
	{
		printf("\nStack underflow");
		return -1;
	}
	return stack[top];
}
