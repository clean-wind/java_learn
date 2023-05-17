package cn.itcast;

import java.io.FileOutputStream;

public class FileOutputStreamLearn {
    public static void main( String[] args ) throws Exception{
        FileOutputStream out = new FileOutputStream("example.txt",true);
        String str = "传智播客";
        byte[] b = str.getBytes();
        for ( int i = 0; i < b.length; i++ ){
            out.write(b[i]);
        }
        out.close();
    }
}
