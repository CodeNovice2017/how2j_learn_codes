import java.io.*;
import java.util.Scanner;

public class AutoCreateClass {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Hero h1 = new Hero();
        System.out.println("请输入类的名称:");
        h1.name = s.nextLine();
        System.out.println("请输入属性的类型:");
        h1.propertyType = s.nextLine();
        System.out.println("请输入属性的名称:");
        h1.propertyName = s.nextLine();
        File f = new File("C:\\DataCenter\\Coder\\How2J\\IOTest\\lol.java");
        File f2 = new File("C:\\DataCenter\\Coder\\How2J\\IOTest\\temp.java");
        try(FileReader fis = new FileReader(f);
            BufferedReader br = new BufferedReader(fis);
            FileWriter fw = new FileWriter(f2);
            PrintWriter pw = new PrintWriter(fw);)
        {
            while(true) {
                String str = br.readLine();
                if (str!= null) {
                    String[] strA = str.split("@");
                    for(int i = 0;i<strA.length;i++) {
                        if (strA[i].equals("class")) {
                            pw.print(h1.name);
                        } else if (strA[i].equals("type")) {
                            pw.print(h1.propertyType);
                        } else if (strA[i].equals("property")) {
                            pw.print(h1.propertyName);
                        } else {
                            pw.print(strA[i]);
                        }
                    }
                }
                else
                    break;
            }
        }catch(IOException e)
        {
            System.out.println("读取结束");
        }
    }
}
