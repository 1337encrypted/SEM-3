#include "queue_functions.h"

QUEUE* queueInitilize(QUEUE *queue)
{
	queue->front = NULL;
	queue->rear = NULL;
	queue->count = 0;
	return queue;
}

QUEUE* createQueue()
{
	QUEUE *queue = (QUEUE*)malloc(sizeof(QUEUE));
	
	if(queue)
		queue = queueInitilize(queue);
	return queue;
}

QUEUE* destoryQueue(QUEUE *queue)
{
	Node *deletePtr;
	
	if(queue)
		while(queue->front != NULL)
		{
			free(queue->front->dataPtr);
			deletePtr = queue->front;
			queue->front = queue->front->next;
			free(deletePtr);
		}
	free(queue);
	return NULL;
}

bool isFull()
{
	Node *temp = (Node*)malloc(sizeof(Node));
	if(temp)
	{
		free (temp);
		return false;
	}
	return true;
}

bool isEmpty(QUEUE *queue)
{
	return (queue->count == 0);
}

bool enQueue(QUEUE *queue, void *dataIn)
{
	Node *temp = (Node*)malloc(sizeof(Node));
	if(!temp)
		return false;
	temp->dataPtr = dataIn;
	temp->next = NULL;
	
	if(isEmpty(queue))
	{
		queue->front = temp;
		
	}
	else
	{
		queue->rear->next = temp;
	}
	(queue->count)++;
	queue->rear = temp;
	return true;
}

bool deQueue(QUEUE *queue, void **itemPtr)
{
	Node *deleteLoc;
	
	if(queue->count == 0)
		return false;

	*itemPtr = queue->front->dataPtr;
	deleteLoc = queue->front;

	if(queue->count == 1)
		queue = queueInitilize(queue);
	else
	{
		queue->front = queue->front->next;
		(queue->count)--;
	}
	//free(queue->front->dataPtr);
	free(deleteLoc);
	return true;
}

int queueCount(QUEUE *queue)
{
	return (queue->count);
}

bool queueFront(QUEUE *queue, void **itemPtr)
{
	if(queue->count == 0)
		return false;
	else
	{
		*itemPtr = queue->front->dataPtr;
		return true;
	}
}
bool queueRear(QUEUE *queue, void **itemPtr)
{
	if(queue->count == 0)
		return false;
	else
	{
		*itemPtr = queue->rear->dataPtr;
		return true;
	}
}
//Node* displayQueue(QUEUE *queue, Node *nextState, void **itemPtr)
void displayQueue(QUEUE *queue, Node **nextState, void **itemPtr)
{
	*itemPtr = (*nextState)->dataPtr;
	*nextState = (*nextState)->next;
	//return nextState;
}
