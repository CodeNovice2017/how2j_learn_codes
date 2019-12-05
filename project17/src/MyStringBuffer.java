import java.util.ArrayList;

public class MyStringBuffer implements IStringBuffer {
    ArrayList  value;
    public MyStringBuffer(){
        value = new ArrayList();
    }
    public MyStringBuffer(String str){
        this();
        if(str == null)
        {
            return;
        }
        char[] cs = str.toCharArray();
        for(int i=0;i<cs.length;i++)
        {
            value.add(cs[i]);
        }
    }
    @Override
    public void append(String str)
    {
        ArrayList stra = new ArrayList();

    }
    @Override
    public void append(char c){}
    @Override
    public void insert(int pos , char b){}
    @Override
    public void insert(int pos , String b){
        if(pos<0||pos>value.size())
        {
            return;
        }
        if(null == b)
        {
            return;
        }
        char[] cs = b.toCharArray();
        for(int i=0;i<cs.length;i++)
        {
            value.add(pos+i,cs[i]);
        }

    }
    @Override
    public void delete(int start,int end){}
    @Override
    public void reverse(){}
    @Override
    public int length(){
        return value.size();
    }
}
