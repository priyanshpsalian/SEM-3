class Staff{
    int code;
    String name,address;

    Staff(int code,String name,String address){
        this.code=code;
        this.name=name;
        this.address=address;
    }
    void staffPrint(){
        System.out.println("Code : "+code+"\nName : "+name+"\nAddress : "+address);
    }
}

class Teacher extends Staff{
    String subject,Class;

    Teacher(int code,String name,String address,String subject,String Class){
        super(code, name, address);
        this.subject=subject;
        this.Class=Class;
    }
    void print(){
        staffPrint();
        System.out.println("Subject : "+subject+"\nClass : "+Class+"\n");
    }
}

class Officer extends Staff{
    String grade;

    Officer(int code,String name,String address,String grade){
        super(code, name, address);
        this.grade=grade;
    }
    void print(){
        staffPrint();
        System.out.println("Grade : "+grade+"\n");
    }
}

class Typist extends Staff{
    int speed;
    Typist(int code,String name,String address,int speed){
        super(code, name, address);
        this.speed=speed;    
    }
    void typistPrint(){
        staffPrint();
        System.out.println("Speed : "+speed);
    }
}

class Regular extends Typist{
    int basic_pay;
    Regular(int code,String name,String address,int speed,int basic_pay){
        super(code, name, address, speed);
        this.basic_pay=basic_pay;
    }
    void print(){
        typistPrint();
        System.out.println("Basic Pay : "+basic_pay+"\n");
    }
}

class Ad_Hoc extends Typist{
    int basic_pay;
    Ad_Hoc(int code,String name,String address,int speed,int basic_pay){
        super(code, name, address, speed);
        this.basic_pay=basic_pay;
    }
    void print(){
        typistPrint();
        System.out.println("Basic Pay : "+basic_pay+"\n");
    }
}


public class CollegeInheritance {
    public static void main(String[] args) {
        int code,speed,basicPay;
        String name,address,subject,Class,grade;
        code=234;
        name="Alex";
        address="B-13,Oli building,Malad West";
        subject="Maths";
        Class="C3";

        Teacher t1 = new Teacher(code, name, address, subject, Class);
        code=235;
        name="Bina";
        address="A-123,Oli building,Malad West";
        subject="Maths";
        Class="C3";
        grade="A";

        Officer o1 = new Officer(code, name, address, grade);
        code=236;
        name="Ram";
        address="B-13453,Oasis building,Malad West";
        subject="Maths";
        Class="C3";
        speed=89;
        basicPay=30000;

        Regular r1 = new Regular(code, name, address, speed, basicPay);
        code=224;
        name="Bro";
        address="B-1563,Mina building,Malad West";
        subject="Maths";
        Class="C3";
        speed=56;
        basicPay=40000;

        Ad_Hoc a1 = new Ad_Hoc(code, name, address, speed, basicPay);

        t1.print();
        o1.print();
        r1.print();
        a1.print();
    }
}
