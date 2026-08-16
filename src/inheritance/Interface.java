package inheritance;

interface Cinema {
    void filmindustry();
    void tollywood();
}
interface Director {
    void storywriter();
    void Actionmovies();
}
class Hero implements Director,Cinema{
    String hero;
    public Hero(String hero){
        this.hero=hero;
    }
    @Override
    public void filmindustry(){
        System.out.println("Annapurna");
    }
    @Override
    public void tollywood(){
        System.out.println("telugu films");
    }
    @Override
    public void storywriter(){
        System.out.println("storywriter: sudhamurthy" );
    }
    @Override
    public void Actionmovies(){
        System.out.println("PARADISE");
    }

    void heroine(){
       System.out.println("srinidhi shetty");
    }
}

public class Interface {
    public static void main(String[] args) {
        Hero h=new Hero("NANI");
        h.heroine();
        h.Actionmovies();
        h.filmindustry();
        h.tollywood();
        h.storywriter();
    }
}
