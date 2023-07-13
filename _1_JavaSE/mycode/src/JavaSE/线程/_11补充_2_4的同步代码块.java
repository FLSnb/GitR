package JavaSE.线程;

public class _11补充_2_4的同步代码块 extends Thread{
    //创建一个专门的同步监视器，没有任何业务意义
    //需加static使其变为公有属性(所有对象共享唯一)，才能锁住
    //需加final修饰，保证不能在同步代码块中改变引用对象地址变化，但对象的属性值可以更改，只要地址不变即可
    final static Object o = new Object();
    static int ticket = 200;
    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            synchronized (o){//一般使用共享资源做同步监视器，但这里的ticket是基本类型，所以无法使用
                if(ticket>=1) {
                    System.out.println(Thread.currentThread().getName()+",买到了第"+(ticket--)+"张车票");}
            }
        }
    }
    public _11补充_2_4的同步代码块() {
    }
    public _11补充_2_4的同步代码块(String name) {
        super(name);
    }
}

class Test11{
    public static void main(String[] args) {
        _11补充_2_4的同步代码块 one = new _11补充_2_4的同步代码块("1");
        _11补充_2_4的同步代码块 two = new _11补充_2_4的同步代码块("2");
        _11补充_2_4的同步代码块 three = new _11补充_2_4的同步代码块("3");
        one.start();
        two.start();
        three.start();
    }
}