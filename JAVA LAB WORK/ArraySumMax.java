import java.util.*;
class ArraySumMax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements:");
int num=sc.nextInt();
int arr[]=new int[num];
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter the numbers:"+i);
arr[i]=sc.nextInt();
}
functions f=new functions();
System.out.println("Elements of array are:");
f.display(arr);
System.out.println("Sum of elements of array="+f.sum(arr));
System.out.println("Largest element is:"+f.max(arr));
}
}
class functions
{
void display(int arr[])
{
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
int sum(int arr[])
{
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
return sum;
}
int max(int arr[])
{
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
return max;
}
}
