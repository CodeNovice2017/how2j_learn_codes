import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;


public class PasswordTest {
    public static void main(String[] args)
    {
        File f = new File("C:/DataCenter/Coder/How2J/IOTest/encodingFile.txt");
        File f2 = new File("C:/DataCenter/Coder/How2J/IOTest/encodedFile.txt");
        encodeFile(f,f2);
    }
    public static void encodeFile(File encodingFile,File encodedFile)
    {
        char cs[] = new char[(int)encodingFile.length()];
        try(FileReader fr = new FileReader(encodingFile))
        {
            fr.read(cs);
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        for(int i = 0;i<cs.length;i++)
        {
                if(Character.isDigit(cs[i]))
                {
                    if(cs[i]=='9')
                    {
                        cs[i] = 0;
                    }
                    else
                    {
                        cs[i]+=1;
                    }
                }
                else if(Character.isUpperCase(cs[i]))
                {
                    if(cs[i] == 'Z')
                    {
                        cs[i] = 'A';
                    }
                    else
                        {
                            cs[i] += 1;
                        }
                }
                else if(Character.isLowerCase(cs[i]))
                {
                    if(cs[i] == 'z')
                    {
                        cs[i] = 'a';
                    }
                    else
                    {
                        cs[i] += 1;
                    }
                }

        }
        try(FileWriter fw = new FileWriter(encodedFile))
        {
            fw.write(cs);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
