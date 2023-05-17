package cn.itcast;

import java.io.*;

public class FileInputStreamLearn {
    public static void main( String[] args ) throws Exception{
        FileInputStream in = new FileInputStream("test.txt");
        int b = 0; // 用于记住每一次读取的字节
        while(true){
            b = in.read();
            if ( b == -1 ){
                break;
            }
            System.out.println((char)b);
        }
        in.close();
    }
}
