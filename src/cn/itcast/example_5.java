package cn.itcast;

import java.util.ArrayList;

public class example_5 implements Comparable {
    String name;
    public static void main(String[] args) {
        System.out.println("ss".compareTo("s"));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("aa");

    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
    