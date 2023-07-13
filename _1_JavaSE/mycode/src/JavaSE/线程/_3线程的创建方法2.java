package JavaSE.线程;

public class _3线程的创建方法2 implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<23;i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}

class Test03{
    public static void main(String[] args) {
        for (int i=1;i<6;i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }

        _3线程的创建方法2 tt = new _3线程的创建方法2();
        //Runnable中没有start方法，所以需要先创建Thread对象
        Thread t = new Thread(tt);//构造方法中传入一个Runnable的实现类对象
        t.start();

        for (int i=6;i<23;i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
