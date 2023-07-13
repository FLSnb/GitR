package JavaSE.网络编程._3TCP通信;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class _2服务器端进阶 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();

        //接收客户端发送的消息
        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);//对象流
        _2用户帐号密码 one = (_2用户帐号密码) ois.readObject();//类型转换为用户对象
        System.out.println(one);

        //验证帐号密码
        boolean flag = false;
        if(one.getZH()==1 && one.getMM().equals("FLS")){
            flag = true;
        }

        //向客户端反馈帐号密码是否正确
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeBoolean(flag);

        //关闭流
        dos.close();
        ois.close();
        //关闭网络资源
        s.close();
        ss.close();
    }
}
