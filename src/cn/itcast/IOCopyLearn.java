package cn.itcast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOCopyLearn {
    public static void main(String[] args) throws Exception {
        // 创建字节输入流，读取当前目录source下的style.MP3文件
        FileInputStream in = new FileInputStream("source//style.mp3");
        // 创建字节输出流，将读取的数据写入target目录下的文件中
        FileOutputStream out = new FileOutputStream("target//style.mp3");
        int len; // 定义变量用于记住每次读取的一个字节
        long begintime = System.currentTimeMillis();
        while( (len = in.read()) != -1 ){
            out.write(len);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("拷贝文件消耗的时间是：" + (endtime - begintime) + "毫秒");
        in.close();
        out.close();
    }
}
