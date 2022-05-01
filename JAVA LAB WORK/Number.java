import java.util.*;
class IntegerException extends Exception
{
public IntegerException(String str)
{
System.out.println(str);
}
}
public class Number
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
int number= sc.nextInt();
try{
if(number==5 || number==6 || number==7)
System.out.println("Valid integer");
else
throw new IntegerException("Invalid integer");
}
catch (IntegerException i)
{
System.out.println(i);
}
}
}