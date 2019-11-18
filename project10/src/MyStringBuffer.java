public class MyStringBuffer implements IStringBuffer{
    int capacity = 16;
    int length = 0;
    char[] value;

    //无参构造方法
    public MyStringBuffer(){
        value = new char[capacity];
    }
    //有参构造方法
    public MyStringBuffer(String str){
        this();
        if(str == null) {
            return;
        }
        if(capacity < str.length())
        {
            capacity = value.length*2;
            value = new char[capacity];
        }
        if(capacity >= str.length())
        {
            System.arraycopy(str.toCharArray(),0,value,0,str.length());
        }
        length = str.length();
    }
    @Override
    public void reverse(){
        char c;
        for(int i=0 ,j=length-1;i<j;i++,j--)
        {
            c = value[i];
            value[i] = value[j];
            value[j] = c;
        }
    }
//    @Override
//    public void reverse() {
//        for (int i = 0; i < length / 2; i++) {
//            char temp = value[i];
//            value[i] = value[length - i - 1];
//            value[length - i - 1] = temp;
//        }
//    }
    @Override
    public void append(String str) {
        // TODO Auto-generated method stub
        insert(length,str);

    }

    @Override
    public void append(char c) {
        // TODO Auto-generated method stub
        append(String.valueOf(c));
    }
    @Override
    public void insert(int pos, char b) {
        // TODO Auto-generated method stub
        insert(pos,String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) {
        // TODO Auto-generated method stub
        if(pos<0||pos>length)
        {
            return;
        }
        if(null==b)
        {
            return;
        }
        while(length+b.length()>capacity)
        {
            capacity = (int)((length+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value,0,newValue,0,length);
            value = newValue;
        }
        char[] cs = b.toCharArray();

        System.arraycopy(value,pos,value,cs.length+pos,length-pos);
        System.arraycopy(cs,0,value,pos,cs.length);
        length = cs.length+length;


    }

    @Override
    public void delete(int start) {
        // TODO Auto-generated method stub
        delete(start,length);
    }

    @Override
    public void delete(int start, int end) {
        // TODO Auto-generated method stub
        if(start<0)
            return;
        if(start>length)
            return;
        if(end<0)
            return;
        if(start >= end)
            return;
        System.arraycopy(value,end,value,start,length-end);
        length = length-(end-start);
    }
    @Override
    public int length(){
        return length;
    }
    @Override
    public String toString(){
        char[] realValue = new char[length];
        System.arraycopy(value,0,realValue,0,length);
        return new String(realValue);
    }
}
