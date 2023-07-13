package JavaSE.枚举和反射.反射;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class _3取类路径下文件的绝对路径 {
    public static void main(String[] args) throws Exception{
        /* new FileReader("mycode/src/_2class.properties");
           缺点: 移植性差, 在IDEA中默认的当前路径是project的根, 当代码离开IDEA则路径无效 */


        // 使用以下通用方式可保证路径有效, 但前提是文件必须在类路径下(src是类的根路径)
        /*   Thread.currentThread()   当前线程对象
             getContextClassLoader()  是线程对象的方法, 可以获取到当前线程的类加载器对象
             getResource() 【获取资源】这是类加载器对象的方法, 当前线程的类加载器默认从类的根路径下加载资源 */
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("_2class.properties").getPath(); //获取文件绝对路径
        System.out.println(path);//中文存在乱码

        FileReader fr = new FileReader(path);
        Properties pro = new Properties();
        pro.load(fr);
        String className = pro.getProperty("className");// 通过key获取value
        System.out.println(className);

        fr.close();



        // 直接以流的形式返回
        InputStream reader = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("_2class.properties");
        System.out.println(reader);

        Properties pro2 = new Properties();
        pro2.load(reader);
        String className2 = pro2.getProperty("className");// 通过key获取value
        System.out.println(className2);

        reader.close();
    }
}
