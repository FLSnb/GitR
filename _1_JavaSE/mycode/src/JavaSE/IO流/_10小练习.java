package JavaSE.IO流;

import java.io.*;

//将键盘录入的内容输出到文件当中
public class _10小练习 {
    public static void main(String[] args) throws Exception{
        InputStream in = System.in; //InputStream属于字节流
        //转换流，需将字节流-->字符流
        InputStreamReader isr = new InputStreamReader(in);
        //在isr外面再套个缓冲流，增加效率
        BufferedReader br = new BufferedReader(isr);

        File f = new File("D:\\大学\\小练习.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        //从键盘输入一行，输出到文件一行
        String s = br.readLine();
        while(!s.equals("exit")){//当输入exit停止键盘录入
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }

        bw.close();
        br.close();
    }
}
