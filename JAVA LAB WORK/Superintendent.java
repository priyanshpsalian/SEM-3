import java.util.*;
class PayOutOfBoundsException extends Exception
{
public PayOutOfBoundsException(String str)
{
System.out.println(str);
}
}
public class Superintendent
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Salary");
int salary= sc.nextInt();
try{
if(salary<25000 || salary>50000)
throw new PayOutOfBoundsException("Invalid salary");
else
System.out.println("Valid salary");
}
catch (PayOutOfBoundsException p){
System.out.println(p);
}
}
}
