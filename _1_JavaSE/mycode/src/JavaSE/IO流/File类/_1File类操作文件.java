package JavaSE.IO流.File类;

import java.io.File;
import java.io.IOException;

public class _1File类操作文件 {
    public static void main(String[] args) {
        File f1 = new File("D:\\大学\\File类辅助文件.txt");//其中的“\”为转义字符，为了输出\
        //File.separator获取当前操作系统的路径拼接符号，优选下方
        File f2 = new File("D:"+File.separator+"大学"+File.separator+"File类辅助文件.txt");
        System.out.println(f1+" , "+f2);

        System.out.println("该地址文件是否存在 "+ f1.exists());
        System.out.println("是否是目录 "+ f1.isDirectory());
        System.out.println("是否是文件 "+ f1.isFile());
        System.out.println("文件的大小 " + f1.length());
        System.out.println("文件是否可读 "+f1.canRead());
        System.out.println("文件是否可写 "+f1.canWrite());
        System.out.println("文件的名字 "+f1.getName());
        System.out.println("文件的上级目录 "+f1.getParent());
        System.out.println("是否隐藏 " + f1.isHidden());

        File f3 = new File("D:\\大学\\File类辅助文件.txt");
        if(! f3.exists()){
            try {
                f3.createNewFile();//如果f3对应文件不存在，则创建文件
            } catch (IOException e) {}
        }
        System.out.println("绝对路径 " + f3.getAbsolutePath());
        System.out.println("相对路径 " + f3.getPath());
        System.out.println(f3);//toString打印出来的为相对路径
    }
}
