package JavaSE.IO流;

import java.io.*;

public class _4处理异常 {
    public static void main(String[] args) {
        File f = new File("D:\\大学\\File类辅助文件.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(f,true);
            String str = "无敌奥特曼~";
            char[] chars = str.toCharArray();
            fw.write(chars);
            System.out.println("加入内容成功");
        } catch (IOException e) {
            System.out.println("加入内容失败");
            throw new RuntimeException(e);
        }

        finally {//必须执行关闭流操作，则需将其放入finally
            try {
                if(fw!=null){
                    fw.close();//防止空指针异常，因为上面只考虑了IO异常
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
