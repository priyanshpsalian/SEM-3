import java.util.Scanner;
class Employee
{
int id;
String name;
int hours;
}
class Wages
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of employees:");
int n=sc.nextInt();
Employee ep[]= new Employee[n];
for(int i=0;i<n;i++)
{
ep[i]=new Employee();
System.out.println("Enter"+(i+1)+"Employee data:");
System.out.println("Enter id:");
ep[i].id=sc.nextInt();
System.out.println("Enter name:");
ep[i].name=sc.next();
System.out.println("Enter no of Hours:");
ep[i].hours=sc.nextInt();
}
int a=ep[0].hours;
int max=0;
System.out.println("\nDetails are:\n");
System.out.println("ID\tName\tHours\tSalary\n");
for(int i=0;i<n;i++)
{
System.out.println(ep[i].id+"\t"+ep[i].name+"\t"+ep[i].hours+"\t"+ep[i].hours*100);
}
for(int i=1;i<n;i++)
{
if(ep[i].hours>a&&ep[i].hours>ep[max].hours)
{
max=i;
}
}
System.out.println("ID:"+ep[max].id);
System.out.println("Name:"+ep[max].name);
System.out.println("Hours:"+ep[max].hours);
}
}







