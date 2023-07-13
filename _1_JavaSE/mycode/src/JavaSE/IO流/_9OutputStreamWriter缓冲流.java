package JavaSE.IO流;

import java.io.*;

public class _9OutputStreamWriter缓冲流 {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\大学\\File类辅助文件.txt");
        FileInputStream fis = new FileInputStream(f);
        //将字节流转换为字符流的形式输入程序
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");

        File f1 = new File("D:\\大学\\缓冲流.txt");
        FileOutputStream fos = new FileOutputStream(f1);
        //将字符流转换为字节流的形式输出程序
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        char[] ch = new char[20];
        int len;
        while((len=isr.read(ch))!=-1){
            osw.write(ch,0,len);
        }

        osw.close();
        isr.close();
    }
}
