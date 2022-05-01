#include<stdio.h>
#include<malloc.h>
typedef struct node
{
int data;
struct node*left;
struct node*right;
}NODE;
void preorder(NODE*root)
{
if(root!=NULL)
{
printf("%d",root->data);
preorder(root->left);
preorder(root->right);
}
}
void postorder(NODE*root)
{
if(root!=NULL)

{
postorder(root->left);
postorder(root->right);
printf("%d",root->data);
}
}
void inorder(NODE*root)
{
if(root!=NULL)
{
inorder(root->left);
printf("%d",root->data);
inorder(root->right);
}
}
NODE * insert(NODE *root,int x)
{
NODE *ptr,*prev,*p;
ptr=(NODE*)malloc(sizeof(NODE));
if(ptr==NULL)
{

printf("FULL\n");
return root;
}
ptr->data=x;
ptr->left=NULL;
ptr->right=NULL;
if(root==NULL)
{
root=ptr;
return root;
}
prev=NULL;
p=root;
while(p!=NULL)
{
prev=p;
if(x>p->data)
p=p->right;
else if(x<p->data)
p=p->left;
else

break;
}
if(p!=NULL)
{
printf("DUPLICATE VALUES NOT ALLOWED\n");
return root;
}
else{
if(x>prev->data)
prev->right=ptr;
else
prev->left=ptr;
return root;

}
}
NODE *mirror(NODE*root)
{
NODE *p,*temp;
p=root;
if(p!=NULL)

{
mirror(p->left);
mirror(p->right);
temp=p->left;
p->left=p->right;
p->right=temp;

}return p;
}
int height(NODE*root)
{
int heightl=0,heightr=0;
NODE *p;
p=root;
if(p==NULL)
return 0;
if(p->left==NULL && p->right==NULL)
return 0;
else{
heightl=height(p->left);
heightr=height(p->right);

if(heightl>heightr)
return heightl+1;
else
return heightr+1;
}

}
NODE *del(NODE*root,int key)
{

NODE *p,*prev,*q,*preq;
p=root;
while(p!=NULL && p->data!=key)
{
prev=p;
if(key>p->data)
p=p->right;
else
p=p->left;
}
if(p==NULL)

{
printf("key not found\n");
return root;
}
if(p->left==NULL && p->right==NULL)
{
if(root==p)
root=NULL;
else if(prev->left==p)
prev->left=NULL;
else
prev->right=NULL;
free(p);
return root;
}
else if(p->left!=NULL && p->right==NULL)
{
if(p==root)
{
root=p->left;
p->left=NULL;

}
else if(prev->left==p)
{
prev->left=p->left;
prev->left=NULL;
}
else{
prev->right=p->left;
p->left=NULL;
}
free(p);
return root;
}
else if(p->left==NULL && p->right!=NULL)
{
if(p==root)
{
root=p->right;
p->right=NULL;
}
else if(prev->left==p)

{
prev->left=p->right;
p->right=NULL;
}
else{
prev->right=p->right;
p->right=NULL;
}
free(p);
return root;
}
else{
q=p->right;
while(q->left!=NULL)
{
preq=NULL;
q=q->left;
}
p->data=q->data;
if(q==p->right)
{

p->right=q->right;
}
else
preq->left=q->right;
q->right=NULL;
}free(q);
return root;
}
void main()
{
int option,p,m=0;
//NODE *l;
NODE *root=NULL;
do
{
printf("\n 1.insert\n 2.delete\n 3.preorder\n 4.postorder\n 5.inorder\n 6.height\n 7.mirror\n 8.quit");
printf("\n Enter choice:");
scanf("%d",&option);
switch(option)
{
case 1:printf("enter value\n");
scanf("%d",&p);
root=insert(root,p);
break;
case 2:printf("enter value\n");
scanf("%d",&p);
root=del(root,p);
break;
case 3:preorder(root);
break;
case 4:postorder(root);
break;
case 5:inorder(root);
break;
case 6: m=height(root);
if(m==0)
printf("height=0");
else
printf("height=%d",m);
break;
case 7:root=mirror(root);
printf("tree is mirrored\n");
printf("inorder traversal\n");
inorder(root);
break;
case 8:
break;
default:printf("Invalid option");
break;

}

}while(option!=8);
}
