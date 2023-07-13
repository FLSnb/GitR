package JavaSE.线程;

public class _12同步方法 extends Thread{
    static int ticket = 100;
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            buyTicket();
        }
    }
    //同步方法
    public static synchronized void buyTicket(){//需加static修饰，使该方法被所有对象共享唯一
        if(ticket>=1) {
            System.out.println(Thread.currentThread().getName()+",买到了第"+(ticket--)+"张车票");
        }
    }
    public _12同步方法(String name){
        super(name);
    }
}

class Test12{
    public static void main(String[] args) {
        _12同步方法 one = new _12同步方法("1");
        _12同步方法 two = new _12同步方法("2");
        _12同步方法 three = new _12同步方法("3");
        one.start();
        two.start();
        three.start();
    }
}
