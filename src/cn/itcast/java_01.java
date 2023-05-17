package cn.itcast;

public class java_01 {
    public java_01(){

    }
    static class v1{
        int ag = 0;
        static int ad = 0;
    }
    class v2{
        int dd = 0;
        int gd = 9;
    }

    static int gg = 0;
    int cc = 0;

    public static void test(){
        int i = 0;
        System.out.println(gg);
    }

    public void test2(){
        System.out.println(gg);
        System.out.println(cc);
    }

    public static void main(String[] args) {
        int[] x = new int[4];
        int[] a = new int[]{};
        int[] b = {};
    }
}

abstract class Aa{
    abstract void call();
    abstract void sleep();
    void sin(){}
}

interface Dd{
    abstract void call1();
    abstract void sleep();

}

class bb extends Aa{
    @Override
    void call() {

    }

    @Override
    void sleep() {

    }
}

class gg implements Dd{
    @Override
    public void call1() {

    }

    @Override
    public void sleep() {

    }
}

abstract class ag implements Dd{

}