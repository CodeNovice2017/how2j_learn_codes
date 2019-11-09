public class Spider extends Animal{
    String name;
    public Spider(){
        super(8);
    }
    @Override
    public void eat(){
        System.out.println(this.name+"吃");
    }
}
