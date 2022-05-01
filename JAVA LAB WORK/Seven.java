import java.util.*;
public class Seven
{
public static void main(String args[])
{
int i,sum=0,num=0;
System.out.println("Numbers divisible by 7 are:");
for(i=100;i<=200;i++);
{
if(i%7==0)
{
num++;
System.out.println(i+" ");
sum= sum+i;
}
}
System.out.println("Sum="+sum);
}
}

