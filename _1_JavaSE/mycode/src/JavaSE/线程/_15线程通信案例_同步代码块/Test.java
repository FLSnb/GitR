package JavaSE.线程._15线程通信案例_同步代码块;

public class Test {
    public static void main(String[] args) {
        Product p = new Product();
        ProducerThread pt = new ProducerThread(p);//使用构造方法
        CustomerThread ct = new CustomerThread(p);//是用构造方法
        pt.start();
        ct.start();
    }
}
