package cn.itcast;

import java.util.*;

public class example_4 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new LinkedList();

        list1.add("ww");
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);

        list2.add("qq");
        list2.add("cc");
        list2.add("dd");
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next();
            System.out.println(str);
        }
        Vector v = new Vector();
        Enumeration e = v.elements();
        Iterator Ie = v.iterator();
        ListIterator Le = v.listIterator(v.size());

        HashSet hashSet = new HashSet();
        hashSet.add("qq");

    }
}
