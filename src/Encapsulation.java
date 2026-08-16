package inheritance;

class One{
    int a=10;
    private String name="susmitha";
    int rollno=34;
    public One(){
        System.out.println("name is " + name);
    }
    private void details(){
        System.out.println("student name:" + name);
    } 
       
}


class Two extends One{
    void details(){
        System.out.println("student name" + super.name);
    }

}
public class Encapsulation {
    public static void main(String[] args) {
    One O=new One();  
    O.details();
    }
}
   
