package JavaSE.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _6FileOutputStream {
    public static void main(String[] args) throws Exception{
        File f1 = new File("D:\\大学\\字节流图片.jpg");
        File f2 = new File("D:\\大学\\复制图片.jpg");
        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);

        /*复制操作方法1、
        int n = fis.read();
        while(n!=-1){
            fos.write(n);
            n = fis.read();
        }
        */

        //复制操作方法2、
        byte[] b = new byte[1024*6];
        int len;
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);//只写入数组中有效部分
            //注：如果直接fos.write(b)则会导致加入部分无效数据，导致图片字节数大小变大
        }

        fos.close();
        fis.close();
    }
}
