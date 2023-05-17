package cn.itcast;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class example_7 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Person("haha"));
        hashSet.add(new Person("tom"));
        hashSet.add(new Person("tony"));
        hashSet.add(new Person("tony"));
        for (Object o : hashSet) {
            System.out.println(o.toString());
        }

    }
}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Person)){
            return false;
        }
        Person obj1 = (Person) obj;
        return this.name.equals(obj1.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Person1 implements Comparable{
    String name;

    @Override
    public String toString() {
        return name;
    }

    public Person1(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Person1 o1 = (Person1) o;
        return this.name.compareTo(o1.name);
    }
}