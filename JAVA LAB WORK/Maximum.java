import java.util.*;
class Max
{
int a,b,c;
public void info()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number:");
a=sc.nextInt();
System.out.println("Enter 2nd number:");
b=sc.nextInt();
System.out.println("Enter 3rd number:");
c=sc.nextInt();
}
public int calc()
{
int max=((a>b)?(a>c?a:c):(b>c?b:c));
return max;
}
}
class Maximum
{
public static void main(String[] args)
{
Max obj=new Max();
obj.info();
int max=obj.calc();
System.out.println("Maximum of"+obj.a+","+obj.b+","+obj.c+"is"+max);
}
}
