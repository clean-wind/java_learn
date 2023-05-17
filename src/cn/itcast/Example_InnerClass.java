package cn.itcast;

// 外部访问内部类: 外部类.内部类 变量名 = new 外部类().new 内部类();
// 外部创建静态内部类的实例对象： 外部类.内部类 变量名 = new 外部类.内部类();

public class Example_InnerClass {
    int out = 1;

    public static void main(String[] args) {
        Inner inner = new Inner();
        Example_InnerClass.Inner2 inner2 = new Example_InnerClass().new Inner2();
        outout outout = new outout(true);
    }
     static class Inner{
       static int a = 1;
    }

    class Inner2{
    }

    public void ss(){
         class Inner3{}
    }
}

@SuppressWarnings("all")
class outout{

    public outout(){
        System.out.println("无参的构造器");
    }
    public outout(int x){
        this();
        System.out.println("整型的构造器");
    }
    public outout(Boolean b){
        this(1);
        System.out.println("布尔值的构造器");
    }
    public static void main(String[] args) {
        Example_InnerClass.Inner inner = new Example_InnerClass.Inner();
        Example_InnerClass.Inner2 inner2 = new Example_InnerClass().new Inner2();
    }
}