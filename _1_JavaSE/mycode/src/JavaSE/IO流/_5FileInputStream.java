package JavaSE.IO流;

import java.io.File;
import java.io.FileInputStream;

public class _5FileInputStream {
    public static void main(String[] args) throws Exception{
        File f = new File("D:\\大学\\字节流图片.jpg");//字节流一般不读文本文件
        FileInputStream fis = new FileInputStream(f);
        int count=0;//用于计字节数
        int n = fis.read();//返回值为int而不是byte类型，防止byte=-1提前结束
        while(n!=-1){
            count++;//和图片右键查看属性显示字节数一致
            n = fis.read();
        }
        System.out.println(count);
        fis.close();//关闭流


        //利用缓冲数组一次读取多个字节
        File f1 = new File("D:\\大学\\字节流图片.jpg");
        FileInputStream fis1 = new FileInputStream(f1);
        count=0;//用于计字节数
        byte[] b = new byte[1024*6];//存储读取的字符的Unicode编码值,数组长度一般取1024的整数倍
        int len;
        while((len = fis1.read(b)) != -1){
            for(int i=0;i<len;i++){count++;}
        }
        System.out.println(count);
        fis1.close();//关闭流
    }
}
