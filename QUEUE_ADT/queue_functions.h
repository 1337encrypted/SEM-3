#ifndef QUEUE_FUNCTIONS
#define QUEUE_FUNCTIONS
#include "stdbool.h"
#include "stdlib.h"
#include "stdio.h"

//QUEUE ADT type definitions
typedef struct Node
{
	void *dataPtr;
	struct Node *next;
}Node;

typedef struct
{
	int count;
	Node *front;
	Node *rear;
}QUEUE;

//QUEUE ADT functions
QUEUE* queueInitilize(QUEUE *queue);
QUEUE* createQueue();
QUEUE* destoryQueue(QUEUE *queue);
bool isFull();
bool isEmpty(QUEUE *queue);
bool enQueue(QUEUE *queue, void *dataIn);
bool deQueue(QUEUE *queue, void **itemPtr);
int queueCount(QUEUE *queue);
bool queueFront(QUEUE *queue, void **itemPtr);
bool queueRear(QUEUE *queue, void **itemPtr);
//Node* displayQueue(QUEUE *queue, Node *nextState, void **itemPtr);
void displayQueue(QUEUE *queue, Node **nextState, void **itemPtr);
#endif
