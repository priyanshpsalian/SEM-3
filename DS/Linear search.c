#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#define size 10
void main()
{
int arr[size],n,i,num,found=0;
printf("\n Enter the number of elements:");
scanf("%d",&n);
printf("Enter elements:");
for(i=0;i<n;i++)
scanf("%d",&arr[i]);
printf("\nEnter the element to be searched:\n");
scanf("%d",&num);
for(i=0;i<n;i++)
{
if(arr[i]==num)
{
found=1;
printf("Found at %d",i+1);
break;
}
}
if(found==0)
{
printf("Element not found");
return;
}
}
