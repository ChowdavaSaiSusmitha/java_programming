package inheritance;

class Cinema{
    void director(String hero,String cheoreographer){
        System.out.println("hero" + hero + "cheoreographer" + cheoreographer);
    }
}

class Industry{
    void director(String hero,String cheoreographer,String editor){
        System.out.println("hero" + hero + "cheoreographer" + cheoreographer + "editor" + editor);
    }
}
public class Oops {
    public static void main(String[] args) {
       Industry i=new Industry();

    }

}
