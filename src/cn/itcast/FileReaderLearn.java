package cn.itcast;

import java.io.FileReader;

public class FileReaderLearn {
    public static void main(String[] args) throws  Exception {
        FileReader inch = new FileReader("reader.txt");
        int len;
        while ( (len = inch.read()) != -1 ){
            System.out.println((char) len);
        }
        inch.close();
    }
}
