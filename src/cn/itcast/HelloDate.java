package cn.itcast;

import java.text.DateFormat;
import java.util.*;

public class HelloDate {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,100);
        Date date = calendar.getTime();
        System.out.println(date);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        String date_100 = dateFormat.format(date);
        System.out.println(date_100);

        Map map = new HashMap();
        map.put(1,"hello");
        map.put(2,"marry");
        map.put(3,"july");
        Set set = map.keySet();
        Set set1 = map.entrySet();
        Iterator iterator = set.iterator();
        Iterator iterator1 = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
        while (iterator1.hasNext()){
            Map.Entry entry = (Map.Entry)iterator1.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ":" + value);
        }

    }
}
