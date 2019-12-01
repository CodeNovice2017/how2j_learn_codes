import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class PracticeTest {
    public static void main(String[] args)
    {
        File tx = new File("C:\\DataCenter\\Coder\\How2J\\IOTest\\LOL.txt");
        removeComments(tx);
    }
    public static void removeComments(File javaFile)
    {
        int length = 0;
        try(FileReader fr = new FileReader(javaFile);BufferedReader br = new BufferedReader(fr);)
        {
            while(true)
            {
                String str = br.readLine();
                if(null == str)
                {
                    break;
                }
                else
                {
                    length++;
                }
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        String[] str2temp = new String[length];
        try(FileReader fr2 = new FileReader(javaFile);BufferedReader br2 = new BufferedReader(fr2))
        {
            String[] str2 = new String[length];
            for(int j = 0;j<str2.length;j++)
            {
                str2[j] = br2.readLine();
                if(str2[j].contains("//"))
                {
                    str2temp[j] = str2[j].replaceFirst("//","");
                }
                else
                {
                    str2temp[j] = str2[j];
                }
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        try(FileWriter fw = new FileWriter(javaFile);PrintWriter pw = new PrintWriter(fw))
        {
            for(int j = 0;j<length;j++)
            {
                pw.println(str2temp[j]);
                pw.flush();
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
//public class TestStream {
//
//    public static void removeComments(File javaFile) {
//        StringBuffer sb = new StringBuffer();
//        //读取内容
//        try (FileReader fr = new FileReader(javaFile); BufferedReader br = new BufferedReader(fr);) {
//            while (true) {
//                String line = br.readLine();
//                if (null == line)
//                    break;
//                //如果不是以//开头，就保存在StringBuffer中
//                if (!line.trim().startsWith("//"))
//                    sb.append(line).append("\r\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (
//                FileWriter fw = new FileWriter(javaFile);
//                PrintWriter pw = new PrintWriter(fw);
//        ) {
//            //写出内容
//            pw.write(sb.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        File javaFile = new File("E:\\project\\j2se\\src\\character\\MyStringBuffer2.java");
//        System.out.println(javaFile.exists());
//        System.out.println(javaFile.length());
//        removeComments(javaFile);
//    }
//}
