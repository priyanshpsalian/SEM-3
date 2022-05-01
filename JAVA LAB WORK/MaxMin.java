import java.util.*;
class MaxMin
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
if((a>b)&&(a>c))
{
System.out.println(a+"is maximum");
}
else if((b>a)&&(b>c))
{
System.out.println(b+"is maximum");
}
else
{
System.out.println(c+"is maximum");
}

if((a<b)&&(a<c))
{
System.out.println(a+"is minimum");
}
else if((b<a)&&(b<c))
{
System.out.println(b+"is minimum");
}
else
{
System.out.println(c+"is minimum");
}
}
}


