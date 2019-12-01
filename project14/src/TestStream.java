import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStream {
    public static void main(String[] args)
    {
        File f = new File("C:\\DataCenter\\Coder\\How2J\\IOTest\\LOL2.txt");
        write(f);
        read(f);
        File f2 = new File("C:\\DataCenter\\Coder\\How2J\\IOTest\\LOL.lol");


        //对象流的练习
        Hero[] ha = new Hero[10];
        for(int i = 0;i<ha.length;i++)
        {
            ha[i] = new Hero();
            ha[i].hp = (float)i+300;
            ha[i].name = "英雄"+i;
        }
        try(FileOutputStream fos = new FileOutputStream(f2);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(f2);
                ObjectInputStream ois = new ObjectInputStream(fis);)
        {
            for(int i = 0;i<ha.length;i++) {
                oos.writeObject(ha[i]);
            }
            for(int i = 0;i<ha.length;i++)
            {
                Hero h = (Hero)ois.readObject();
                System.out.println(h.name+"\n"+h.hp);
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }
    public static void read(File f){
        try(FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);)
        {
            boolean b = dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();

            System.out.println("读取到的布尔值: "+b);
            System.out.println("读取到的整数: "+i);
            System.out.println("读取到的字符串: "+str);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
    public static void write(File f){
        try(FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);)
        {
            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeUTF("123 this is gareen");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
