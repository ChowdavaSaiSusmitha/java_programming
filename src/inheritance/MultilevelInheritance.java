package inheritance;

class College{
    void getCollegeName(){
         System.out.println("College name is: ANITS College");
    }
}

class Department extends College{
    void getDepartmentName(){
        System.out.println("Department name is: CSE(AIML)");
    }
}

class Student extends Department{
    void getStudentName(){
        System.out.println("Student name is: sushant singh rajput");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.getCollegeName();
        s.getDepartmentName();
        s.getStudentName();
    }
}
