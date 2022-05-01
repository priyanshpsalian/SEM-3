import java.util.Scanner;

class staff {
    int code;
    String name, address;

}

class teacher extends staff {
    String subject;
    String Class;

}

class typist extends staff {
    double speed;
}

class officer extends staff {
    String grade;
}

class regular extends typist {
    int basicpay;
}

class ad_hoc extends typist {
    int basicpay;

}

public class inheritance {
    public static void main(String args[]) {
        int n,k;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Main Menu");

            System.out.println("1.Enter data");
            System.out.println("2.Display data");

            System.out.println("5.Exit");
            n = sc.nextInt();
            switch (n) {
            case 1:
                staff st = new staff();

                System.out.println("Enter the name of staff member");
                st.name = sc.nextLine();

                System.out.println("Enter the code of staff member");
                st.code = sc.nextInt();
                System.out.println("Enter the Address of staff member");
                st.address = sc.nextLine();
                
                System.out.println("Enter the profession of staff member");

                System.out.println("1.Teacher");
                System.out.println("2.Typist");
                System.out.println("3.Officer");

                int m = sc.nextInt();
                switch (m) {
                case 1:
                    teacher te = new teacher();
                    System.out.println("Enter the subject what teacher teaches");
                    te.subject = sc.nextLine();

                    System.out.println("Enter the class to which  teacher teaches");
                    te.Class = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Enter the speed of the typist");
                    typist ty = new typist();
                    ty.speed = sc.nextInt();
                    System.out.println("Enter the type of typist");
                    System.out.println("1.Regular");
                    System.out.println("2.Ad-Hoc");
                    int b = sc.nextInt();
                    switch (b) {
                    case 1:
                        regular re = new regular();
                        System.out.println("Enter basic pay of typist");
                        re.basicpay = sc.nextInt();
                        break;
                    case 2:
                        ad_hoc ad = new ad_hoc();
                        System.out.println("Enter basic pay of typist");
                        ad.basicpay = sc.nextInt();
                        break;

                    }
                    break;
                case 3:
                    officer of = new officer();
                    System.out.println("Enter the grade of Officer");
                    of.grade = sc.nextLine();
                    break;

                }
            break;    
            case 2:
            break;
                

            case 5:
                k = 2;

            }
            break;

        } while (k != 2);

    }

}
