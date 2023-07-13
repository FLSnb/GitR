package JavaSE.网络编程._4UDP通信;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class _2接收方 {
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线了。。。。。");
        DatagramSocket ds = new DatagramSocket(5678);
        while (true){
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b,b.length);
            ds.receive(dp);
            byte[] data = dp.getData();
            String s = new String(data,0,dp.getLength());
            System.out.println("发送的信息为："+s);

            Scanner sc = new Scanner(System.in);
            System.out.print("回复学生：");
            String str = sc.next();
            byte[] bytes = str.getBytes();
            DatagramPacket dp2 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"),1234);
            ds.send(dp2);
            if(str.equals("白白")){
                break;
            }
        }
        //无需关闭资源 ds.close();
    }
}
