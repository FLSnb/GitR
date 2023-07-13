package JavaSE.IO流;

import java.io.File;
import java.io.FileWriter;

public class _2FileWriter {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\大学\\FileWriter类辅助文件.txt");
        //如果目标文件不存在，则会自动创建此文件，并在文件中写入下面内容！
        FileWriter fw =  new FileWriter(f);//需传入File对象
        //如果目标文件存在，且需要写入内容时覆盖原来的数据，而不是添加在原内容之后！
        FileWriter fw1 = new FileWriter(f,false);//(不写时默认为false)
        //如果目标文件存在，且需要写入内容时添加在原内容之后，而不是覆盖！
        FileWriter fw2 = new FileWriter(f,true);

        String str = "AAA";
        for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));//按一个字符一个字符写入文件
        }

        fw1.write("BBB");

        String str3 = "CCC";
        char[] chars = str3.toCharArray();//将字符串转化为字符数组
        fw2.write(chars);//将字符数组传入，多个字符多个字符写入文件

        //关闭流不能少！不关闭流，则操作无效！！
        fw.close();
        fw1.close();
        fw2.close();
        //注！！关闭流的顺序不同，则得到的结果不同
    }
}
