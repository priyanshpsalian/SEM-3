import java.util.Scanner;
class Area
{
public int area(int s)
{
return s*s;
}
public double area(double l,double b)
{
return l*b;
}
public double area(double r)
{
return 3.14*r*r;
}
}
class Shapes
{
public static void main(String []args)
{
int s;
double l,b,r;
Area obj=new Area();
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of side of the square:");
s=sc.nextInt();
System.out.println("Area of square="+obj.area(s));

System.out.println("Enter length and breadth of rectangle:");
l=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Area of rectangle="+obj.area(l,b));

System.out.println("Enter radius of the circle:");
r=sc.nextDouble();
System.out.println("Area of circle="+obj.area(r));
}
}
