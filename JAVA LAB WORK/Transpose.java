import java.util.*;
class Matrix
{
void display(int arr[][])
{
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
}
void transp(int arr[][])
{
int arr2[][]=new int[arr[0].length][arr.length];
for(int i=0;i<arr[0].length;i++)
{
for(int j=0;j<arr.length;j++)
{
arr2[i][j]=arr[j][i];
}
}
for(int i=0;i<arr[0].length;i++)
{
for(int j=0;j<arr.length;j++)
{
System.out.print(arr2[i][j]+"\t");
}
System.out.println();
}
}
}
class Transpose
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows:");
int row=sc.nextInt();
System.out.println("Enter number of columns:");
int col=sc.nextInt();
int[][]arr=new int[row][col];
System.out.println("Elements of matrix:");
for(int i=0;i<row;i++)
{
System.out.println("Enter elements of row"+i+":");
for(int j=0;j<col;j++)
{
System.out.print("Enter element"+j+":");
arr[i][j]=sc.nextInt();
}
}
Matrix t=new Matrix();
System.out.println("Matrix is:");
t.display(arr);
System.out.println("Transpose of Matrix is:");
t.transp(arr);
}
}


