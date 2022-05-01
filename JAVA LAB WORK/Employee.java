import java.util.*;
class Employee
{
int id;
String name;
int Salary;
void input()
{
System.out.println("Enter id of employee:");
id=sc.nextInt();
System.out.println("Enter Name:");
name=sc.nextLine();
System.out.println("Enter Salary of employee:");
Salary=sc.nextInt();
}
void display()
{
System.out.println("id is:"+id);
System.out.println("Name is:"+name);
System.out.println("Salary is:"+Salary);
}
}


