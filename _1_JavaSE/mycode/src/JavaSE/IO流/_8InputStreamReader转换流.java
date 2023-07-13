package JavaSE.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class _8InputStreamReader转换流 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:\\大学\\File类辅助文件.txt");
        FileInputStream fis = new FileInputStream(f);//字节流
        //利用缓冲流将字节流转换为"字符流", 且需要指定一个编码，跟文件本身编码格式需统一
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");

        char[] ch = new char[20];//字符流用char数组接收
        int len = isr.read(ch);  //len=数组中有效字符个数
        while(len!=-1){
            //将缓冲字符数组转为字符串打印
            System.out.print(new String(ch,0,len));
            len = isr.read(ch);
        }

        //只需关闭高级流
        isr.close();
    }
}
