import java.util.*;
public class Range
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter marks");
int marks = sc.nextInt();
if(marks>=0&& marks<=60)
{
System.out.println("Grade:F");
}
else if(marks>=61&& marks<=70)
{
System.out.println("Grade:D");
}
else if(marks>=71&& marks<=80)
{
System.out.println("Grade:C");
}
else if(marks>=81&& marks<=90)
{
System.out.println("Grade:B");
}
else if(marks>=91&& marks<=100)
{
System.out.println("Grade:A");
}
else
System.out.println("invalid marks input");
}
}

