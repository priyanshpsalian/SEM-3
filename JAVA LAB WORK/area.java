import java.util.Scanner;

class ans {
    static int ans1(int a) {
        return a * a;
    }

    static int ans1(int a, int b) {
        return a * b;
    }

    static double ans1(double r) {
        return (22 * r * r) / 7;
    }

    static double ans1(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double w = (s * (s - a) * (s - b) * (s - c));
        double q = Math.sqrt(w);
        return q;
    }
}

class area {
    public static void main(String args[]) {
        int a, b, c, k = 1;
        double r, j;
        ans g = new ans();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Main Menu");

            System.out.println("1.Find area of Square");
            System.out.println("2.Find area of Rectangle");
            System.out.println("3.Find area of Circle");
            System.out.println("4.Advance Triangle");
            System.out.println("5.Exit");
            int n = sc.nextInt();
            switch (n) {
            case 1:
                System.out.println("Enter the lenght of square");
                a = sc.nextInt();

                b = g.ans1(a);
                System.out.println("Area of square is " + b);
                break;
            case 2:
                System.out.println("Enter the lenght of rectangle");
                a = sc.nextInt();
                System.out.println("Enter the breadth of rectangle");
                b = sc.nextInt();

                c = g.ans1(a, b);
                System.out.println("Area of rectangle is " + c);
                break;
            case 3:
                System.out.println("Enter the radius of circle");
                r = sc.nextInt();

                j = g.ans1(r);
                System.out.println("Area of circle is " + j);
                break;
            case 4:
                System.out.println("Enter the lenght of side 1 of triangle");
                a = sc.nextInt();
                System.out.println("Enter the lenght of side 2 of triangle");
                b = sc.nextInt();
                System.out.println("Enter the lenght of side 3 of triangle");
                c = sc.nextInt();

                j = g.ans1(a, b, c);
                System.out.println("Area of triangle is " + j);
                break;
            case 5:
                k = 2;

            }

        } while (k != 2);

    }
}