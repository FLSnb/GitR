package JavaSE.网络编程._3TCP通信;

import java.io.*;
import java.net.Socket;

public class _4辅助服务器端线程 extends Thread{
    Socket s = null;
    public _4辅助服务器端线程(Socket s){//构造方法
        this.s = s;
    }

    InputStream is = null;
    ObjectInputStream ois = null;
    _2用户帐号密码 one = null;
    OutputStream os = null;
    DataOutputStream dos = null;

    @Override
    public void run(){
        try {
            is = s.getInputStream();
            ois = new ObjectInputStream(is);
            one = (_2用户帐号密码) ois.readObject();
            System.out.println(one);

            boolean flag = false;
            if(one.getZH()==1 && one.getMM().equals("FLS")){
                flag = true;
            }

            os = s.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeBoolean(flag);

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                dos.close();
                ois.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
