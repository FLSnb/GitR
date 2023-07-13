package JavaSE.线程;

public class _2火车票小练习 extends Thread {
    static int ticket = 50;//火车票需要被static修饰，被所有对象共有且统一
    @Override
    public void run() {
        //每个窗口有100个人在抢票，一共3个窗口，共300人抢50张票
        for(int i=1;i<=100;i++){
            synchronized (_2火车票小练习.class){//使用线程的字节码信息，可以使该类的对象共用一把锁(同步锁)
                if(ticket>=1) {
                    System.out.println(super.getName()+",买到了第"+(ticket--)+"张车票");
                }
            }
        }
    }
    public _2火车票小练习(){}
    public _2火车票小练习(String name){
        super(name);
    }
}

class Test02{
    public static void main(String[] args) {
        _2火车票小练习 one = new _2火车票小练习("1站口");
        _2火车票小练习 two = new _2火车票小练习("2站口");
        _2火车票小练习 three = new _2火车票小练习("3站口");
        one.start();
        two.start();
        three.start();
    }
}
