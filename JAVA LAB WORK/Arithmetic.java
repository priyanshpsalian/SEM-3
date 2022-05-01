import calculate.*;
import java.util.*;
class Arithmetic
{
public static void main(String args[])
{
Add a=new Add();
Subtract b=new Subtract();
Multiply c=new Multiply();
Divide d=new Divide();
int n1=0,n2=0;
int input;
int flag=0;
Scanner sc=new Scanner(System.in);
while(flag==0)
{
System.out.println("\n1.Add\n2.Subtract\n3.Multiply\n4.Subtract\n5.Exit");
System.out.print("\nEnter Choice:");
input=sc.nextInt();
if(input!=5)
{
System.out.println("\na=");
n1=sc.nextInt();
System.out.print("\nb=");
n2=sc.nextInt();
}
switch(input)
{
case 1:
System.out.println("\n"+n1+"+"+n2+"="+a.add(n1,n2));
break;
case 2:
System.out.println("\n"+n1+"-"+n2+"="+b.subtract(n1,n2));
break;
case 3:
System.out.println("\n"+n1+"*"+n2+"="+c.multiply(n1,n2));
break;
case 4:
System.out.println("\n"+n1+"/"+n2+"="+d.divide(n1,n2));
break;
case 5:
flag=-1;
System.out.println("\nExit");
break;
default:
System.out.println("\nInvalid Integer");
break;
}
}
}
}

