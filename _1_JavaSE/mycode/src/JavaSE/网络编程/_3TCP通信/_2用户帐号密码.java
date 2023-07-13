package JavaSE.网络编程._3TCP通信;

import java.io.Serial;
import java.io.Serializable;

public class _2用户帐号密码 implements Serializable {
    //需将自定义类进行序列化
    @Serial
    private static final long serialVersionUID = 6800823283812250230L;

    private int ZH;
    private String MM;

    public int getZH() {
        return ZH;
    }
    public void setZH(int ZH) {
        this.ZH = ZH;
    }
    public String getMM() {
        return MM;
    }
    public void setMM(String MM) {
        this.MM = MM;
    }

    public _2用户帐号密码(){}
    public _2用户帐号密码(int ZH, String MM) {
        this.ZH = ZH;
        this.MM = MM;
    }

    @Override
    public String toString() {
        return "_2用户帐号密码{" +
                "ZH=" + ZH +
                ", MM='" + MM + '\'' +
                '}';
    }
}
