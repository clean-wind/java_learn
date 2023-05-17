package cn.itcast;

import java.awt.*;

public class Example_SynClass {
}

class Store{
    private int[] ceils = new int[10];
    private int inpos,outpos,count;

    public synchronized void put(int num){
        try {
            while(count == ceils.length){
                this.wait();
            }
            ceils[inpos] = num;
            System.out.println("存入ceils[" + inpos + "]数据" + num);
            inpos++;
            count++;
            if (inpos == ceils.length){
                inpos = 0;
            }
            this.notify();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public synchronized void get(){
        try {
            while(count == 0){
                this.wait();
            }

            System.out.println("取出ceils[" + outpos + "]数据" + ceils[outpos]);
            ceils[outpos] = 0;
            outpos++;
            count--;
            if (outpos == ceils.length){
                outpos = 0;
            }
            this.notify();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}


class Input implements Runnable{
    private Store store;
    private int num;

    public Input(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            store.put(num++);
        }
    }
}


class Output implements Runnable{
    private Store store;
    public Output(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            store.get();
        }
    }
}


class Test_01{
    public static void main(String[] args) {
        Store store = new Store();
        Input input = new Input(store);
        Output output = new Output(store);
        new Thread(input).start();
        new Thread(output).start();
    }
}

 class A2{
    public static void main(String[] args){
        int[] a={2,4,6,8,3,6,9,12};
        doSomething(a,0,a.length-1);
        for(int i=0;i<=a.length-1;i++)
            System.out.print(a[i]+" ");
    }
    private static void doSomething(int[] a,int start,int end){
        if(start<end){
            int p=core(a,start,end);
            doSomething(a,start,p-1);
            doSomething(a,p+1,end);
        }
    }
    private static int core(int[] a,int start,int end)
    {
        int x=a[end];
        int i=start;
        for(int j=start;j<=end-1;j++){
            if(a[j]>=x){
                swap(a,i,j);
                i++;
            }
        }
        swap(a,i,end);
        return i;
    }

    private static void swap(int[] a,int i,int j)
    {
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
