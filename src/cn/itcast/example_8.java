package cn.itcast;

import java.util.*;

public class example_8 {
    public static void main(String[] args) {

        TreeMap treeMap = new TreeMap();
        treeMap.put(1,"tony");
        treeMap.put(2,"tom");
        treeMap.put(3,"xixi");
        treeMap.put(5,"lili");
        treeMap.put(4,"haha");

        // 方式一
//        Set set = treeMap.keySet();
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//            Object key = iterator.next();
//            Object val = treeMap.get(key);
//            System.out.println(key + ":" + val);
//        }

        // 方式二
        Set entrySet = treeMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry entryItem = (Map.Entry)iterator.next();
            Object key = entryItem.getKey();
            Object value = entryItem.getValue();
            System.out.println(key + ";" + value);


        }
    }
}
