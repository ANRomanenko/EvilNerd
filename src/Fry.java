public class Fry {
private String movieName;
    public Fry(String name){
        movieName = name;
    }
    public void serName(String name){
        movieName = name;
    }
    public String getName(){
        return movieName;
    }
    public void output(){
        System.out.printf("Твой любимый фильм - %s", getName());
        System.out.println();
    }
}
