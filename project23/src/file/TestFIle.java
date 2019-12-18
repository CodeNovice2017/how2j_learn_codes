package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader; //使用字符流读取文件
import java.io.FileWriter;
import java.io.BufferedReader;//使用缓存流实现读一行
import java.io.BufferedWriter;
import java.io.DataOutputStream; //数据流读入布尔值,整数,字符串等
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TestFIle {
    public static void main(String[] args){
        File f = new File("C:\\DataCenter\\Coder\\How2J\\IOTest");
        search(f,"Magic");
    }
    public static void search (File folder,String search){
        if(folder.isFile()){
            if(folder.getName().toLowerCase().endsWith(".java")){
                //继承线程类的方法
//                StringThread st1 = new StringThread(folder,search);
//                st1.start();
                //匿名类的方法
                Thread t1 = new Thread(){
                    public void run(){
                        try(FileReader fr = new FileReader(folder);){
                            char[] cs = new char[(int)folder.length()];
                            fr.read(cs);
                            if(new String(cs).contains(search)){
                                System.out.println(folder);
                            }
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                    }
                };
                t1.start();
            }
        }
        else if(folder.isDirectory()){
            File[] fs = folder.listFiles();
            for(File temp:fs){
                search(temp,search);
            }
        }
    }
}
