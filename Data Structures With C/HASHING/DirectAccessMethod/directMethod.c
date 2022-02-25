//Direct access method
#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

bool arr[1000] = {false};

bool search(int);
void insert(int);
void delete(int);

void insert(int key)
{
	arr[key] = true;
}

void delete(int key)
{
	arr[key] = false;
}


bool search(int key)
{
	return arr[key];
}


int main(void)
{
	int key,ch;
	bool state;
	
	while(true)
	{
		printf("\n1.Insert");
		printf("\t2.Delete");
		printf("\t3.Search");
		printf("\t4.Exit");
		printf("\nChoose: ");
		scanf("%d", &ch);
		
		if(ch == 4)
			exit(0);
		else
		{	printf("\n1.Enter the key: ");
			scanf("%d", &key);
		}
		
		switch(ch)
		{
			case 1:insert(key);
				break;
			case 2:delete(key);
				break;
			case 3:state = search(key);
				if(state)
					printf("\n%d is present\n", key);
				else
					printf("\n%d is absent\n", key);
				break;
			default: printf("\nInvalid key please try again\n");
				continue;
		}
	}
	return 0;
}
