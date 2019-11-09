public class Fish extends Animal implements pet{
    private String name;
    protected Fish(int legs)
    {
        super(legs);
    }
    public void walk(){
        System.out.println("没有腿不能走");
    }
    public Fish(){
        super(0);
    };

    @Override
    public void eat(){
        System.out.println("大鱼吃小鱼");
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void play(){
        System.out.println("鱼正在玩");
    }


}
