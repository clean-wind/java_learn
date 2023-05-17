package cn.itcast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;

public class CollecgtionsLearn {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        Collections.addAll(list,"A","C","G","Z");
        System.out.println("排序前" + list);
        Collections.reverse(list);
        System.out.println("反转后" + list);
        Collections.sort(list);
        System.out.println("自然排序后" + list);
        System.out.println(Collections.binarySearch(list,"G"));
        Collections.shuffle(list);
        System.out.println("洗牌后" + list);
        Collections.swap(list,0,1);
        System.out.println("交换后"+list);
        System.out.println((5/4));
    }
}
