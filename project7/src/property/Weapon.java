package property;

public class Weapon extends Item{
    private Weapon(){}
    private static Weapon instance;
    public static Weapon getInstance(){
        if(null == instance)
        {
            instance = new Weapon();
        }
        return instance;
    }
    public boolean disposable(){
        return false;
    }

}
