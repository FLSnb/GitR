package JavaSE.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class _1InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //封装ip
        //InetAddress ia = new InetAddress();构造方法被default(默认)修饰，无法外包中访问，无法直接创建对象
        InetAddress ia1 = InetAddress.getByName("192.168.32.123");
        System.out.println(ia1);

        InetAddress ia2 = InetAddress.getByName("localhost");//本地ip
        System.out.println(ia2);

        InetAddress ia3 = InetAddress.getByName("FLS");//按本机计算机名找ip
        System.out.println(ia3);

        InetAddress ia4 = InetAddress.getByName("www.baidu.com");//按域名找ip
        System.out.println(ia4);

        System.out.println(ia4.getHostName());//获取域名，返回值类型为String可直接输出
        System.out.println(ia4.getHostAddress());//获取ip，返回值类型为String可直接输出

    }
}
