package JavaSE.线程;

public class _4火车票小练习 implements Runnable{
    int ticket = 20;
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            //因为3个窗口共用一个线程对象t，t加上同步锁之后，会按照20、19...1的顺序，而不会出现争抢乱序的情况
            synchronized (this){
                if(ticket>=1) {
                    System.out.println(Thread.currentThread().getName()+",买到了第"+ticket--+"张车票");
                }
            }
        }
    }
}

class Test04{
    public static void main(String[] args) {
        _4火车票小练习 t = new _4火车票小练习();
        //3个窗口共用一个线程对象t，则ticket不需额外加static修饰进行共享
        Thread t1 = new Thread(t,"1窗口");
        t1.start();
        Thread t2 = new Thread(t,"2窗口");
        t2.start();
        Thread t3 = new Thread(t,"3窗口");
        t3.start();
    }
}
