package JavaSE.网络编程._3TCP通信;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//配合_2客户端运行
public class _4服务器端_保持一直运行状态 {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器开启");
        int count = 0;//计数
        ServerSocket ss = new ServerSocket(8888);
        while(true){//死循环，让服务器端一直保持开启
            Socket s = ss.accept();           //一直等待客户端发送信息
            new _4辅助服务器端线程(s).start(); //客户端一发来消息，运行子线程
            count++;
            System.out.println("现在是第"+count+"次被访问");
        }

        //服务器端需要一直开着，所以不需要关闭网络资源
    }
}
