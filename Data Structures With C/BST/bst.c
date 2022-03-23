#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

typedef struct Node
{
	int data;
	struct Node *left;
	struct Node *right;
}Node;

Node* createNode(int);
Node* insert(Node* ,int);
bool search(Node* , int);
int findMin(Node*);
int findMax(Node*);
int findHeight(Node*);
int max(int,int);
void preOrder(Node*);
void postOrder(Node*);
void inOrder(Node*);

Node* createNode(int data)
{
	Node* newNode = (Node*)malloc(sizeof(Node));
	if(newNode == NULL)
	{
		printf("\nMalloc failure\n");
		return NULL;
	}
	newNode->data = data;
	newNode->left = newNode->right = NULL;
	return newNode;
}

Node* insert(Node *root,int data)
{
	if(root == NULL)	//empty tree
	{
		root = createNode(data);
	}
	else if(data <= root->data)
	{
		root->left = insert(root->left,data);
	}
	else
	{
		root->right = insert(root->right,data);
	}
	return root;
}

bool search(Node *root, int data)
{
	if(root == NULL)
		return false;
	if(data == root->data)
	{
		return true;
	}
	else if(data < root->data)
	{
		return search(root->left, data);
	}
	else
	{
		return search(root->right, data);
	}
}

int findMin(Node *root)
{
	if(root == NULL)
	{
		printf("\nTree is empty\n");
		return -1;
	}
	else if(root->left == NULL)
	{
		return root->data;
	}
	return findMin(root->left);
}

int findMax(Node *root)
{
	if(root == NULL)
	{
		printf("\nTree is empty\n");
		return -1;
	}
	else if(root->right == NULL)
	{
		return root->data;
	}
	return findMax(root->right);
}

int max(int a, int b)
{
	if(a>b)
		return a;
	else
		return b;
}

int findHeight(Node *root)
{
	if(root == NULL)
	{
		return -1;
	}
	return max(findHeight(root->left), findHeight(root->right))+1;
}

void preOrder(Node* root)
{
	if(root == NULL)
		return;
		
	printf("%d ", root->data);
	preOrder(root->left);
	preOrder(root->right);
}

void postOrder(Node* root)
{
	if(root == NULL)
		return;
		
	postOrder(root->left);
	postOrder(root->right);
	printf("%d ", root->data);
}

void inOrder(Node* root)
{
	if(root == NULL)
		return;
		
	inOrder(root->left);
	printf("%d ", root->data);
	inOrder(root->right);
}

int main(void)
{
	Node *root = NULL;
	int ch, data;
	
	while(true)
	{
		printf("\n1.Insert");
		printf("\t2.Delete");
		printf("\t3.Search");
		printf("\t4.Find min");
		printf("\t5.Find max");
		printf("\n6.Find Height");
		printf("\t7.Preorder");
		printf("\t8.Postorder");
		printf("\t9.Inorder");
		printf("\t10.Exit");
		printf("\nChoose: ");
		scanf("%d", &ch);
		
		switch(ch)
		{
			case 1:printf("\nEnter the data to be inserted: ");
				scanf("%d", &data);
				root = insert(root, data);
				break;
			case 2:
				break;
			case 3:printf("\nEnter the item to be searched: ");
				scanf("%d",&data);
				if(search(root, data))
					printf("\n%d found", data);
				else
					printf("\n%d not found\n", data);
				break;
			case 4:data = findMin(root);
				if(data != -1)
				{
					printf("Minimum element: %d\n", data);
				}
				break;
			case 5:data = findMax(root);
				if(data != -1)
				{
					printf("Maximum element: %d\n", data);
				}
				break;
			case 6://data = findHeight(root);
				printf("\nHeight: %d\n", findHeight(root));
				break;
			case 7: preOrder(root);
				printf("\n");
				break;
			case 8: postOrder(root);
				printf("\n");
				break;
			case 9: inOrder(root);
				printf("\n");
				break;		 
			case 10: exit(0);
			default: printf("\nInvalid case\n");
		}
	}
}

