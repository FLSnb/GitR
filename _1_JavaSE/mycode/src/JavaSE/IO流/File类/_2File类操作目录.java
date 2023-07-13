package JavaSE.IO流.File类;

import java.io.File;

public class _2File类操作目录 {
    public static void main(String[] args) {
        File m1 = new File("D:\\大学\\_File类辅助目录");

        System.out.println("该地址文件是否存在 "+ m1.exists());
        System.out.println("是否是目录 "+ m1.isDirectory());
        System.out.println("是否是文件 "+ m1.isFile());
        System.out.println("文件的大小 " + m1.length());
        //。。。。等等，和操作文件里的方法一致

        //只跟目录相关的方法
        File m2 = new File("D:\\大学\\_File类辅助目录\\单层目录");
        m2.mkdir();   //创建单层目录
        File m3 = new File("D:\\大学\\_File类辅助目录\\多层目录\\1\\2");
        m3.mkdirs();  //创建多层目录

        m3.delete();  //仅删除了2目录，前面的\多层目录\1仍在，且仅在目录为空下可删除，否则删除失败


        File m4 = new File("D:\\大学");
        String[] list = m4.list();
        for(String s:list){//遍历目录下所有,  方法1、
            System.out.print(s+",");
        }
        System.out.println("\n........................................");
        File[] files = m4.listFiles();
        for(File f:files){//遍历目录下所有,   方法2、
            System.out.print(f+",");
        }
    }
}
