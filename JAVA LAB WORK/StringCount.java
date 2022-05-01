import java.io.*;
class StringCount
{
static String n;
static int l;
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 // Read the string
System.out.print("Enter a String : ");
n = br.readLine();
l = n.length();
find();
}
public static void find()
{
int a=0,b=0,c=0,d=0;
char ch;
for(int i=0;i<l;i++)
{
ch = n.charAt(i);
if(ch>='A' && ch<='Z') // Condition for Uppercase letters
a++;
if(ch>='a' && ch <='z')// Condition for Lowercase letters
b++;
if(ch>='0' && ch<='9')// Condition for Numbers
c++;
if(ch==' ') // Condition for spaces
d++;
}
System.out.println("\nNo. of Uppercase letters = " +a);
System.out.println("\nNo.of Lowercase letters = " +b);
System.out.println("\nNo. of Numerals = " +c);
System.out.println("\nNo. of Spaces = " +d);
System.out.println("\nNo. of Special Characters = "+(l-(a+b+c+d)));
}
}
