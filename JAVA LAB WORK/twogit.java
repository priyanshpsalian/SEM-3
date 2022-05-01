import java.io.*;
class twogit
{
public static void main(String[] args) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter Number");
int n= Integer.parseInt(br.readLine());
if(n>=10&&n<=99&&n<=-10&&n>=-99)
{
System.out.println("Number is two digit");
}
else
System.out.println("Number is not two digit");
}
}
