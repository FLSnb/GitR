package JavaSE.线程;

public class _6设置线程优先级 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=50;i++){
            System.out.print("1");
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=50;i++){
            System.out.print("2");
        }
    }
}

class Test06{
    public static void main(String[] args) {
        _6设置线程优先级 one = new _6设置线程优先级();
        Thread2 two = new Thread2();
        //设置优先级
        one.setPriority(1);
        two.setPriority(10);
        one.start();
        two.start();
    }
}
