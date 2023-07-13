package JavaSE.线程._15线程通信案例_同步代码块;

public class CustomerThread extends Thread{
    private Product p;//共享商品为Product引用数据类型
    public CustomerThread(Product p){//构造方法
        this.p = p;
    }

    @Override
    public void run() {
        for(int i=1;i<=200;i++){
            synchronized (p){//p引用地址唯一
                System.out.println("消费者消费了："+p.getBrand1()+p.getName1());
            }
        }
    }
}
