#include<stdio.h>
#include<conio.h>
#include<process.h>
#include<malloc.h>
struct node
{
int data;
struct node *next;
}
*top,*head,*temp;
void main()
{
void push();
void pop();
void printstack();
int ch;
head=(struct node*)malloc(sizeof(struct node));
head->next=NULL;
do
{
printf("\n\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
printf("Enter ur choice\t");
scanf("%d",&ch);
switch(ch)
{
case 1:
push();
break;
case 2:
pop();
break;
case 3:
printstack();
break;
case 4:
exit(0);
}
}
while(ch<=4);
getch();
}
void push()
{
temp=(struct node*)malloc(sizeof(struct node));
printf("Enter the data to push into the stack \t");
scanf("%d",&temp->data);
temp->next=head->next;
head->next=temp;
top=temp;
}
void pop()
{
if(head->next==NULL)
printf("Stack is empty\n");
else
{
temp=top;
printf("\n %d is popped from the stack\n",top->data);
top=top->next;
head->next=top;
free(temp);
}
}
void printstack()
{
if(head->next==NULL)
printf("Stack is empty\n");
else
{
temp=top;
printf("The elements in the stack are\n");
while(temp->next!=NULL)
{
printf("%d\t",temp->data);
temp=temp->next;
}
printf("%d", temp->data);
}
}
