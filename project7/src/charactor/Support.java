package charactor;

public class Support extends LolHero implements Healer{
    @Override
    public void heal() {
    }
    public void attack(){
        heal();
    }
}
