package JavaSE.网络编程._3TCP通信;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class _1服务器端 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);//服务器端只需指定端口号即可，需和客户端一致

        //阻塞方法，等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下运行
        Socket s = ss.accept();
        /*accept()返回值为一个Socket，这个Socket其实就是客户端的Socket，返回这个Socket以后，
          客户端和服务器才真正产生了连接，可以实现通信*/

        //接收客户端发送的消息
        InputStream is = s.getInputStream();//★返回值为InputStream类型
        DataInputStream dis = new DataInputStream(is);
        String str= dis.readUTF();
        System.out.println("客户端发来："+str);

        //向客户端反馈
        OutputStream os = s.getOutputStream();//★返回值为OutputStream类型
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("服务器端已成功接收！");

        //关闭流
        dos.close();
        dis.close();
        //关闭网络资源
        s.close();
        ss.close();
    }
}
