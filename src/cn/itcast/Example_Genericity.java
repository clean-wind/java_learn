package cn.itcast;

import java.lang.reflect.Field;
import java.util.*;

public class Example_Genericity<T,E extends Number> {
    private T type;
    private E element;
    public Example_Genericity(){}
    public Example_Genericity(T type,E element){
        this.type = type;
        this.element = element;
    }
}

class UseGenericity{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        System.out.println(list.getClass());
        System.out.println(list.get(0).getClass());
        System.out.println();
        Example_Genericity<String, Integer> genericity = new Example_Genericity<>();
        Class<? extends Example_Genericity> genericityClass = genericity.getClass();
        //getDeclaredFields()：获得某个类的所有声明的字段，即包括public、private和protected，但是不包括父类的申明字段。
        Field[] fields = genericityClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType());
        }

    }
}