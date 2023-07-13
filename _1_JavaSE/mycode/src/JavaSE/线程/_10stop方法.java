package JavaSE.线程;

public class _10stop方法 extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            System.out.print(i+",");
            if(i==10){
                Thread.currentThread().stop();
            }
        }
    }
}

class Test10{
    public static void main(String[] args) {
        _10stop方法 one = new _10stop方法();
        one.start();
    }
}
