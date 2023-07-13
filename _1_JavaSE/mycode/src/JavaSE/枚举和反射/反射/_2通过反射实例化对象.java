package JavaSE.枚举和反射.反射;

import JavaSE.面向对象小项目._1Person;

import java.io.FileReader;
import java.util.Properties;

public class _2通过反射实例化对象 {
    public static void main(String[] args) throws Exception{
        // 通过反射机制，获取Class，通过Class来实例化对象
        Class c = Class.forName("JavaSE.面向对象小项目._1Person");
        Class<_1Person> c2 = (Class<_1Person>) Class.forName("JavaSE.面向对象小项目._1Person");

        // newInstance() 这个方法会调用_1Person类的"无参数构造方法",完成对象的创建
        Object obj = c.newInstance();
        _1Person person = c2.newInstance();
        System.out.println(obj);System.out.println(person);



        // 以下代码是灵活的,代码不需要改动,可以修改配置文件,配置文件修改之后,可以创建出不同的实例对象
        // 通过IO流读取_2class.properties文件
        FileReader reader = new FileReader("mycode/src/_2class.properties");
        // 创建属性类对象Map
        Properties pro = new Properties(); // key value都是String
        pro.load(reader);// 加载

        String className = pro.getProperty("className");// 通过key获取value
        System.out.println(className);
        Class c3 = Class.forName(className);
        Object o = c3.newInstance();
        System.out.println((String)o);

        reader.close();// 关闭流
        /*
        Properties类继承自Hashtable，它是一个键值对集合，其中键和值都是字符串类型。
        属性文件中的每一行都表示一个键值对，以键值对的形式存储在Properties对象中。
        可以通过Properties对象的方法来读取、写入和操作属性文件的内容。
        Properties 类常用的方法包括：
               1、getProperty(String key): 根据键获取对应的值。
               2、setProperty(String key, String value): 设置指定键的值。
               3、load(InputStream inputStream): 从输入流加载属性文件的内容。
               4、store(OutputStream outputStream, String comments): 将属性文件的内容存储到输出流中。
               5、getProperty(String key, String defaultValue): 根据键获取对应的值，如果键不存在则返回默认值。
               6、stringPropertyNames(): 获取所有键的集合。
        */
    }
}
