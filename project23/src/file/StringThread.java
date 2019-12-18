package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringThread extends Thread {
    private File folder;
    private String search;
    public StringThread(File folder,String search){
        this.folder = folder;
        this.search = search;
    }
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
}
