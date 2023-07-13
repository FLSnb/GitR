package JavaSE.IO流;

import java.io.*;

public class _11数据流 {
    public static void main(String[] args) throws Exception {
        /*File f = new File("D:\\大学\\数据流.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);*/
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("D:\\大学\\数据流.txt")));

        dos.writeUTF("你好Hello");
        dos.writeBoolean(true);
        dos.writeChar('a');
        //注：文件中的内容无法看懂，是专门给程序看的(通过DataInputStream)


        DataInputStream dis = new DataInputStream(new FileInputStream(new File("D:\\大学\\数据流.txt")));
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        //注：输入文件的类型顺序，需和输出文件的类型顺序一致，否则报错

        dis.close();
        dos.close();
    }
}
