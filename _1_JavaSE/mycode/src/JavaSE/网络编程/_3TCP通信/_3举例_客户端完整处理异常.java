package JavaSE.网络编程._3TCP通信;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class _3举例_客户端完整处理异常 {
    public static void main(String[] args){
        Socket s = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;
        InputStream is = null;
        DataInputStream dis = null;
        //需把这些移出来定义，否则万一try途中报错，则finally中找不到这些定义的变量

        try {
            s = new Socket("localhost",8888);
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入账号：");
            int ZH = sc.nextInt();
            System.out.print("请输入密码：");
            String MM = sc.next();
            _2用户帐号密码 one = new _2用户帐号密码(ZH,MM);

            os = s.getOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeObject(one);

            is = s.getInputStream();
            dis = new DataInputStream(is);
            Boolean flag = dis.readBoolean();
            if(flag){
                System.out.println("帐号密码正确，登陆成功");
            }
            else{
                System.out.println("帐号密码错误，登录失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //注：每一个“关闭”均用一个try-catch，能关一个是一个，不能放一起
            try {
                if(dis!=null){//防止空指针异常
                    dis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if(dis!=null){
                    oos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if(dis!=null){
                    s.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
