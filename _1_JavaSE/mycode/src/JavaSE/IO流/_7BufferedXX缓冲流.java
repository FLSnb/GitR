package JavaSE.IO流;

import java.io.*;

public class _7BufferedXX缓冲流 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("D:\\大学\\字节流图片.jpg");
        File f2 = new File("D:\\大学\\复制图片.jpg");
        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);

        BufferedInputStream bis = new BufferedInputStream(fis);  //功能强化，加强FileInputStream，管中套管
        BufferedOutputStream bos = new BufferedOutputStream(fos);//功能强化，加强FileOutputStream，管中套管

        byte[] b = new byte[1024*6];
        int len = bis.read(b);
        while(len!=-1){//复制图片
            bos.write(b,0,len);
            //bos.flush();底层已经帮我们自动刷新缓冲区(flushBuffer()缓冲区存满的时候刷新)
            len = bis.read(b);
        }

        //倒着关闭流
        //只需关闭高级流(处理流)，那么里面套的字节流也会随之关闭
        bos.close();
        bis.close();
    }
}
