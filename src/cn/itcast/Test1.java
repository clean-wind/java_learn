package cn.itcast;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
//        new TickerThread().start();
//        new TickerThread().start();
//        new TickerThread().start();
//        new TickerThread().start();
//        Test2 test2 = null;
//        test2.found();

        Date d  = new Date();
        System.out.println(d);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(calendar.get(Calendar.MONTH) + 1);

        calendar.set(Calendar.MONTH,13);
        System.out.println(calendar.get(Calendar.MONTH)+1);
        calendar.setLenient(false);
        calendar.set(Calendar.MONTH,13);
//        System.out.println(calendar.get(Calendar.MONTH)+1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        System.out.println(simpleDateFormat.format(new Date()));
        char a = 'z';
        System.out.println((int)a);

    }

}

class Test2{
    static void found(){
        System.out.println("nihao");
    }
}

class TickerThread extends Thread{
    static int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0){
            if (ticket > 0){
                Thread th = Thread.currentThread();
                String thName = th.getName();
                System.out.println(thName + "出售" + ticket--);
            }
        }
        if (ticket<=0){
            System.gc();
        }
    }
}