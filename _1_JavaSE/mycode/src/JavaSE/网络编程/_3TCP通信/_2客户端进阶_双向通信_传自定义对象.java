package JavaSE.网络编程._3TCP通信;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class _2客户端进阶_双向通信_传自定义对象 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",8888);

        //录入用户的账号和密码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        int ZH = sc.nextInt();
        System.out.print("请输入密码：");
        String MM = sc.next();
        //将账号密码封装为对象
        _2用户帐号密码 one = new _2用户帐号密码(ZH,MM);


        //向服务器端发送帐号密码
        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);//套个对象流
        oos.writeObject(one);

        //接收服务器端发送的反馈消息
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        Boolean flag = dis.readBoolean();
        if(flag){//flag就是布尔类型
            System.out.println("帐号密码正确，登陆成功");
        }
        else{
            System.out.println("帐号密码错误，登录失败");
        }

        //关闭流
        dis.close();
        oos.close();
        //关闭网络资源
        s.close();
    }
}
