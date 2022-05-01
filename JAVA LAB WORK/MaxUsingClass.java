import java.util.Scanner;
class result{
    int a,b,c;
    public void enterNum(){
        System.out.println("Enter any three numbers to be compared:");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
    }
    public int largestNum(){
        if(a>b && b>=c){
            return a;
        }
        else if(b>a && a>=c){
            return b;
        }
        else{
            return c;
        }
    }
}
public class MaxUsingClass {
    public static void main(String[] args) {
        result r = new result();
        r.enterNum();
        int max = r.largestNum();
        System.out.println("Maximum of the numbers entered is: "+max);

    }
}

