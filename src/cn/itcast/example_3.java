package cn.itcast;

import java.util.Random;

public class example_3 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i<5; i++){
            System.out.println(r.nextInt(31) + 20);
        }
    }
}
