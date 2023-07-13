package JavaSE.线程;

public class _14死锁展示代码 implements Runnable{
    public int flag = 1;
    static Object o1 = new Object() , o2=new Object();
    @Override
    public void run() {
        System.out.println("flag="+flag);

        if(flag==1){
            synchronized (o1){
                try{
                    Thread.sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println("2");
                }
            }
        }

        if(flag==0){
            synchronized (o2){
                try{
                    Thread.sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println("1");
                }
            }
        }
    }
}

class Test14{
    public static void main(String[] args) {
        _14死锁展示代码 one = new _14死锁展示代码();
        _14死锁展示代码 two = new _14死锁展示代码();
        one.flag=1;two.flag=0;
        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);
        t1.start();
        t2.start();
    }
}
