package Character;

public class Hero implements LOL {
    public String name;
    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }
    public String toString(){
        return this.name;
    }
}
