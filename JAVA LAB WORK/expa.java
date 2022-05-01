import java.util.*;

public class expa {
    public static void main(String[] args) {
        int a = 50, b = 0;
        int[] arr = { 1, 5, 6, 7 };
        String s = "abc";
        try {
            // int data= (a/b);
            // int data2=arr[6];
            int i = Integer.parseInt(s);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
