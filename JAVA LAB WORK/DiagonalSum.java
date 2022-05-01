import java.util.*;
class DiagonalSum
{
public static void main(String args[])
{
int m,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of rows and columns:");
m=sc.nextInt();
n=sc.nextInt();
int[][]a=new int[m][n];
System.out.println("Enter elements of matrix:");
for(int i=0;i<=m-1;i++)
{
for(int j=0;j<=n-1;j++)
{
a[i][j]=sc.nextInt();
}
}
Matrix obj=new Matrix();
System.out.println("Matrix is:");
obj.display(a);
if(obj.square(m,n,a)==1)
{
System.out.println("It is a square matrix");
System.out.println("Sum of diagonal elements="+obj.diagonal(a));
}
}
}
class Matrix
{
void display(int[][] a)
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
int square(int m,int n,int[][] a)
{
if(m==n)
{
return 1;
}
else
{
System.out.println("It is not a square matrix");
System.exit(0);
return 0;
}
}
int diagonal(int[][] a)
{
int i,j,sum=0;
for(i=0;i<a.length;i++)
{
for(j=0;j<a[0].length;j++)
{
if(i==j)
{
sum=sum+a[i][j];
}
}
}
return sum;
}
}


