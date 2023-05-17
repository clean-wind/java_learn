package cn.itcast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example_FileInputStream {
    int aa = 1;
    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("test.txt");
//        int b = 0;
//        while (true){
//            b = fileInputStream.read();
//            if (b == -1){
//                break;
//            }
//            System.out.println(b);
//        }
//        fileInputStream.close();

//        FileOutputStream fileOutputStream = new FileOutputStream("example.txt",true);
//        String string = " welcome";
//        char[] chars = string.toCharArray();
//        for (int i = 0; i<chars.length;i++){
//            fileOutputStream.write(chars[i]);
//        }
//        fileOutputStream.close();

        FileInputStream Input = new FileInputStream("source/hello.mp3");
        FileOutputStream output = new FileOutputStream("target/hello1.mpe");
        int len;
        while ((len = Input.read()) != -1){
            output.write(len);
        }
        Input.close();
        output.close();
    }

    void test(){
         int i = 1;
        class Inner{
            void test(){
                System.out.println(i);
            }
        }
    }
}
