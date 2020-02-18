package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        try {
            Socket s = new Socket("127.0.0.1", 8888);
            SendThread st = new SendThread(s);
            st.start();
            ReceiveThread rt = new ReceiveThread(s);
            rt.start();
        }catch(UnknownHostException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
class SendThread extends Thread{
    private Socket s;
    public SendThread(Socket s){
        this.s = s;
    }
    public void run(){
        try{
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            while(true){
                Scanner ws = new Scanner(System.in);
                String str = ws.next();
                dos.writeUTF(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
class ReceiveThread extends Thread{
    private Socket s;
    public ReceiveThread(Socket s){
        this.s = s;
    }
    public void run(){
        try{
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while(true) {
                String str = dis.readUTF();
                System.out.println(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
