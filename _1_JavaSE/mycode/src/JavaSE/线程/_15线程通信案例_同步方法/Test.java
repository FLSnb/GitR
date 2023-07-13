package JavaSE.线程._15线程通信案例_同步方法;

public class Test {
    public static void main(String[] args) {
        Product p = new Product();
        ProducerThread pt = new ProducerThread(p);
        CustomerThread ct = new CustomerThread(p);
        pt.start();
        ct.start();
    }
}
