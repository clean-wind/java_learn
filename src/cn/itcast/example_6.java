package cn.itcast;

import java.util.ArrayList;
import java.util.Iterator;

public class example_6 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 97; i <= 106; i++ ){
            arrayList.add((char)i);
        }

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}
