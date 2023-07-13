package JavaSE.Junit测试;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _1CalculatorTest {
    @Before
    public void init(){
        System.out.println("测试方法开始了");
    }
    @After
    public void end(){
        System.out.println("测试方法结束了");
    }


    @Test
    public void testAdd(){
        _1Calculator cal = new _1Calculator();
        cal.add(5,6);
    }

    @Test
    public void testSub(){
        _1Calculator cal = new _1Calculator();
        int result = cal.sub(10,20);
        System.out.println("测试结果为:"+result);
        //加入断言：判断一下预测结果和实际结果是否一致
        Assert.assertEquals(-10,result);//报错，和预测结果不一致
    }

    @Test
    public void testDiv(){
        System.out.println("测试整数的除法");
        _1Calculator cal = new _1Calculator();
        System.out.println(cal.div(2,0));
    }
}
