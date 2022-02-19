#include "queue_functions.h"

int main(void)
{
	QUEUE *queue = NULL;
	Node *nextState = NULL;
	int ch = 0;
	char *dataIn = NULL;
	void *itemPtr = NULL;
	
	while(true)
	{
		printf("\n1.Create Queue  \t");
		printf("2.Enqueue       \t");
		printf("3.Dequeue       \t");
		printf("4.Queue count   \t");
		printf("5.Front element \t");
		printf("6.Rear element  \t");
		printf("\n7.Empty Queue   \t");
		printf("8.Full Queue    \t");
		printf("9.Display Queue \t");
		printf("10.Destroy Queue\t");
		printf("11.Exit         \t");
		printf("\nChoose: ");
		scanf("%d", &ch);
		
		switch(ch)
		{
			case 1:
				if(queue == NULL)
				{
					queue = createQueue();
					printf("\nQueue created successfully\n");
				}
				else
					printf("\nQueue already exists\n");
				break;
			case 2: 
				if(queue != NULL)
				{
					dataIn = (char*)malloc(sizeof(char)*20);
					printf("\nEnter the data to be enqueued: ");
					scanf("\r%[^\n]s", dataIn);
					if(enQueue(queue,dataIn))
						printf("\nEnqueued succefully\n");
					else 
						printf("\nQueue Overflow\n");
				}
				else
					printf("\nCreate a queue first\n");
				break;
			case 3: 
				if(queue != NULL)
				{
					if(deQueue(queue,&itemPtr))
					{
						printf("\ndeQueue %s\n", (char*)itemPtr);
						free(itemPtr);
					}	
					else
						printf("\nQueue underflow\n");
				}
				else
					printf("\nCreate a queue first\n");
				break;
			case 4:
				if(queue != NULL)
					printf("\nQueue Count %d\n",queueCount(queue));
				else
					printf("\nCreate a queue first\n");
				break;
			case 5: 
				if(queue != NULL)
				{
					if(queueFront(queue,&itemPtr))
						printf("\nQueueFront %s\n", (char*)itemPtr);
					else
						printf("\nQueue is empty\n");
				}
				else
					printf("\nCreate a queue first\n");
				break;
			case 6: if(queue != NULL)
				{
					if(queueRear(queue,&itemPtr))
						printf("\nQueueRear %s\n", (char*)itemPtr);
					else
						printf("\nQueue is empty\n");
				}
				else
					printf("\nCreate a queue first\n");
				break;
			case 7: 
				if(queue != NULL)
				{
					if(isEmpty(queue))
						printf("\nQueue is empty\n");
					else
						printf("\nQueue is not empty\n");
				}
				else
					printf("\nCreate a queue first\n");
				break;	
			case 8:
				if(queue != NULL)
				{
					if(isFull(queue))
						printf("\nQueue is full\n");
					else
						printf("\nQueue is not full\n");
				}
				else
					printf("\nCreate a queue first\n");
				break;	
			case 9:
				if(queue != NULL)
				{	
					if(queue->count == 0)
					{
						printf("\nQueue is empty, no items to display\n");
						break;	
					}
					nextState = queue->front;
					while(nextState != NULL)
					{
						//nextState = displayQueue(queue,nextState,&itemPtr);
						displayQueue(queue,&nextState,&itemPtr);
						printf("\n%s", (char*)itemPtr);
					}
					printf("\n");
				}
				else
					printf("\nCreate a queue first\n");
				break;	
			case 10: 
				if(queue != NULL)
				{
					queue = destoryQueue(queue);
					if(!queue)
						printf("\nQueue destroyed successfully\n");
				}
				else
					printf("\nCreate a queue first\n");
				break;
			case 11: 
				if(queue != NULL)
				{
					if(destoryQueue(queue) == NULL);
						printf("\nQueue destroyed successfully\n");
				}
				printf("\nExit\n\n");
				exit(0);
				default: printf("\nInvalid input. Please try again\n");
					continue;
		}
	}
	return 0;
}
