package cn.itcast;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.ListIterator;


/**
 * 1、抽象类可以继承抽象类
 * 2、抽象类不可以继承接口
 * 3、抽象类可以实现接口
 *
 * 4、接口不可以继承抽象类
 * 5、接口可以继承其他接口
 */
public class HelloWorld {
    public static void main( String[] args ) throws  Exception{
//        System.out.println("hello world");
//        Thread minPriority = new Thread( new MinPriority(), "优先级较低" );
//        Thread maxPriority = new Thread( new MaxPriority(), "优先级较高" );
//        minPriority.setPriority(Thread.MIN_PRIORITY );
//        maxPriority.setPriority(Thread.MAX_PRIORITY);
//
//        maxPriority.start();
//        minPriority.start();


        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        calendar.setTime(date);
        System.out.println((char)122);
        String s = new String("Hello World");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = s.length()-1; i >= 0; i--){
            if ( (int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90 ){
                stringBuffer.append(s.substring(i,i+1).toLowerCase());
            }else if ( (int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122 ){
                stringBuffer.append(s.substring(i,i+1).toUpperCase());
            }else{
                stringBuffer.append(s.substring(i,i+1));
            }

        }
        System.out.println(stringBuffer.toString());
//        Ticket1 ticket1 = new Ticket1();
//
//        new Thread( ticket1,"线程二" ).start();
//        new Thread( ticket1,"线程一" ).start();
//        new Thread( ticket1,"线程三" ).start();
//        new Thread( ticket1,"线程四" ).start();

    }
}


interface A {
    public  void a();
}
interface D {
    void D();
}

abstract class B {
    public abstract void b();
}
abstract class C {
    public abstract void c();
}


// 定义Ticket1类实现Runnable接口
class Ticket1 implements Runnable{

    private int tickets = 10;
    Object lock = new Object();
    @Override
    public void run() {
        while( true ){
            synchronized (lock){
                try{
                    Thread.sleep(10);
                }catch ( InterruptedException e ){
                    e.printStackTrace();
                }
                if ( tickets > 0 ){
                    System.out.println( Thread.currentThread().getName() + "---卖出的票" + tickets-- );
                }else {
                    break;
                }
            }
        }
    }
}

// 定义SleepThread类实现Runnable接口测试线程睡眠
class SleepThread implements Runnable{
    @Override
    public void run() {
        for ( int i = 0; i < 10; i++ ){
            if ( i == 3 ){
                try{
                    Thread.sleep(2000);
                }catch ( InterruptedException e ){
                    e.printStackTrace();
                }
            }
            System.out.println( "线程一正在输出-----" + i );

            try {
                Thread.sleep(500);
            }catch ( InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}

// 优先级低的线程
class MinPriority implements Runnable{
    @Override
    public void run() {
        for ( int i = 0; i < 10; i++ ){
            System.out.println(Thread.currentThread().getName() + "正在输出：" + i);
        }
    }
}

// 优先级高的线程
class MaxPriority implements Runnable{
    @Override
    public void run() {
        for ( int i = 0; i < 10; i++ ){
            System.out.println( Thread.currentThread().getName() + "正在输出" + i );
        }
    }
}

// 实现Runnbale接口的多线程
class MyRunnAble implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Runnable is running");
        }
    }
}

// 继承Thread接口的多线程
class MyThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("MyThread is running");
        }
    }
}