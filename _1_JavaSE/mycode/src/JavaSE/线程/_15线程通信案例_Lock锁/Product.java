package JavaSE.线程._15线程通信案例_Lock锁;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Product {
    private String brand1;
    private String name1;
    public String getBrand1() {
        return brand1;
    }
    public void setBrand1(String brand1) {
        this.brand1 = brand1;
    }
    public String getName1() {
        return name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }

    boolean flag = false;//开始物品个数为0

    //声明一个Lock锁
    Lock lock = new ReentrantLock();
    //创建一个生产者的“等待池”
    Condition productCondition = lock.newCondition();
    //创建一个消费者的“等待池”
    Condition consumeCondition = lock.newCondition();

    public void a(String brand1,String name1) {
        lock.lock();//打开锁
        try{
            if(flag==true){
                try {
                    productCondition.await();//若物品个数不为0,则让生产者进入生产者的“等待池”中等待
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.setBrand1(brand1);
            this.setName1(name1);
            System.out.println("生产者生产的是："+this.getBrand1()+this.getName1());
            flag = true;//生产了新物品
            consumeCondition.signal();//让消费者从消费者的“等待池”中出来运行
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();//关闭锁
        }
    }

    public void b() {
        lock.lock();//打开锁
        try{
            if(flag==false){
                try {
                    consumeCondition.await();//让消费者进入消费者的“等待池”中等待
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("消费者消费了："+this.getBrand1()+this.getName1());
            flag = false;
            productCondition.signal();//让生产者从生产者的“等待池”中出来运行
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();//关闭锁
        }
    }
}
