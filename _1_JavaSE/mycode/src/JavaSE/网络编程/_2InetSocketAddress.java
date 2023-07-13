package JavaSE.网络编程;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class _2InetSocketAddress {
    public static void main(String[] args) {
        //构造方法传入ip和端口号
        InetSocketAddress isa = new InetSocketAddress("192.168.32.123",8080);
        System.out.println(isa);

        InetAddress address = isa.getAddress(); // 获取地址
        System.out.println(address);

        int port = isa.getPort(); // 获取端口号
        System.out.println(port);

        String hostName = isa.getHostName(); // 获取主机名
        System.out.println(hostName);

        String hostAddress = isa.getHostString(); // 获取主机地址
        System.out.println(hostAddress);

        boolean isIPv4 = address instanceof Inet4Address; // 判断是否为 IPv4 地址
        boolean isIPv6 = address instanceof Inet6Address; // 判断是否为 IPv6 地址
        System.out.println(isIPv4+","+isIPv6);

        boolean isLinkLocal = address.isLinkLocalAddress(); // 判断是否为链接本地地址
        System.out.println(isLinkLocal);
    }
}
