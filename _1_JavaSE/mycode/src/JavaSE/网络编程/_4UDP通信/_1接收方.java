package JavaSE.网络编程._4UDP通信;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class _1接收方 {
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线了。。。。。");
        DatagramSocket ds = new DatagramSocket(5678);

        //准备一个空的数据包
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,b.length);
        ds.receive(dp);//接收传来的数据包信息
        byte[] data = dp.getData();//获取数据包里的信息
        String s = new String(data,0,dp.getLength());//取出数组中的有效长度
        System.out.println("发送的信息为："+s);

        //向学生反馈
        Scanner sc = new Scanner(System.in);
        System.out.print("回复学生：");
        String str = sc.next();
        byte[] bytes = str.getBytes();
        DatagramPacket dp2 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"),1234);
        ds.send(dp2);

        //关闭资源
        ds.close();
    }
}
