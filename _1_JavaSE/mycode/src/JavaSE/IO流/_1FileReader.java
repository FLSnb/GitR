package JavaSE.IO流;

import java.io.File;
import java.io.FileReader;

public class _1FileReader {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\大学\\File类辅助文件.txt");
        FileReader fr = new FileReader(f);//需传入File对象

        //从文件中一个字符一个字符的读取，返回每个字符对应的ASCII码，读完全部字符时返回值为-1
        int n;
        while((n=fr.read()) != -1){
            System.out.print((char)n);//将返回值int类型转为字符类型
        }
        fr.close();//最后需手动关闭流


        System.out.println();


        File f2 = new File("D:\\大学\\File类辅助文件.txt");
        FileReader fr2 = new FileReader(f2);
        //从文件中一个字符数组一个字符数组的读取(同时读取多个字符)
        char[] ch = new char[5];
        int len;
        //循环遍历
        while ((len = fr2.read(ch)) != -1) {//len的值为当前数组中存储的元素个数,无元素时为-1
            // 处理读取到的字符数据
            for (int i = 0; i < len; i++) {
                char c = ch[i];
                System.out.print(c);
            }
        }
        fr2.close();//最后需手动关闭流
    }
}
