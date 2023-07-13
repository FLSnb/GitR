package JavaSE.网络编程._4UDP通信;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class _1发送方_单向通信 {
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线喽~");

        //准备套接字，指定发送方的端口
        DatagramSocket ds = new DatagramSocket(1234);

        Scanner sc = new Scanner(System.in);
        //准备数据包
        System.out.print("学生想说：");
        String str = sc.next();
        byte[] bytes = str.getBytes();//将字符串转为byte字节数组
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"),5678);
                                             //字节数组，字节长度，接收方的ip，接收方的端口号
        //将数据包发送
        ds.send(dp);

        //接收反馈信息
        byte[] b = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(b,b.length);
        ds.receive(dp2);
        byte[] data = dp2.getData();
        String s = new String(data,0,dp2.getLength());//取出数组中的有效长度
        System.out.println("反馈信息为："+s);

        //关闭资源
        ds.close();
    }
}
