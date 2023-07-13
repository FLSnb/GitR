package JavaSE.IO流;

import java.io.*;
import JavaSE.面向对象小项目._1Person;

public class _12对象流 {
    public static void main(String[] args) throws Exception{
        _1Person one = new _1Person(20,"FLS");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\大学\\对象流.txt")));
        //将内存中的字符串对象写到文件中，文件中可能看起来像乱码形式
        oos.writeObject("你好Hello");
        oos.writeObject(one);//需要在自定义类_1Person implements Serializable，否则无法序列化，会报错

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\大学\\对象流.txt")));
        //读取文件中保存的字符串对象(乱码形式-->看懂的字符串形式)
        String s = (String)ois.readObject();
        System.out.println(s);
        _1Person P = (_1Person)ois.readObject();
        System.out.println(P);

        ois.close();
        oos.close();
    }
}
