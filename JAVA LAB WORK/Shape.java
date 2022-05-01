import java.util.Scanner;
class Area
{
public Area(int s)
{
System.out.println("Area of square="+s*s);
}
public Area(double l,double b)
{
System.out.println("Area of rectangle="+l*b);
}
public Area(double r)
{
System.out.println("Area of circle="+3.14*r*r);
}
}
class Shape
{
public static void main(String []args)
{
int s;
double l,b,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of side of square:");
s=sc.nextInt();
Area obj=new Area(s);

System.out.println("Enter length and breadth of rectangle:");
l=sc.nextDouble();
b=sc.nextDouble();
Area obj1=new Area(l,b);

System.out.println("Enter radius of circle");
r=sc.nextDouble();
Area obj2=new Area(r);
}
}
