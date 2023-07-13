package JavaSE.网络编程._4UDP通信;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class _2发送方_正常聊天 {
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线喽~");
        DatagramSocket ds = new DatagramSocket(1234);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("学生想说：");
            String str = sc.next();
            byte[] bytes = str.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"),5678);
            ds.send(dp);
            if(str.equals("白白")){
                break;
            }

            byte[] b = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(b,b.length);
            ds.receive(dp2);
            byte[] data = dp2.getData();
            String s = new String(data,0,dp2.getLength());
            System.out.println("反馈信息为："+s);
        }
        //无需关闭资源ds.close();
    }
}