package JavaSE.线程;

public class _7join方法 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=50;i++){
            System.out.print("1");
        }
    }
}

class Test07{
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=50;i++){
            if(i==20){
                _7join方法 one = new _7join方法();
                one.start();
                one.join();//先执行完子线程
            }
            System.out.print("2");
        }
    }
}
