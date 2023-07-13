package JavaSE.网络编程._3TCP通信;

import java.io.*;
import java.net.Socket;

public class _1客户端_双向通信_传字符串 {
    public static void main(String[] args) throws IOException {
        //创建“套接字”，指定服务器端的ip和端口号
        Socket s = new Socket("localhost",8888);

        //向服务器端发送消息
        OutputStream os = s.getOutputStream();//★返回值为OutputStream类型
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好Hello");
        //注：OutputStream没有直接发送String的方法，所以外面套了一个数据流

        //接收服务器端发送的反馈消息
        InputStream is = s.getInputStream();//★返回值为InputStream类型
        DataInputStream dis = new DataInputStream(is);
        String str= dis.readUTF();
        System.out.println("服务器端反馈："+str);

        //关闭流
        dis.close();
        dos.close();
        //关闭网络资源
        s.close();
    }
}
