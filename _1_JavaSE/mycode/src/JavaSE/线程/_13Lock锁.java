package JavaSE.线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _13Lock锁 implements Runnable {
    int ticket = 20;
    //设置一把锁
    Lock lock = new ReentrantLock();//Lock接口不可以创建对象，则采用左接口右实现类
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            lock.lock();//打开锁
            try{
                if(ticket>=1) {
                    System.out.println(Thread.currentThread().getName()+",买到了第"+ticket--+"张车票");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }finally {//即使有异常，但也要关闭锁
                lock.unlock();//关闭锁
            }
        }
    }
}

class Test13{
    public static void main(String[] args) {
        _13Lock锁 t = new _13Lock锁();
        Thread t1 = new Thread(t,"1");
        t1.start();
        Thread t2 = new Thread(t,"2");
        t2.start();
        Thread t3 = new Thread(t,"3");
        t3.start();
    }
}
