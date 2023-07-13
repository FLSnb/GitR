package JavaSE.线程._15线程通信案例_同步方法;

public class ProducerThread extends Thread{
    private Product p;
    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for(int i=1;i<=200;i++){
            if(i%2==0){
                p.a("幸运","方便面");
            }
            else{
                p.a("康师傅","红烧牛肉面");
            }
        }
    }
}
