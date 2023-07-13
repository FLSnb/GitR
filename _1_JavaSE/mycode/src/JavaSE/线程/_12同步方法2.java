package JavaSE.线程;

public class _12同步方法2 implements Runnable{
    int ticket = 20;
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            buyTicket02();
        }
    }
    //同步方法，3个Thread对象共用一个线程，则不需额外加static修饰
    public synchronized void buyTicket02(){
        if(ticket>=1) {
            System.out.println(Thread.currentThread().getName()+",买到了第"+ticket--+"张车票");
        }
    }
}

class Test122{
    public static void main(String[] args) {
        _12同步方法2 t = new _12同步方法2();
        //3个窗口共用一个线程对象t，则ticket不需额外加static修饰进行共享,且同步方法也不需要额外加static
        Thread t1 = new Thread(t,"1");
        t1.start();
        Thread t2 = new Thread(t,"2");
        t2.start();
        Thread t3 = new Thread(t,"3");
        t3.start();
    }
}
