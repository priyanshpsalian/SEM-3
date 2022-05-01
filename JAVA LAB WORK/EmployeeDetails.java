import java.lang.*;
import java.io.*;
import java.util.*;
class employee
{
int id; 
String name;
int Salary;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter ID");
id=sc.nextInt();
System.out.println("Enter Name");
name=sc.nextLine();
System.out.println("Enter Salary");
Salary=sc.nextInt();
}
void displayData()
{
System.out.println("Details are\nID:"+id+"\nName:"+name+"\nSalary:"+Salary);
}
}
class EmployeeDetails
{
public static void main(String[] args) throws IOException
{
System.out.println("Enter value:");
employee ep;
ep.getData();
ep.displayData();
}
}
