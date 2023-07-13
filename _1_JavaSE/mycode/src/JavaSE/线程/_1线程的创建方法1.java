package JavaSE.线程;

//继承Thread类，则创建的线程就会具备争抢资源的能力
public class _1线程的创建方法1 extends Thread{
    @Override
    //线程执行的任务，必须放在重写Thread类中的run方法中
    public void run() {
        for(int i=1;i<20;i++){
            System.out.print(super.getName());
        }
    }
    public _1线程的创建方法1(){}
    public _1线程的创建方法1(String name){
        super(name);//加入构造器后，可在创建线程时给线程取名字
    }
}

class Test{
    public static void main(String[] args) {
        Thread.currentThread().setName("1");//设置读取线程的名字
        //主线程中for循环
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }

        //制造另一个线程(_1线程)与主线程(main方法)争抢资源
        _1线程的创建方法1 tt = new _1线程的创建方法1("2");
        tt.start();//启动线程,会自动调用run()

        //由于启动了另一个线程,则两线程会竞争,输出2、3顺序交错
        for(int i=1;i<20;i++){
            System.out.print("3");
        }
    }
}
