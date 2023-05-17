package cn.itcast;

import java.util.*;

public class Example_ListIterator {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("he");
        strings.add("ll");
        strings.add("o");
        Integer integer = new Integer(2);
        Integer integer1 = new Integer(2);
        System.out.println(strings);
        ListIterator<String> stringListIterator = strings.listIterator(strings.size());
        while (stringListIterator.hasPrevious()){
            if (stringListIterator.previous() == "ll"){
                stringListIterator.add("world");
            }
        }
        System.out.println(strings);
        System.out.println(integer1.compareTo(integer));
        System.out.println(11%10);
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        HashSet<String> strings1 = new HashSet<>();

        Set<Integer> integers = integerStringHashMap.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
        }
    }
}
abstract class Test12{
    public int a = 5;
    void method(){}
    public abstract void method(int a);
}

