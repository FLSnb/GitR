package JavaSE.IO流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class _3结合_1_2完成文件复制 {
    public static void main(String[] args) throws Exception {
        //源文件
        File f1 = new File("D:\\大学\\File类辅助文件.txt");
        //复制源文件的目标文件
        File f2 = new File("D:\\大学\\FileWriter类辅助文件.txt");

        FileReader fr = new FileReader(f1);//读取源文件
        FileWriter fw = new FileWriter(f2);//写入目标文件

        int n;
        while((n=fr.read()) != -1){
            fw.write((char)n);//边从源文件读，边往目标文件写
        }

        //最后一定需要手动关闭流操作！(倒着关，后用的先关)
        fw.close();
        fr.close();
    }
}
