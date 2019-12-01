import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class TestStream {

    public static void main(String[] args) {
        File f = new File("C:\\DataCenter\\Coder\\How2J\\IOTest\\encodedFile.txt");
        try(FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);)
        {
            while(true)
            {
                String str = br.readLine();
                if(str == null)
                {
                    break;
                }
                System.out.println(str);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}

