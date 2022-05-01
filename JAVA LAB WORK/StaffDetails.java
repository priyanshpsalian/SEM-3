import java.util.Scanner;
class staff
{
Scanner sc=new Scanner(System.in);
String code()
{
System.out.println("Enter code of member:");
String code=sc.nextLine();
return code;
}
String name()
{
System.out.println("Enter name:");
String name=sc.nextLine();
return name;
}
String address()
{
System.out.println("Enter address:");
String address=sc.nextLine();
return address;
}
}
class teacher extends staff
{
String subject()
{
System.out.println("Enter subject taught by the teacher:");
String subject=sc.nextLine();
return subject;
}
String division()
{
System.out.println("Enter class of teacher:");
String division=sc.nextLine();
return division;
}
}
class officer extends staff
{
String grade()
{
System.out.println("Enter officer's grade:");
String grade=sc.nextLine();
return grade;
}
}
class typist extends staff
{
int speed()
{
System.out.println("Enter speed of typing:");
int speed=sc.nextInt();
return speed;
}
}
class regular extends typist
{
int salary()
{
System.out.println("Enter salary of typist:");
int salary=sc.nextInt();
return salary;
}
}
class adhoc extends typist
{
int dailyWage()
{
System.out.println("Enter Daily Wages:");
int dailyWage=sc.nextInt();
return dailyWage;
}
}
class StaffDetails
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int option=1;
int speed,salary,dailyWage;
String code,name,address,subject,division,grade;
while(option==1)
{
System.out.println("\n1.Teacher\n2.Officer\n3.Typist\n4.Exit\n");
System.out.println("Enter choice:");
int choice=sc.nextInt();
switch(choice)
{
case 1:
teacher t=new teacher();
code=t.code();
name=t.name();
address=t.address();
subject=t.subject();
division=t.division();
System.out.println("\n");
System.out.println("Code of teacher:"+code);
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Subject taught:"+subject);
System.out.println("Class:"+division);
break;
case 2:
officer o= new officer();
code=o.code();
name=o.name();
address=o.address();
grade=o.grade();
System.out.println("\n");
System.out.println("Code:"+code);
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Grade:"+grade);
break;
case 3:
System.out.println("1.Regular\n2.Ad hoc");
System.out.println("Enter choice:");
int choice1=sc.nextInt();
switch(choice1)
{
case 1:
regular r= new regular();
code=r.code();
name=r.name();
address=r.address();
speed=r.speed();
salary=r.salary();
System.out.println("\n");
System.out.println("Code:"+code);
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Speed of typing:"+speed);
System.out.println("Salary:"+salary);
break;
case 2:
adhoc a= new adhoc();
code=a.code();
name=a.name();
address=a.address();
speed=a.speed();
dailyWage=a.dailyWage();
System.out.println("\n");
System.out.println("Code:"+code);
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Speed of typing:"+speed);
System.out.println("Daily Wage:"+dailyWage);
break;
default:
System.out.println("Invalid choice");
}
break;
case 4:
System.out.println("Exit program\n");
option=2;
break;
default:
System.out.println("Invalid choice");
break;
}
}
}
}







