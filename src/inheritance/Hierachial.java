package inheritance;

class College {
    void getCollegeName() {
        System.out.println("College name is: ANITS College");
    }
}

class Student1 extends College {
    void getStudentName() {
        System.out.println("Student name is: Prabhash");
    }
}

class Student2 extends College {
    void getStudentName() {
        System.out.println("Student name is: Anushka");
    }
}

class Student3 extends College {
    void getStudentName() {
        System.out.println("Student name is: Yash");
    }
}

public class Hierachial {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.getStudentName();

        Student2 s2 = new Student2();
        s2.getStudentName();
        s2.getCollegeName();

        Student3 s3 = new Student3();
        s3.getStudentName();

        College s4=new Student1();
        s4.getCollegeName();
    }
}
