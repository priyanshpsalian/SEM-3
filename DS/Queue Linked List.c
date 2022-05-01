#include<stdio.h>
#include <stdlib.h>
struct QueueNode
{
int data;
struct QueueNode *next;
};
typedef struct QueueNode node;
node *front = NULL;
node *rear = NULL;

node* createNode()
{
node *temp;
temp = (node *) malloc(sizeof(node)) ;
printf("\n Enter data to enqueue : ");
scanf("%d", &temp -> data);
temp -> next = NULL;
return temp;
}
void enQueue()
{
node *newnode;
newnode= createNode();
if(front == NULL)
{
front = newnode;
rear = newnode;
}
else
{
rear -> next = newnode;
rear=newnode;
}
printf("\n\n Data added to the Queue..");
}
void deQueue()
{
node *temp;
if(front == NULL)
{
printf("\n\n\t Empty Queue..");
return;
}

temp = front;
front = front -> next;
printf("\n\n\t Deleted element from queue is %d ", temp -> data);
free(temp);
}
void displayQ()
{
node *temp;
if(front == NULL)
{
printf("\n\n\t\t Empty Queue ");
}
else
{
temp = front;
printf("\n\n\n\t\t Elements in the Queue are: ");
while(temp != NULL)
{
printf("%5d ", temp -> data);
temp = temp -> next;
}
}
}
int main()
{
int n;
while(1)
{
printf("\n\n Linked list implementation of Queue operations ");
printf("\n ----------------------------------------------\n");
printf("\n 1. Enqueue ");
printf("\n 2. Dequeue ");
printf("\n 3. Display");
printf("\n 4. Quit ");
printf("\n Enter your choice: ");
scanf("%d", &n);
switch(n)
{
case 1 :
enQueue();
break;
case 2 :
deQueue();
break;
case 3 :
displayQ();
break;
case 4:
return;
}
}
}
