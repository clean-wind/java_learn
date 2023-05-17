package cn.itcast;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public class Example_SuperClass {

    int a = 1;

    public Example_SuperClass(){
        System.out.println("父类构造方法");
    }

    int id;
    String name;
    private void speak(){
        System.out.println("hello");
    }

}

class Ordinary extends Example_SuperClass{

    int ii = super.id;
    int a = super.a;
    public Ordinary(){
        super();
    }

    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary();
    }

     void hello(){
//        super.speak();

    }
    void say(){
        this.hello();
    }
}

class AA{
    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary();
    }
}

class BB{}

class ccc extends BB{

}

class tryer{
    static void shout(BB bb){
        System.out.println("hello");
        System.out.println(bb.toString());
    }

    public static void main(String[] args) {
        ccc ccc = new ccc();
        BB bb = new BB();
        shout(ccc);
        shout(bb);
    }
}


class Father{

    int age = 30;
    void speak(){
        System.out.println("Father Speak");
    }

    public Father(){
        System.out.println("I am father");
    }
}

class Son extends Father {
    int age = 10;
    public Son(){
        System.out.println("I am son");
        System.out.println("my father is "+ super.age + "," +"I am" + this.age);
    }

    void say(){
        super.speak();
        System.out.println("Son Say");
    }
}

class UseClass{
     static float i;
     Method[] methods;
    public static void main(String[] args) {
        int a;
        Son son = new Son();
        son.say();
        System.out.println(i);
    }
}

class Parent {
    Parent() {
        System.out.println("调用父类构造方法!");
    }
    private static void staticParent() {
        System.out.println("调用父类静态方法");
    }
    private final void finalParent() {
        System.out.println("调用父类final方法");
    }
    private void printParent() {
        System.out.println("调用父类私有方法");
    }
}
class Child extends Parent {
    public void printChild() {
        System.out.println("调用子类公有方法");
    }
}
class Test {
    public static void main(String[] args) throws Exception {
        //获取子类
        Class clazz = Class.forName("work.litao.Child");
        //得到父类
        Class superClass = clazz.getSuperclass();
        //得到父类非继承的所以方法
        Method[] methods = superClass.getDeclaredMethods();
        //设置私有方法可以被访问
        AccessibleObject.setAccessible(methods, true);
        for (Method m: methods) {
            System.out.println();
            System.out.println("子类调用方法" + m.getName() + "()的调用结果:");
            m.invoke(new Child());
        }

    }
}