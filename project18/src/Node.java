public class Node {
    public Node LeftNode;
    public Node RightNode;
    public Object value;

    public void add(Object v){
        if(null == value) {
            System.out.println("根节点为空,插入根节点位置");
            value = v;
        }
        else{
            if((Integer)v - ((Integer)value)<=0){
                if(null == LeftNode){
                    System.out.println("待插入值小于当前子节点,且子节点左节点为空,插入左节点位置");
                    LeftNode = new Node();
                }
                LeftNode.add(v);
            }
            else{
                if(null == RightNode){
                    System.out.println("待插入值大于当前子节点,且子节点右节点为空,插入右节点位置");
                    RightNode = new Node();
                }
                RightNode.add(v);
            }
        }
    }
    public void  MidTravel(Node e){
        if(null == e){ //这里是绝对不能加System.out.println的,因为Java是不允许输出空指针的,而且本身e为空怎么可能输出其值呢
            return;
        }
        MidTravel(e.LeftNode);
        System.out.println((Integer)e.value);
        MidTravel(e.RightNode);

    }
}
