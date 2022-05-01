#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#define size 10
int smallest(int arr[],int k,int n);
void selection_sort(int arr[],int n);
void main()
{
int arr[size],n,i,num,start,end,mid,found=0;
printf("\n Enter the number of elements:");
scanf("%d",&n);
printf("Enter elements:");
for(i=0;i<n;i++)
scanf("%d",&arr[i]);
selection_sort(arr,n);
printf("The sorted array is:\n");
for(i=0;i<n;i++)
printf("%d\t",arr[i]);
printf("\nEnter the element to be searched:\n");
scanf("%d",&num);
start=0;
end=n-1;
while(start<=end)
{
mid=(start+end)/2;
if(arr[mid]==num)
{
printf("Found at %d",mid+1);
found=1;
break;
}
else if(arr[mid]>num)
end=mid-1;
else
start=mid+1;

}
if(start>end && found==0)
{
printf("Element not found");
return;
}
}
int smallest(int arr[],int k,int n)
{
int pos=k,small=arr[k],i;
for(i=k+1;i<n;i++)
{
if(arr[i]<small)
{
small=arr[i];
pos=i;
}
}
return pos;
}
void selection_sort(int arr[],int n)
{
int k,pos,temp;
for(k=0;k<n;k++)
{
pos=smallest(arr,k,n);
temp=arr[k];
arr[k]=arr[pos];
arr[pos]=temp;
}
}

