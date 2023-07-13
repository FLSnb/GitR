package JavaSE.线程;

public class _9setDaemon方法 extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=1000;i++) {
            System.out.print("A");
        }
    }
}

class Test09{
    public static void main(String[] args) {
        _9setDaemon方法 one = new _9setDaemon方法();
        one.setDaemon(true);
        one.start();
        for(int i=1;i<=10;i++){
            System.out.print(i);//当主线程输出完10之后，子线程随之停止
        }
    }
}
