package JavaSE.线程;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class _5线程的创建方法3 implements Callable <Integer> {
    //implements Callable/*<Object>*/可以不带泛型，那么call方法的返回值就是Object类型
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);//返回10以内的随机数
    }
}

class Test05{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        _5线程的创建方法3 trn = new _5线程的创建方法3();
        FutureTask ft = new FutureTask(trn);//FutureTask是Runnable的实现类
        Thread t = new Thread(ft);//只能传入Runnable的实现类对象
        t.start();
        Object obj = ft.get();//获取线程的返回值
        System.out.println(obj);
    }
}
