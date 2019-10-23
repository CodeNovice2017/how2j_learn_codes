package property;

public class Weapon {
    private Weapon(){}
    private static Weapon instance;
    public static Weapon getInstance(){
        if(null == instance)
        {
            instance = new Weapon();
        }
        return instance;
    }

}
