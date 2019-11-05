package property;

public abstract class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }

    public void effect(){

        System.out.println("物品使用后，可以有效果");
    }

    public String toString(){
        return name+price;
    }

    public void finalize(){
        System.out.println("当前对象正在被回收:");
    }
    public boolean equals(Object o){
        if(o instanceof Item)
        {
            Item i = (Item) o;

            return this.price == i.price;
        }
        return false;
    }
    public abstract boolean disposable();
}
